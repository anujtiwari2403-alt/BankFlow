package pack2;

import pack1.AccessBase;
import pack1.ConstructorAccessDemo;

public class SubClassInOtherPackage extends AccessBase {
    public void demoProtectedAccess() {
        // In a subclass (different package):
        // - public is accessible
        // - protected is accessible (through inheritance)
        // - default is NOT accessible (different package)
        // - private is NOT accessible (only inside AccessBase)

        System.out.println("Subclass other package -> public field: " + pubField);
        System.out.println("Subclass other package -> protected field: " + protField);

        System.out.println("Subclass other package -> public method: " + pubMethod());
        System.out.println("Subclass other package -> protected method: " + protMethod());

        // Not accessible:
        // System.out.println(defaultField);    // won't compile
        // System.out.println(defaultMethod()); // won't compile
        // System.out.println(privField);       // won't compile
        // System.out.println(privMethod());    // won't compile
    }

    public void importantRuleDemo() {
        SubClassInOtherPackage child = new SubClassInOtherPackage();
        System.out.println("Subclass other package -> protected via subclass instance: " + child.protField);

        AccessBase asBase = child;
        // In a different package, protected is NOT accessible through a base-typed reference:
        // System.out.println(asBase.protField); // won't compile

        // --- Protected constructor access restriction ---
        // WON'T COMPILE: protected constructor accessible only via super() in a subclass,
        // NOT via direct instantiation with new from a different package
        // ConstructorAccessDemo.ProtectedCtorClass p = new ConstructorAccessDemo.ProtectedCtorClass();
    }
}

