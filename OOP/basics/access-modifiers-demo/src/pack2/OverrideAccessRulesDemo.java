package pack2;

import pack1.AccessBase;

public class OverrideAccessRulesDemo extends AccessBase {

    // RULE: When overriding, you can WIDEN access but CANNOT NARROW it.
    //       protected -> public  (OK: widening)
    //       public -> protected  (FAILS: narrowing)

    // 1. Widening: protected -> public (ALLOWED)
    @Override
    public String protMethod() {
        return "OverrideAccessRulesDemo: protMethod() widened to public";
    }

    // 2. Same level: public -> public (ALLOWED)
    @Override
    public String pubMethod() {
        return "OverrideAccessRulesDemo: pubMethod() kept public";
    }

    // 3. NARROWING: public -> protected (WON'T COMPILE)
    // WON'T COMPILE: attempting to assign weaker access privileges; was public
    // @Override
    // protected String pubMethod() { return "narrowed"; }

    // 4. NARROWING: public -> private (WON'T COMPILE)
    // WON'T COMPILE: attempting to assign weaker access privileges; was public
    // @Override
    // private String pubMethod() { return "narrowed to private"; }

    // 5. NARROWING: protected -> default (WON'T COMPILE from different package)
    // WON'T COMPILE: attempting to assign weaker access privileges; was protected
    // @Override
    // String protMethod() { return "narrowed to default"; }

    // 6. NOTE: default (package-private) methods are NOT inherited across packages,
    //    so you cannot override defaultMethod() here (it's not visible).
    //    Defining a method with the same name is HIDING, not overriding.
    // WON'T COMPILE: defaultMethod() is not inherited (package-private in pack1), @Override fails
    // @Override
    // String defaultMethod() { return "overridden"; }

    // 7. private methods are NOT inherited at all, so they cannot be overridden.
    //    This is a NEW method, not an override (no @Override possible):
    // WON'T COMPILE: privMethod() is not inherited -- @Override would fail
    // @Override
    // private String privMethod() { return "not an override"; }

    public static void run() {
        OverrideAccessRulesDemo obj = new OverrideAccessRulesDemo();

        System.out.println("--- Method Override Access Rules ---");
        System.out.println();

        System.out.println("1) Widen protected -> public (ALLOWED):");
        System.out.println("   " + obj.protMethod());

        System.out.println();
        System.out.println("2) Keep same level public -> public (ALLOWED):");
        System.out.println("   " + obj.pubMethod());

        System.out.println();
        System.out.println("3) Narrow public -> protected   (WON'T COMPILE - see commented code)");
        System.out.println("4) Narrow public -> private     (WON'T COMPILE - see commented code)");
        System.out.println("5) Narrow protected -> default  (WON'T COMPILE - see commented code)");

        System.out.println();
        System.out.println("RULE SUMMARY:");
        System.out.println("  private   < default < protected < public");
        System.out.println("  Override must be SAME or WIDER (move RIGHT).");
        System.out.println("  You CANNOT move LEFT (narrow access).");

        System.out.println();
        System.out.println("6) default methods are NOT visible across packages -> cannot override");
        System.out.println("7) private methods are NEVER inherited -> cannot override");
    }
}
