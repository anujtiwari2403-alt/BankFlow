package methods;

public class MathHelper {
    // private constructor prevents instantiation
    private MathHelper() {}

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // instance field to show the restriction
    // (uncomment the field below and the line in demoRestrictions to see the error)
    // private int instanceVar = 10;

    public static void demoRestrictions() {
        System.out.println("  Inside a static method:");
        System.out.println("  - Cannot use 'this' keyword");
        // WON'T COMPILE: non-static variable this cannot be referenced from a static context
        // System.out.println(this);

        System.out.println("  - Cannot access instance fields directly");
        // WON'T COMPILE: non-static variable instanceVar cannot be referenced from a static context
        // System.out.println(instanceVar);

        System.out.println("  - CAN access other static members");
        System.out.println("  - add(1, 2) from static context = " + add(1, 2));
    }
}
