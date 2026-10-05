package variables;

public class FinalVsFinallyVsFinalizeDemo {

    // --- 3. finalize() demo class ---
    static class Resource {
        String name;

        Resource(String name) { this.name = name; }

        @Override
        @SuppressWarnings("deprecation")
        protected void finalize() throws Throwable {
            System.out.println("  [finalize()] " + name + " is being garbage collected");
            super.finalize();
        }
    }

    public static void run() {
        System.out.println("--- final vs finally vs finalize ---");
        System.out.println("(The #1 most-asked interview question about 'final'!)");

        // === 1. final ===
        System.out.println();
        System.out.println("1) FINAL (keyword):");
        final int x = 42;
        System.out.println("   final variable:  final int x = " + x + " (cannot reassign)");
        System.out.println("   final method:    cannot be overridden by subclasses");
        System.out.println("   final class:     cannot be extended (e.g., String, Integer)");

        // === 2. finally ===
        System.out.println();
        System.out.println("2) FINALLY (try-catch-finally block):");
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("   catch: " + e.getMessage());
        } finally {
            System.out.println("   finally: This ALWAYS runs (even if exception occurs)");
        }

        System.out.println();
        System.out.println("   finally runs ALWAYS, even with return:");
        System.out.println("   Value from method: " + demoFinallyWithReturn());

        // === 3. finalize() ===
        System.out.println();
        System.out.println("3) FINALIZE (Object method - DEPRECATED since Java 9):");
        System.out.println("   Called by GC before reclaiming an object (unreliable!)");
        System.out.println("   Problems:");
        System.out.println("     - No guarantee WHEN (or IF) it will be called");
        System.out.println("     - Adds overhead to garbage collection");
        System.out.println("     - Can cause objects to be resurrected accidentally");
        System.out.println("   Alternatives:");
        System.out.println("     - try-with-resources (AutoCloseable)");
        System.out.println("     - java.lang.ref.Cleaner (Java 9+)");

        // === Summary table ===
        System.out.println();
        System.out.println("SUMMARY:");
        System.out.println("  final    -> keyword  -> restricts modification (var/method/class)");
        System.out.println("  finally  -> block    -> guaranteed cleanup in try-catch");
        System.out.println("  finalize -> method   -> DEPRECATED GC callback (don't use)");
    }

    static String demoFinallyWithReturn() {
        try {
            return "from try";
        } finally {
            System.out.println("   [inside finally block, before return]");
        }
    }
}
