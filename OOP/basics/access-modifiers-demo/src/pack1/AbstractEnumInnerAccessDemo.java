package pack1;

public class AbstractEnumInnerAccessDemo {

    // ========== 1. ABSTRACT CLASS METHOD MODIFIERS ==========
    abstract static class Shape {
        public abstract double area();           // public abstract: OK
        protected abstract String describe();    // protected abstract: OK
        abstract String internalName();          // default abstract: OK

        // WON'T COMPILE: abstract methods CANNOT be private (must be overridden!)
        // private abstract void hidden();

        // Concrete methods in abstract class: all 4 levels are fine
        private String secretId() { return "SHAPE-001"; }
        public String getSecretId() { return secretId(); }
    }

    static class Circle extends Shape {
        private double radius;
        Circle(double radius) { this.radius = radius; }

        @Override
        public double area() { return Math.PI * radius * radius; }

        @Override
        protected String describe() { return "Circle with radius " + radius; }

        @Override
        String internalName() { return "circle_shape"; }
    }

    // ========== 2. ENUM CONSTRUCTOR ACCESS ==========
    enum Season {
        SPRING("Warm"), SUMMER("Hot"), AUTUMN("Cool"), WINTER("Cold");

        private final String weather;

        // Enum constructors are IMPLICITLY PRIVATE
        // You do NOT need (and CANNOT use) public/protected
        Season(String weather) {
            this.weather = weather;
        }

        // WON'T COMPILE: modifier public not allowed here (enum constructor)
        // public Season(String weather) { this.weather = weather; }

        // WON'T COMPILE: modifier protected not allowed here (enum constructor)
        // protected Season(String weather) { this.weather = weather; }

        public String getWeather() { return weather; }
    }

    // WON'T COMPILE: cannot instantiate an enum with 'new' from outside
    // Season custom = new Season("Rainy");

    // ========== 3. INNER CLASS ACCESSING OUTER PRIVATE MEMBERS ==========
    private int outerPrivateField = 42;
    private String outerPrivateMethod() { return "outer secret"; }

    // Non-static inner class: can access ALL outer members, INCLUDING private
    class InnerClass {
        public void revealOuterSecrets() {
            System.out.println("  [InnerClass] outerPrivateField = " + outerPrivateField);
            System.out.println("  [InnerClass] outerPrivateMethod() = " + outerPrivateMethod());
        }
    }

    // Static nested class: can only access static members
    private static int outerStaticField = 99;

    static class StaticNestedClass {
        public void showAccess() {
            System.out.println("  [StaticNested] outerStaticField = " + outerStaticField);
            // WON'T COMPILE: cannot access instance field from static context
            // System.out.println(outerPrivateField);
        }
    }

    // ========== 4. NESTED CLASS MODIFIERS ==========
    // Unlike top-level classes (only public or default), nested classes allow ALL 4:
    public static class PublicNested { }
    protected static class ProtectedNested { }
    static class DefaultNested { }
    private static class PrivateNested { }

    public static void run() {
        System.out.println("--- Abstract Class Method Modifiers ---");
        Circle c = new Circle(5);
        System.out.println("  area()         = " + c.area() + " (public abstract)");
        System.out.println("  describe()     = " + c.describe() + " (protected abstract)");
        System.out.println("  internalName() = " + c.internalName() + " (default abstract)");
        System.out.println("  getSecretId()  = " + c.getSecretId() + " (private via public wrapper)");
        System.out.println("  NOTE: abstract methods CANNOT be private (they must be overridden)");

        System.out.println();
        System.out.println("--- Enum Constructor Access ---");
        for (Season s : Season.values()) {
            System.out.println("  " + s.name() + " -> " + s.getWeather());
        }
        System.out.println("  Enum constructors are IMPLICITLY PRIVATE.");
        System.out.println("  You cannot use public/protected on them (won't compile).");

        System.out.println();
        System.out.println("--- Inner Class Accessing Outer Private Members ---");
        AbstractEnumInnerAccessDemo outer = new AbstractEnumInnerAccessDemo();
        InnerClass inner = outer.new InnerClass();
        inner.revealOuterSecrets();
        System.out.println("  -> Inner (non-static) class can access ALL outer members including private");

        System.out.println();
        System.out.println("--- Static Nested Class Access ---");
        new StaticNestedClass().showAccess();
        System.out.println("  -> Static nested class can ONLY access outer static members");

        System.out.println();
        System.out.println("--- Nested Class Modifier Rules ---");
        System.out.println("  Top-level classes: only 'public' or default (package-private)");
        System.out.println("  Nested classes:    all 4 modifiers allowed (public/protected/default/private)");
        System.out.println("  This class has: PublicNested, ProtectedNested, DefaultNested, PrivateNested");
    }
}
