package variables;

public class FinalVariableDemo {

    static final double PI = 3.14159;

    static class Circle {
        final double radius;

        Circle(double radius) {
            this.radius = radius;
        }
    }

    public static void run() {
        // 1. final local variable
        final int MAX = 100;
        System.out.println("1) final local variable:  MAX = " + MAX);

        // WON'T COMPILE: cannot assign a value to final variable MAX
        // MAX = 200;

        // 2. Blank final instance variable (assigned once in constructor)
        Circle c = new Circle(5.0);
        System.out.println("2) Blank final field:     circle.radius = " + c.radius);

        // WON'T COMPILE: cannot assign a value to final variable radius
        // c.radius = 99;

        // 3. static final constant
        System.out.println("3) static final constant: PI = " + PI);

        // WON'T COMPILE: cannot assign a value to final variable PI
        // PI = 3.0;

        System.out.println("   (All three kinds of final variables cannot be reassigned once set)");
    }
}
