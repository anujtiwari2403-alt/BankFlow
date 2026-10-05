import basics.EncapsulationBasicsDemo;
import getters.GetterSetterDemo;
import beans.JavaBeansDemo;
import design.LawOfDemeterDemo;
import design.AntiPatternDemo;
import design.TightEncapsulationDemo;
import collections.CollectionEncapsulationDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Core Encapsulation (private fields, getters/setters, validation) ==");
        EncapsulationBasicsDemo.run();

        System.out.println();
        System.out.println("== Getter/Setter Patterns (boolean, computed, fluent, defensive copies) ==");
        GetterSetterDemo.run();

        System.out.println();
        System.out.println("== JavaBeans Convention & Records ==");
        JavaBeansDemo.run();

        System.out.println();
        System.out.println("== Law of Demeter / Tell Don't Ask ==");
        LawOfDemeterDemo.run();

        System.out.println();
        System.out.println("== Encapsulation Anti-Patterns ==");
        AntiPatternDemo.run();

        System.out.println();
        System.out.println("== Tight Encapsulation & Information Hiding ==");
        TightEncapsulationDemo.run();

        System.out.println();
        System.out.println("== Collection Encapsulation ==");
        CollectionEncapsulationDemo.run();
    }
}
