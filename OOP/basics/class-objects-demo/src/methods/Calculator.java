package methods;

public class Calculator {

    // add(int, int)
    public static int add(int a, int b) {
        return a + b;
    }

    // add(double, double) — same name, different parameter types
    public static double add(double a, double b) {
        return a + b;
    }

    // add(int, int, int) — same name, different parameter count
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // multiply(int, int)
    public static int multiply(int a, int b) {
        return a * b;
    }

    // WON'T COMPILE: can't overload by return type alone.
    // The method below has the SAME parameter list as multiply(int, int)
    // but a different return type.  Java cannot distinguish calls based
    // only on the return type, so this would cause a compile error.
    //
    // public static double multiply(int a, int b) {
    //     return (double) a * b;
    // }
}
