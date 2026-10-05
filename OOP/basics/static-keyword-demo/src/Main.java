import fields.StaticFieldDemo;
import methods.StaticMethodDemo;
import blocks.StaticBlockDemo;
import nested.StaticNestedDemo;
import static methods.MathHelper.add;  // static import demo
import methods.StaticHidingDemo;
import fields.SingletonDemo;
import methods.StaticFactoryDemo;
import blocks.StaticInheritanceOrderDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Static Fields (shared state) ==");
        StaticFieldDemo.run();

        System.out.println();
        System.out.println("== Static Methods ==");
        StaticMethodDemo.run();

        System.out.println();
        System.out.println("== Static import demo (used in Main) ==");
        System.out.println("Calling add(10, 20) via static import: " + add(10, 20));

        System.out.println();
        System.out.println("== Static Blocks (initialization order) ==");
        StaticBlockDemo.run();

        System.out.println();
        System.out.println("== Static Nested Classes ==");
        StaticNestedDemo.run();

        System.out.println();
        System.out.println("== Static Method Hiding vs Overriding ==");
        StaticHidingDemo.run();

        System.out.println();
        System.out.println("== Singleton Pattern ==");
        SingletonDemo.run();

        System.out.println();
        System.out.println("== Static Factory Methods & Interface Static Methods ==");
        StaticFactoryDemo.run();

        System.out.println();
        System.out.println("== Class Loading Order Across Inheritance ==");
        StaticInheritanceOrderDemo.run();
    }
}
