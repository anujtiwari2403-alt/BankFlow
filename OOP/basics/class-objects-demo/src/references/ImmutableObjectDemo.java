package references;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableObjectDemo {

    // ========== COMPLETE IMMUTABLE CLASS RECIPE ==========
    // 1. Class is final (cannot be subclassed)
    // 2. All fields are private final
    // 3. No setters
    // 4. Defensive copy of mutable arguments in constructor
    // 5. Defensive copy (or unmodifiable view) when returning mutable fields
    static final class ImmutableStudent {
        private final String name;
        private final int age;
        private final List<String> courses; // mutable type!

        ImmutableStudent(String name, int age, List<String> courses) {
            this.name = name;
            this.age = age;
            this.courses = new ArrayList<>(courses); // defensive copy in constructor
        }

        String getName() { return name; }
        int getAge() { return age; }
        List<String> getCourses() {
            return Collections.unmodifiableList(courses); // defensive copy in getter
        }

        @Override
        public String toString() {
            return "ImmutableStudent{name='" + name + "', age=" + age + ", courses=" + courses + "}";
        }
    }

    // ========== INSTANCE INITIALIZER BLOCK ==========
    static class InitBlockDemo {
        private String status;
        private int value;

        // Instance initializer block: runs BEFORE every constructor
        {
            System.out.println("  [Instance initializer] Running before constructor");
            status = "initialized";
            value = -1;
        }

        InitBlockDemo() {
            System.out.println("  [Constructor] No-arg constructor");
        }

        InitBlockDemo(int value) {
            System.out.println("  [Constructor] Parameterized constructor, value=" + value);
            this.value = value;
        }

        @Override
        public String toString() {
            return "InitBlockDemo{status='" + status + "', value=" + value + "}";
        }
    }

    public static void run() {
        // --- Immutable object ---
        System.out.println("--- Immutable Object Pattern ---");
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("SQL");

        ImmutableStudent student = new ImmutableStudent("Alice", 21, courses);
        System.out.println("Created: " + student);

        // Try to modify the original list
        courses.add("Python");
        System.out.println("After adding 'Python' to original list:");
        System.out.println("  Original list: " + courses);
        System.out.println("  Student courses: " + student.getCourses() + " (unchanged - defensive copy)");

        // Try to modify through getter
        try {
            student.getCourses().add("Hacking");
        } catch (UnsupportedOperationException e) {
            System.out.println("  Trying to add via getCourses(): UnsupportedOperationException (unmodifiable)");
        }

        System.out.println();
        System.out.println("IMMUTABLE CLASS RECIPE:");
        System.out.println("  1. Class is final");
        System.out.println("  2. All fields private final");
        System.out.println("  3. No setters");
        System.out.println("  4. Defensive copy of mutable args in constructor");
        System.out.println("  5. Return unmodifiable view from getters");

        // --- Instance initializer block ---
        System.out.println();
        System.out.println("--- Instance Initializer Block ---");
        System.out.println("Creating with no-arg constructor:");
        InitBlockDemo obj1 = new InitBlockDemo();
        System.out.println("  Result: " + obj1);

        System.out.println("Creating with parameterized constructor:");
        InitBlockDemo obj2 = new InitBlockDemo(42);
        System.out.println("  Result: " + obj2);

        System.out.println("Order: instance initializer -> constructor (every time)");

        // --- GC eligibility basics ---
        System.out.println();
        System.out.println("--- Garbage Collection Basics ---");
        System.out.println("  An object becomes eligible for GC when no live reference points to it:");
        System.out.println("  1. Setting reference to null:    obj = null;");
        System.out.println("  2. Reassigning reference:        obj = new Other();");
        System.out.println("  3. Object created inside method: goes out of scope when method returns");
        System.out.println("  4. Island of isolation: A->B, B->A, but nothing else references A or B");
        System.out.println("  NOTE: System.gc() is just a REQUEST, JVM may ignore it.");
    }
}
