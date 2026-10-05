package pack2;

import pack1.AccessBase;
import pack1.ConstructorAccessDemo;

public class OtherPackageTest {
    public static void run() {
        AccessBase base = new AccessBase();

        // Different package (not a subclass): ONLY public is accessible.
        System.out.println("Other package -> public field: " + base.pubField);
        System.out.println("Other package -> public method: " + base.pubMethod());

        // protected is NOT accessible through an instance reference here
        // System.out.println(base.protField);   // won't compile
        // System.out.println(base.protMethod()); // won't compile

        // default(package-private) is NOT accessible outside package
        // System.out.println(base.defaultField);   // won't compile
        // System.out.println(base.defaultMethod()); // won't compile

        // private is never accessible outside the class
        // System.out.println(base.privField);    // won't compile
        // System.out.println(base.privMethod()); // won't compile

        // WON'T COMPILE: PackagePrivateHelper is package-private (default access in pack1)
        // import pack1.PackagePrivateHelper;  // would fail if placed at top of file
        // PackagePrivateHelper helper = new PackagePrivateHelper();

        // --- Constructor access restrictions from a different package ---
        //
        // WON'T COMPILE: PrivateCtorClass constructor is private
        // -- only accessible inside the enclosing class (ConstructorAccessDemo)
        // new ConstructorAccessDemo.PrivateCtorClass();
        //
        // WON'T COMPILE: ProtectedCtorClass constructor is protected
        // -- from a different package, protected is accessible only via subclassing (super()),
        //    NOT via direct instantiation with new
        // new ConstructorAccessDemo.ProtectedCtorClass();
    }
}

