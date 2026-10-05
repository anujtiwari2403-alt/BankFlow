package pack1;

public class ConstructorAccessDemo {

    // --- Classes with different constructor access levels ---

    public static class PublicCtorClass {
        public PublicCtorClass() {
            System.out.println("  PublicCtorClass: public constructor called");
        }
    }

    static class DefaultCtorClass {
        DefaultCtorClass() {
            System.out.println("  DefaultCtorClass: default (package-private) constructor called");
        }
    }

    public static class ProtectedCtorClass {
        protected ProtectedCtorClass() {
            System.out.println("  ProtectedCtorClass: protected constructor called");
        }
    }

    public static class PrivateCtorClass {

        private PrivateCtorClass() {
            System.out.println("  PrivateCtorClass: private constructor called (inside class only)");
        }

        // Only way to create an instance: via a static factory method
        public static PrivateCtorClass create() {
            return new PrivateCtorClass();
        }
    }

    public static void run() {
        System.out.println("--- Constructor Access Levels ---");

        // public constructor: callable from anywhere
        new PublicCtorClass();

        // default constructor: callable only within pack1
        new DefaultCtorClass();

        // protected constructor: callable within pack1, and in subclasses in other packages
        new ProtectedCtorClass();

        // private constructor: callable ONLY inside PrivateCtorClass itself
        // From OUTSIDE classes (even same package), you must use the factory method:
        PrivateCtorClass obj = PrivateCtorClass.create();
        System.out.println("  -> Created PrivateCtorClass via static factory: " + obj);

        // IMPORTANT: Enclosing class access rule
        // The line below WOULD compile here because run() is inside
        // ConstructorAccessDemo, which is the ENCLOSING CLASS of PrivateCtorClass.
        // Java allows an enclosing class to access ALL private members of its nested classes.
        //     new PrivateCtorClass();  // compiles here (enclosing class privilege)
        //
        // But from ANY other class (even in the same package), it WON'T COMPILE:
        //     SamePackageTest:       new ConstructorAccessDemo.PrivateCtorClass();  // FAILS
        //     OtherPackageTest:      new ConstructorAccessDemo.PrivateCtorClass();  // FAILS
        //     Main:                  new ConstructorAccessDemo.PrivateCtorClass();  // FAILS
        // See those files for the commented-out proof.

        System.out.println();
        System.out.println("  NOTE: An enclosing class CAN access private members of its nested classes.");
        System.out.println("  But from any OTHER class, private constructors are NOT accessible.");
        System.out.println("  The static factory method (create()) is the intended way to get an instance.");

        System.out.println();
        System.out.println("  Use cases for private constructors:");
        System.out.println("  - Singleton pattern (one instance)");
        System.out.println("  - Utility classes (no instances, all static methods)");
        System.out.println("  - Factory methods (control how objects are created)");
    }
}
