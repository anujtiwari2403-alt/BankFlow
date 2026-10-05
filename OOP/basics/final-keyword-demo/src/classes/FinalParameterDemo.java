package classes;

public class FinalParameterDemo {

    static void printLength(final String text) {
        System.out.println("  printLength(\"" + text + "\") -> length = " + text.length());

        // WON'T COMPILE: final parameter cannot be reassigned
        // text = "something else";
    }

    static void doubleAndPrint(final int num) {
        System.out.println("  doubleAndPrint(" + num + ") -> Double of " + num + " = " + (num * 2));

        // WON'T COMPILE: final parameter cannot be reassigned
        // num = num * 2;
    }

    public static void run() {
        System.out.println("final parameter with a String:");
        printLength("Hello, Java!");

        System.out.println();
        System.out.println("final parameter with a primitive:");
        doubleAndPrint(7);

        System.out.println();
        System.out.println("  final parameters prevent accidental reassignment inside a method.");
        System.out.println("  The original argument is guaranteed to stay unchanged.");
    }
}
