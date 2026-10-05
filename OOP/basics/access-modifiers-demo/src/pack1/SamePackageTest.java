package pack1;

public class SamePackageTest {
    public static void run() {
        AccessBase base = new AccessBase();

        // Same package: public/protected/default are accessible
        System.out.println("Same package -> public field: " + base.pubField);
        System.out.println("Same package -> protected field: " + base.protField);
        System.out.println("Same package -> default field: " + base.defaultField);

        System.out.println("Same package -> public method: " + base.pubMethod());
        System.out.println("Same package -> protected method: " + base.protMethod());
        System.out.println("Same package -> default method: " + base.defaultMethod());

        // private is NOT accessible outside the class (even in same package)
        // System.out.println(base.privField); // won't compile
        // System.out.println(base.privMethod()); // won't compile

        // But you can access private indirectly via public methods:
        System.out.println("Same package -> private via public getter: " + base.readPrivateInsideClass());
        System.out.println("Same package -> private method via public wrapper: " + base.callPrivateInsideClass());

        // --- Constructor access from same package, DIFFERENT class ---
        // WON'T COMPILE: PrivateCtorClass constructor is private
        // -- even though we're in the same package (pack1), we're in a DIFFERENT class
        // -- only the enclosing class (ConstructorAccessDemo) can access it
        // new ConstructorAccessDemo.PrivateCtorClass();
    }
}
