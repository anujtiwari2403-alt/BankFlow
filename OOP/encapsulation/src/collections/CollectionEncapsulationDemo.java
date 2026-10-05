package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionEncapsulationDemo {

    // ========== BAD: Exposes internal list directly ==========
    static class UnsafeTeam {
        private List<String> members = new ArrayList<>(List.of("Alice", "Bob"));

        public List<String> getMembers() {
            return members;  // BAD: returns the ACTUAL internal list
        }

        @Override
        public String toString() { return "UnsafeTeam{members=" + members + "}"; }
    }

    public static void run() {
        // --- Unsafe exposure ---
        System.out.println("--- Unsafe Collection Exposure ---");
        UnsafeTeam team = new UnsafeTeam();
        System.out.println("  Before: " + team);

        List<String> leaked = team.getMembers();
        leaked.add("INTRUDER");
        leaked.remove("Alice");
        System.out.println("  After external modification: " + team);
        System.out.println("  -> Caller mutated internal state through the returned reference!");

        // --- Safe exposure with Classroom ---
        System.out.println();
        System.out.println("--- Safe Collection Encapsulation (Classroom) ---");
        Classroom cs101 = new Classroom("CS-101");
        cs101.addStudent("Alice");
        cs101.addStudent("Bob");
        cs101.addStudent("Charlie");
        cs101.addStudent("Alice");   // duplicate, rejected
        cs101.addStudent("");        // blank, rejected
        System.out.println("  " + cs101);

        System.out.println();
        System.out.println("  Attempting to modify returned list:");
        List<String> students = cs101.getStudents();
        try {
            students.add("HACKER");
        } catch (UnsupportedOperationException e) {
            System.out.println("    Caught UnsupportedOperationException!");
            System.out.println("    -> getStudents() returns an unmodifiable view. Safe!");
        }

        System.out.println();
        cs101.removeStudent("Bob");
        cs101.removeStudent("NonExistent");
        System.out.println("  After removal: " + cs101);

        // --- Comparison of approaches ---
        System.out.println();
        System.out.println("--- Approaches to Protect Collections ---");

        List<String> original = new ArrayList<>(List.of("X", "Y", "Z"));

        System.out.println();
        System.out.println("1) Collections.unmodifiableList(list):");
        List<String> unmod = Collections.unmodifiableList(original);
        System.out.println("   Returns a VIEW backed by the original list.");
        System.out.println("   If original changes, the view reflects it.");
        original.add("W");
        System.out.println("   original.add(\"W\") -> unmod = " + unmod + " (reflects change!)");
        original.remove("W");

        System.out.println();
        System.out.println("2) List.copyOf(list) (Java 10+):");
        List<String> copied = List.copyOf(original);
        System.out.println("   Returns an INDEPENDENT immutable copy.");
        original.add("W");
        System.out.println("   original.add(\"W\") -> copied = " + copied + " (not affected!)");
        original.remove("W");

        System.out.println();
        System.out.println("3) List.of(...) (Java 9+):");
        List<String> fixed = List.of("A", "B", "C");
        System.out.println("   Creates an immutable list: " + fixed);
        try {
            fixed.add("D");
        } catch (UnsupportedOperationException e) {
            System.out.println("   fixed.add(\"D\") -> UnsupportedOperationException");
        }

        System.out.println();
        System.out.println("4) new ArrayList<>(list):");
        List<String> defensiveCopy = new ArrayList<>(original);
        System.out.println("   Creates a MUTABLE independent copy: " + defensiveCopy);
        System.out.println("   Caller can modify their copy without affecting the original.");

        System.out.println();
        System.out.println("BEST PRACTICE:");
        System.out.println("  - Getters: return Collections.unmodifiableList() or List.copyOf()");
        System.out.println("  - Setters: store new ArrayList<>(input) (defensive copy)");
        System.out.println("  - Mutation: provide addX() / removeX() methods with validation");
        System.out.println("  - NEVER return the raw internal list to callers!");
    }
}
