import basics.BasicDemo;
import basics.CopyConstructorDemo;
import basics.EqualsHashCodeDemo;
import basics.ThisKeywordDemo;
import constructors.ConstructorDemo;
import methods.MethodDemo;
import methods.VarargsDemo;
import references.PassByValueDemo;
import references.AnonymousObjectDemo;
import references.WrapperAutoboxingDemo;
import references.ImmutableObjectDemo;
import references.ObjectClassMethodsDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Class & Object Basics ==");
        BasicDemo.run();

        System.out.println();
        System.out.println("== Constructor Overloading & Chaining ==");
        ConstructorDemo.run();

        System.out.println();
        System.out.println("== Method Overloading ==");
        MethodDemo.run();

        System.out.println();
        System.out.println("== Pass By Value (of reference) ==");
        PassByValueDemo.run();

        System.out.println();
        System.out.println("== Anonymous Objects ==");
        AnonymousObjectDemo.run();

        System.out.println();
        System.out.println("== Copy Constructor & Deep/Shallow Copy ==");
        CopyConstructorDemo.run();

        System.out.println();
        System.out.println("== equals(), hashCode(), == vs .equals() ==");
        EqualsHashCodeDemo.run();

        System.out.println();
        System.out.println("== 'this' Keyword: All 4 Uses ==");
        ThisKeywordDemo.run();

        System.out.println();
        System.out.println("== Varargs (Variable Arguments) ==");
        VarargsDemo.run();

        System.out.println();
        System.out.println("== Wrapper Classes & Autoboxing ==");
        WrapperAutoboxingDemo.run();

        System.out.println();
        System.out.println("== Immutable Objects & Initializer Blocks ==");
        ImmutableObjectDemo.run();

        System.out.println();
        System.out.println("== Object Class Methods ==");
        ObjectClassMethodsDemo.run();
    }
}
