package fields;

public class StaticFieldDemo {
    public static void run() {
        Counter.resetCount();

        System.out.println("Before creating any objects:");
        System.out.println("  Counter.getCount() = " + Counter.getCount());

        System.out.println();
        Counter c1 = new Counter();
        System.out.println("After creating c1: " + c1);
        System.out.println("  Counter.getCount() = " + Counter.getCount());

        System.out.println();
        Counter c2 = new Counter();
        System.out.println("After creating c2: " + c2);
        System.out.println("  Counter.getCount() = " + Counter.getCount());

        System.out.println();
        Counter c3 = new Counter();
        System.out.println("After creating c3: " + c3);
        System.out.println("  Counter.getCount() = " + Counter.getCount());

        System.out.println();
        System.out.println("All three share the SAME count, but have DIFFERENT id values:");
        System.out.println("  c1 = " + c1);
        System.out.println("  c2 = " + c2);
        System.out.println("  c3 = " + c3);

        System.out.println();
        System.out.println("Accessing static method -- two ways:");
        System.out.println("  Via class:  Counter.getCount() = " + Counter.getCount());
        System.out.println("  Via object: c1.getCount() = " + c1.getCount() + " (works but not recommended)");
    }
}
