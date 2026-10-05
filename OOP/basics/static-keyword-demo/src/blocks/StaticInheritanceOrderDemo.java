package blocks;

public class StaticInheritanceOrderDemo {

    // ========== PARENT CLASS ==========
    static class Parent {
        static {
            System.out.println("  1. [Parent STATIC block]");
        }

        {
            System.out.println("  3. [Parent INSTANCE block]");
        }

        Parent() {
            System.out.println("  4. [Parent CONSTRUCTOR]");
        }
    }

    // ========== CHILD CLASS ==========
    static class Child extends Parent {
        static {
            System.out.println("  2. [Child STATIC block]");
        }

        {
            System.out.println("  5. [Child INSTANCE block]");
        }

        Child() {
            System.out.println("  6. [Child CONSTRUCTOR]");
        }
    }

    public static void run() {
        System.out.println("--- Class Loading Order Across Inheritance ---");
        System.out.println("Creating new Child():");
        System.out.println();
        new Child();

        System.out.println();
        System.out.println("ORDER:");
        System.out.println("  1. Parent static block  (parent class loads first)");
        System.out.println("  2. Child static block   (child class loads next)");
        System.out.println("  3. Parent instance block (parent initializes first)");
        System.out.println("  4. Parent constructor");
        System.out.println("  5. Child instance block  (child initializes next)");
        System.out.println("  6. Child constructor");
        System.out.println();
        System.out.println("Static blocks run ONCE (on class load).");
        System.out.println("Instance blocks + constructors run EACH time an object is created.");

        System.out.println();
        System.out.println("Creating second Child():");
        new Child();
        System.out.println("  -> Static blocks did NOT run again (already loaded)");

        // --- Static and serialization ---
        System.out.println();
        System.out.println("--- Static & Serialization (interview note) ---");
        System.out.println("  Static fields are NOT serialized (they belong to the class, not the object).");
        System.out.println("  After deserialization, static fields have whatever value the class");
        System.out.println("  currently has in the JVM, NOT the value at serialization time.");

        // --- Thread safety of static fields ---
        System.out.println();
        System.out.println("--- Thread Safety of Static Fields ---");
        System.out.println("  Static fields are shared across ALL threads.");
        System.out.println("  Without synchronization, concurrent writes cause RACE CONDITIONS.");
        System.out.println("  Solutions: synchronized, volatile, AtomicInteger, etc.");

        // --- Memory model ---
        System.out.println();
        System.out.println("--- Memory Model (where static lives) ---");
        System.out.println("  Static members stored in: Method Area (Java 7: PermGen, Java 8+: Metaspace)");
        System.out.println("  Instance members stored in: Heap (one copy per object)");
        System.out.println("  Local variables stored in: Stack (one copy per thread/method call)");
    }
}
