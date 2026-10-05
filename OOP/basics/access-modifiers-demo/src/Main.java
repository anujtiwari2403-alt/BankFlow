import pack1.SamePackageTest;
import pack2.OtherPackageTest;
import pack2.SubClassInOtherPackage;
import pack1.ConstructorAccessDemo;
import pack2.OverrideAccessRulesDemo;
import pack1.InterfaceAccessDemo;
import pack1.AbstractEnumInnerAccessDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Same package test ==");
        SamePackageTest.run();

        System.out.println();
        System.out.println("== Other package (non-subclass) test ==");
        OtherPackageTest.run();

        System.out.println();
        System.out.println("== Subclass in other package test ==");
        SubClassInOtherPackage sub = new SubClassInOtherPackage();
        sub.demoProtectedAccess();

        System.out.println();
        System.out.println("== Protected rule demo ==");
        sub.importantRuleDemo();

        System.out.println();
        System.out.println("== Constructor Access Levels ==");
        ConstructorAccessDemo.run();

        // --- Constructor access restrictions from the default package (Main) ---
        // Main is NOT inside pack1, so:
        //
        // WON'T COMPILE: PrivateCtorClass has a private constructor
        // -- not accessible outside the enclosing class (ConstructorAccessDemo)
        // ConstructorAccessDemo.PrivateCtorClass p = new ConstructorAccessDemo.PrivateCtorClass();
        //
        // WON'T COMPILE: DefaultCtorClass has default (package-private) access
        // -- the class itself is not visible outside pack1
        // ConstructorAccessDemo.DefaultCtorClass d = new ConstructorAccessDemo.DefaultCtorClass();

        System.out.println();
        System.out.println("== Method Override Access Rules ==");
        OverrideAccessRulesDemo.run();

        System.out.println();
        System.out.println("== Interface Access Modifiers ==");
        InterfaceAccessDemo.run();

        System.out.println();
        System.out.println("== Abstract / Enum / Inner Class Access ==");
        AbstractEnumInnerAccessDemo.run();
    }
}
