package methods;

public class MethodDemo {
    public static void run() {

        // 1. add(int, int)
        int sum1 = Calculator.add(5, 3);
        System.out.println("1) add(5, 3)        = " + sum1 + "   [int version]");

        // 2. add(double, double)
        double sum2 = Calculator.add(2.5, 3.7);
        System.out.println("2) add(2.5, 3.7)    = " + sum2 + "  [double version]");

        // 3. add(int, int, int)
        int sum3 = Calculator.add(1, 2, 3);
        System.out.println("3) add(1, 2, 3)     = " + sum3 + "   [three-arg version]");

        // 4. multiply(int, int)
        int product = Calculator.multiply(4, 5);
        System.out.println("4) multiply(4, 5)   = " + product);

        // How does Java pick the right method?
        System.out.println();
        System.out.println("HOW OVERLOADING RESOLUTION WORKS:");
        System.out.println("  Java picks the method whose parameter list best matches the");
        System.out.println("  arguments you pass — by NUMBER of args and their TYPES.");
        System.out.println("  Return type alone is NOT enough to distinguish overloads.");
    }
}
