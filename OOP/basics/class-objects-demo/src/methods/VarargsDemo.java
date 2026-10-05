package methods;

public class VarargsDemo {

    // Varargs: int... is treated as int[] internally
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) total += n;
        return total;
    }

    // Varargs with other parameters (varargs MUST be last)
    static String formatList(String label, String... items) {
        StringBuilder sb = new StringBuilder(label + ": [");
        for (int i = 0; i < items.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(items[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    // WON'T COMPILE: varargs must be the LAST parameter
    // static void bad(int... nums, String label) { }

    // WON'T COMPILE: only ONE varargs parameter allowed
    // static void bad2(int... a, String... b) { }

    // Overloading with varargs can cause ambiguity
    static void print(int a) {
        System.out.println("  print(int): " + a);
    }

    static void print(int a, int b) {
        System.out.println("  print(int, int): " + a + ", " + b);
    }

    // WON'T COMPILE at call site if ambiguous with above:
    // Uncommenting this + calling print(1, 2) would be ambiguous
    // static void print(int... nums) {
    //     System.out.println("  print(int...): " + java.util.Arrays.toString(nums));
    // }

    public static void run() {
        System.out.println("--- Varargs (Variable Arguments) ---");

        System.out.println();
        System.out.println("1) Calling sum() with different arg counts:");
        System.out.println("   sum()            = " + sum());
        System.out.println("   sum(5)           = " + sum(5));
        System.out.println("   sum(1, 2, 3)     = " + sum(1, 2, 3));
        System.out.println("   sum(1, 2, 3, 4, 5) = " + sum(1, 2, 3, 4, 5));

        System.out.println();
        System.out.println("2) Passing an array directly (varargs accepts arrays):");
        int[] arr = {10, 20, 30};
        System.out.println("   sum(arr)         = " + sum(arr));

        System.out.println();
        System.out.println("3) Varargs with other params (varargs must be LAST):");
        System.out.println("   " + formatList("Colors", "Red", "Green", "Blue"));
        System.out.println("   " + formatList("Empty list"));

        System.out.println();
        System.out.println("4) Overloading precedence: exact match wins over varargs");
        print(42);         // calls print(int)
        print(1, 2);       // calls print(int, int)

        System.out.println();
        System.out.println("RULES:");
        System.out.println("  - Varargs MUST be the last parameter");
        System.out.println("  - Only ONE varargs per method");
        System.out.println("  - Internally treated as an array (int... -> int[])");
        System.out.println("  - Exact match takes priority over varargs in overloading");
    }
}
