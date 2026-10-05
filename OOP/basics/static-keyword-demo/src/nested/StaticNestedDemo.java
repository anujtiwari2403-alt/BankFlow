package nested;

public class StaticNestedDemo {
    public static void run() {
        System.out.println("Static nested class -- no outer instance needed:");
        OuterClass.StaticNested nested = new OuterClass.StaticNested();
        nested.display();

        System.out.println();
        System.out.println("Non-static inner class -- needs an outer instance:");
        OuterClass outer = new OuterClass();
        OuterClass.Inner inner = outer.new Inner();
        inner.display();

        System.out.println();
        System.out.println("Key differences:");
        System.out.println("  Static nested class: created with `new Outer.StaticNested()` -- no outer instance needed");
        System.out.println("  Inner class: created with `outer.new Inner()` -- needs an outer instance");
        System.out.println("  Static nested class can only access static members of the outer class.");
        System.out.println("  Inner class can access ALL members (static + instance) of the outer class.");
    }
}
