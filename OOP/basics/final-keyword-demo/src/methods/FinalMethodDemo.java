package methods;

public class FinalMethodDemo {

    public static void run() {
        Child child = new Child();

        System.out.println("Calling methods on a Child object:");
        System.out.println("  connect()    -> " + child.connect()
                + "  [inherited from Parent, CANNOT override]");
        System.out.println("  disconnect() -> " + child.disconnect()
                + "  [overridden in Child]");
        System.out.println("  getStatus()  -> " + child.getStatus()
                + "  [overridden in Child]");

        System.out.println();
        System.out.println("  Why can't connect() be overridden?");
        System.out.println("  -> It is declared 'final' in Parent.");
        System.out.println("  -> final methods guarantee consistent behavior across all subclasses.");
    }
}
