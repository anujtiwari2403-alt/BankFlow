package methods;

public class StaticMethodDemo {
    public static void run() {
        System.out.println("Calling static methods -- no object needed:");
        System.out.println("  MathHelper.add(5, 3)      = " + MathHelper.add(5, 3));
        System.out.println("  MathHelper.multiply(4, 6)  = " + MathHelper.multiply(4, 6));

        System.out.println();
        System.out.println("Checking primes:");
        System.out.println("  MathHelper.isPrime(7)  = " + MathHelper.isPrime(7)  + "  (7 is prime)");
        System.out.println("  MathHelper.isPrime(10) = " + MathHelper.isPrime(10) + " (10 is not prime)");

        System.out.println();
        System.out.println("Static method restrictions:");
        MathHelper.demoRestrictions();

        System.out.println();
        System.out.println("Why is main() static?");
        System.out.println("  -> JVM needs to call main() without creating an object first.");
        System.out.println("  -> If main() were non-static, JVM would need an instance of the");
        System.out.println("     class before it could call main(), creating a chicken-and-egg problem.");
    }
}
