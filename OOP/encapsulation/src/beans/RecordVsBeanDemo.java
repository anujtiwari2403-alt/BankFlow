package beans;

public class RecordVsBeanDemo {

    // ========== Record (Java 16+): immutable, concise data carrier ==========
    public record UserRecord(String name, String email, int age) {

        // Compact constructor: validation without repeating parameter assignments
        public UserRecord {
            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException("Name cannot be blank");
            }
            if (age < 0 || age > 150) {
                throw new IllegalArgumentException("Age must be between 0 and 150, got: " + age);
            }
        }

        // Custom methods are allowed in records
        public String displayName() {
            return name.toUpperCase() + " (" + email + ")";
        }
    }

    // WON'T COMPILE: records are implicitly final, cannot extend them
    // class ExtendedRecord extends UserRecord { }

    // WON'T COMPILE: records cannot extend other classes (they already extend java.lang.Record)
    // record BadRecord(int x) extends SomeClass { }

    public static void run() {
        System.out.println("--- Records (Java 16+) ---");

        UserRecord rec = new UserRecord("Alice", "alice@example.com", 28);
        System.out.println("  Created: " + rec);
        System.out.println("  Auto-generated toString(): includes all components");

        System.out.println();
        System.out.println("  Accessor methods (no 'get' prefix):");
        System.out.println("    rec.name()  = " + rec.name());
        System.out.println("    rec.email() = " + rec.email());
        System.out.println("    rec.age()   = " + rec.age());

        System.out.println();
        System.out.println("  Auto-generated equals() and hashCode():");
        UserRecord rec2 = new UserRecord("Alice", "alice@example.com", 28);
        System.out.println("    rec.equals(rec2) = " + rec.equals(rec2) + " (same content)");
        System.out.println("    rec == rec2       = " + (rec == rec2) + " (different objects)");

        System.out.println();
        System.out.println("  Custom method: rec.displayName() = " + rec.displayName());

        // Compact constructor validation
        System.out.println();
        System.out.println("  Compact constructor validation:");
        try {
            new UserRecord("", "bad@example.com", 25);
        } catch (IllegalArgumentException e) {
            System.out.println("    UserRecord(\"\", ...) -> " + e.getMessage());
        }
        try {
            new UserRecord("Bob", "bob@example.com", -5);
        } catch (IllegalArgumentException e) {
            System.out.println("    UserRecord(..., -5) -> " + e.getMessage());
        }

        // Records are immutable: no setters
        // WON'T COMPILE: record components are final
        // rec.name = "Changed";

        // Records are implicitly final
        System.out.println();
        System.out.println("  Records are implicitly FINAL (cannot be extended).");
        System.out.println("  Records cannot extend other classes (already extend java.lang.Record).");
        System.out.println("  Records CAN implement interfaces.");

        // --- Comparison ---
        System.out.println();
        System.out.println("--- Record vs JavaBean Comparison ---");
        System.out.println("  +------------------+-------------------+------------------+");
        System.out.println("  | Feature          | JavaBean          | Record           |");
        System.out.println("  +------------------+-------------------+------------------+");
        System.out.println("  | Mutability       | Mutable (setters) | Immutable        |");
        System.out.println("  | Boilerplate      | Verbose           | Concise          |");
        System.out.println("  | equals/hashCode  | Manual            | Auto-generated   |");
        System.out.println("  | toString         | Manual            | Auto-generated   |");
        System.out.println("  | No-arg ctor      | Required          | Not applicable   |");
        System.out.println("  | Getter naming    | getXxx() / isXxx()| xxx() (no get)   |");
        System.out.println("  | Serializable     | Explicit          | Explicit         |");
        System.out.println("  | Framework support| Excellent         | Growing          |");
        System.out.println("  | Inheritance      | Can extend        | Cannot extend    |");
        System.out.println("  +------------------+-------------------+------------------+");
    }
}
