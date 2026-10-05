package methods;

public class StaticFactoryDemo {

    // ========== STATIC FACTORY METHOD PATTERN ==========
    static class Color {
        private final int r, g, b;
        private final String name;

        // Private constructor: forces use of factory methods
        private Color(int r, int g, int b, String name) {
            this.r = r; this.g = g; this.b = b; this.name = name;
        }

        // Factory method: descriptive name
        public static Color of(int r, int g, int b) {
            return new Color(r, g, b, "custom");
        }

        // Factory method: returns pre-defined instances (caching)
        public static Color valueOf(String name) {
            switch (name.toLowerCase()) {
                case "red":   return new Color(255, 0, 0, "red");
                case "green": return new Color(0, 255, 0, "green");
                case "blue":  return new Color(0, 0, 255, "blue");
                default: throw new IllegalArgumentException("Unknown color: " + name);
            }
        }

        @Override
        public String toString() {
            return name + "(" + r + "," + g + "," + b + ")";
        }
    }

    // ========== STATIC METHODS IN INTERFACES (Java 8+) ==========
    interface Validator {
        boolean isValid(String input);

        // Static method in interface: NOT inherited by implementors
        static Validator nonEmpty() {
            return input -> input != null && !input.isEmpty();
        }

        static Validator maxLength(int max) {
            return input -> input != null && input.length() <= max;
        }

        // WON'T COMPILE in implementing class (static interface methods NOT inherited):
        // MyValidator.nonEmpty();   // error: cannot find symbol
        // Must call via interface:  Validator.nonEmpty()
    }

    static class MyValidator implements Validator {
        @Override
        public boolean isValid(String input) {
            return input != null && input.matches("[a-zA-Z]+");
        }

        // NOTE: Cannot override interface static methods
        // This is a NEW method, not an override:
        // static Validator nonEmpty() { ... }  // hides, doesn't override
    }

    // ========== MULTIPLE STATIC BLOCKS ==========
    static class MultiBlockDemo {
        static String step1, step2, step3;

        static {
            step1 = "first";
            System.out.println("  [Static Block 1] step1 = " + step1);
        }

        static {
            step2 = "second";
            System.out.println("  [Static Block 2] step2 = " + step2);
        }

        static {
            step3 = "third";
            System.out.println("  [Static Block 3] step3 = " + step3);
        }
    }

    public static void run() {
        // --- Static factory methods ---
        System.out.println("--- Static Factory Methods ---");
        Color c1 = Color.of(128, 64, 32);
        Color c2 = Color.valueOf("red");
        Color c3 = Color.valueOf("blue");
        System.out.println("  Color.of(128,64,32) = " + c1);
        System.out.println("  Color.valueOf(\"red\") = " + c2);
        System.out.println("  Color.valueOf(\"blue\") = " + c3);

        System.out.println();
        System.out.println("  Advantages over constructors:");
        System.out.println("  1. Descriptive names (of, valueOf, getInstance, newInstance)");
        System.out.println("  2. Can return cached/shared instances");
        System.out.println("  3. Can return subtypes");
        System.out.println("  4. Can return null instead of throwing (Optional pattern)");
        System.out.println("  Examples: Integer.valueOf(), List.of(), Optional.of()");

        // --- Static methods in interfaces ---
        System.out.println();
        System.out.println("--- Static Methods in Interfaces (Java 8+) ---");
        Validator nonEmpty = Validator.nonEmpty();
        Validator maxLen = Validator.maxLength(5);
        System.out.println("  Validator.nonEmpty().isValid(\"\")     = " + nonEmpty.isValid(""));
        System.out.println("  Validator.nonEmpty().isValid(\"Hi\")   = " + nonEmpty.isValid("Hi"));
        System.out.println("  Validator.maxLength(5).isValid(\"Hello\") = " + maxLen.isValid("Hello"));
        System.out.println("  Validator.maxLength(5).isValid(\"TooLong\") = " + maxLen.isValid("TooLong"));
        System.out.println();
        System.out.println("  KEY: Interface static methods are NOT inherited by implementing classes.");
        System.out.println("  Must call via: Validator.nonEmpty(), NOT MyValidator.nonEmpty()");

        // --- Multiple static blocks ---
        System.out.println();
        System.out.println("--- Multiple Static Blocks (execution order) ---");
        System.out.println("  Triggering class load of MultiBlockDemo:");
        System.out.println("  step1=" + MultiBlockDemo.step1
                + ", step2=" + MultiBlockDemo.step2
                + ", step3=" + MultiBlockDemo.step3);
        System.out.println("  Multiple static blocks execute in textual (top-to-bottom) order.");
    }
}
