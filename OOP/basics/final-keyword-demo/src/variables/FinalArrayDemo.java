package variables;

public class FinalArrayDemo {

    // Compile-time constants: static final primitives/Strings are inlined by the compiler
    static final int MAX_SIZE = 100;
    static final String APP_NAME = "MyApp";

    public static void run() {
        // --- final with arrays ---
        System.out.println("--- final with Arrays ---");
        final int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));

        numbers[0] = 99;  // OK: changing CONTENT of the array
        System.out.println("After numbers[0] = 99: " + java.util.Arrays.toString(numbers));

        // WON'T COMPILE: cannot assign a value to final variable numbers
        // numbers = new int[]{10, 20, 30};  // reassigning the REFERENCE

        System.out.println("KEY: final array = reference is locked, but elements CAN change.");
        System.out.println("     Same rule as final ArrayList/Object references.");

        // --- final in enhanced for loop ---
        System.out.println();
        System.out.println("--- final in Enhanced For Loop ---");
        String[] names = {"Alice", "Bob", "Charlie"};
        for (final String name : names) {
            System.out.println("  Processing: " + name);
            // WON'T COMPILE: cannot assign a value to final variable name
            // name = "Modified";
        }
        System.out.println("  'final' in for-each: variable is re-declared each iteration.");
        System.out.println("  Prevents accidental reassignment inside the loop body.");

        // --- Compile-time constants ---
        System.out.println();
        System.out.println("--- Compile-Time Constants ---");
        System.out.println("  static final int MAX_SIZE = " + MAX_SIZE);
        System.out.println("  static final String APP_NAME = \"" + APP_NAME + "\"");
        System.out.println();
        System.out.println("  Rules for compile-time constants:");
        System.out.println("  1. Must be static final");
        System.out.println("  2. Must be a primitive or String");
        System.out.println("  3. Must be initialized at declaration (not in static block)");
        System.out.println("  4. Value is INLINED by the compiler into all usage sites");
        System.out.println("  5. Can be used in switch-case labels");
        System.out.println("  6. Naming convention: UPPER_SNAKE_CASE");

        // --- switch with compile-time constants ---
        System.out.println();
        final int STATUS_OK = 200;
        final int STATUS_NOT_FOUND = 404;
        int code = 200;
        switch (code) {
            case STATUS_OK:        System.out.println("  switch case STATUS_OK (200): OK"); break;
            case STATUS_NOT_FOUND: System.out.println("  switch case STATUS_NOT_FOUND (404): Not Found"); break;
        }
        System.out.println("  switch-case requires compile-time constants (final primitives/Strings)");
    }
}
