package pack1;

public class InterfaceAccessDemo {

    // --- Interface method access rules ---
    public interface Greeting {
        // Interface fields are implicitly public static final
        String GREETING_TYPE = "formal";   // implicitly: public static final

        // Interface methods are implicitly public (even without the keyword)
        void sayHello();

        // default method (Java 8+): provides a body, still implicitly public
        default void sayGoodbye() {
            String msg = helperFormat("Goodbye");
            System.out.println("  " + msg);
        }

        // static method in interface (Java 8+): belongs to the interface, NOT inherited
        static void describe() {
            System.out.println("  [Greeting.describe()] I am a Greeting interface (static method)");
        }

        // private helper method (Java 9+): reusable logic for default methods
        private String helperFormat(String word) {
            return "[Greeting] " + word + "!";
        }

        // WON'T COMPILE: interface methods cannot be protected
        // protected void secretMethod();

        // WON'T COMPILE: interface abstract methods cannot be private
        // private void hiddenMethod();
    }

    // --- Implementation ---
    static class FriendlyGreeter implements Greeting {
        @Override
        public void sayHello() {
            System.out.println("  [FriendlyGreeter] Hello there!");
        }

        // WON'T COMPILE: cannot reduce visibility (interface methods are public)
        // @Override
        // void sayHello() { ... }   // default access is weaker than public

        // NOTE: static interface methods are NOT inherited:
        // FriendlyGreeter.describe();  // WON'T COMPILE
    }

    // --- Default access on top-level class ---
    // This class is in the SAME FILE but is NOT public (default access)
    // It is only accessible within pack1 (package-private)
    // RULE: Only ONE public class per file, and its name MUST match the filename

    // --- Multiple classes in one file demo ---
    // See PackagePrivateHelper below (outside this class but in this file)

    public static void run() {
        System.out.println("--- Interface Access Modifiers ---");
        System.out.println();

        System.out.println("1) Interface methods are implicitly public:");
        FriendlyGreeter greeter = new FriendlyGreeter();
        greeter.sayHello();

        System.out.println();
        System.out.println("2) Default method (Java 8+) - has a body, still public:");
        greeter.sayGoodbye();

        System.out.println();
        System.out.println("3) Static method on interface - called via InterfaceName.method():");
        Greeting.describe();
        System.out.println("   NOTE: Cannot call via FriendlyGreeter.describe() -- NOT inherited");

        System.out.println();
        System.out.println("4) Private helper method (Java 9+):");
        System.out.println("   Used internally by sayGoodbye() -- not callable from outside");

        System.out.println();
        System.out.println("5) Multiple classes in one file:");
        PackagePrivateHelper helper = new PackagePrivateHelper();
        System.out.println("   " + helper.help());
        System.out.println("   -> PackagePrivateHelper has no 'public' keyword = default access");
        System.out.println("   -> Only ONE public class per .java file (must match filename)");

        System.out.println();
        System.out.println("INTERFACE RULES:");
        System.out.println("  - Abstract methods:  implicitly public abstract");
        System.out.println("  - Fields:            implicitly public static final");
        System.out.println("  - Default methods:   public (Java 8+)");
        System.out.println("  - Static methods:    public, NOT inherited (Java 8+)");
        System.out.println("  - Private methods:   for internal reuse only (Java 9+)");
    }
}

// WON'T COMPILE: top-level class cannot be private
// private class TopLevelPrivate { }

// WON'T COMPILE: top-level class cannot be protected
// protected class TopLevelProtected { }

// Package-private (default access) class -- NOT public, so only visible within pack1
// This demonstrates: multiple classes in one file, and default-access top-level class
class PackagePrivateHelper {
    String help() {
        return "PackagePrivateHelper: I am default-access (visible only in pack1)";
    }
}
