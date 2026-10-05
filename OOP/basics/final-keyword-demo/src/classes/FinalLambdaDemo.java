package classes;

public class FinalLambdaDemo {

    // --- Blank final with multiple constructors ---
    static class Config {
        final String environment;  // blank final

        // EVERY constructor must assign the blank final
        Config() {
            this.environment = "development";  // assigned here
        }

        Config(String environment) {
            this.environment = environment;  // assigned here
        }

        // WON'T COMPILE if a constructor does NOT assign 'environment':
        // Config(int dummy) { }  // error: variable environment might not have been initialized

        @Override
        public String toString() { return "Config{env='" + environment + "'}"; }
    }

    @FunctionalInterface
    interface Transformer {
        String transform(String input);
    }

    public static void run() {
        // --- Effectively final in lambdas ---
        System.out.println("--- Effectively Final & Lambdas ---");

        String prefix = "Hello";  // effectively final: never reassigned
        Transformer greeter = name -> prefix + ", " + name + "!";
        System.out.println("1) " + greeter.transform("Alice"));
        System.out.println("   'prefix' is effectively final (never reassigned after init)");

        // WON'T COMPILE if we reassign prefix:
        // prefix = "Hi";  // makes prefix NOT effectively final
        // Transformer t = name -> prefix + name;  // error!

        System.out.println();
        System.out.println("2) Explicitly final in lambda:");
        final int multiplier = 3;
        Transformer tripler = s -> {
            // WON'T COMPILE: multiplier = 5;
            return s.repeat(multiplier);
        };
        System.out.println("   " + tripler.transform("Ha"));

        // --- Anonymous inner class with final/effectively-final ---
        System.out.println();
        System.out.println("3) Anonymous class also requires final/effectively-final:");
        final String message = "World";
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("   [Anonymous Runnable] " + message);
                // WON'T COMPILE: message = "Changed";
            }
        };
        r.run();

        // --- final in try-with-resources (Java 9+) ---
        System.out.println();
        System.out.println("4) final in try-with-resources (Java 9+):");

        class SimpleResource implements AutoCloseable {
            private final String name;
            SimpleResource(String name) { this.name = name; }
            void use() { System.out.println("   [SimpleResource] Using " + name); }
            @Override
            public void close() { System.out.println("   [SimpleResource] Closing " + name); }
        }

        final SimpleResource res = new SimpleResource("DBConnection");
        try (res) {
            res.use();
        }

        SimpleResource res2 = new SimpleResource("FileReader");  // effectively final
        try (res2) {
            res2.use();
        }
        System.out.println("   -> Java 9+: effectively-final variables can go directly in try()");

        // --- Blank final with multiple constructors ---
        System.out.println();
        System.out.println("5) Blank final with multiple constructors:");
        Config c1 = new Config();
        Config c2 = new Config("production");
        System.out.println("   Default: " + c1);
        System.out.println("   Custom:  " + c2);
        System.out.println("   RULE: Every constructor must assign the blank final field.");
        System.out.println("   A constructor that forgets to assign it won't compile.");

        // --- Effectively final definition ---
        System.out.println();
        System.out.println("EFFECTIVELY FINAL (Java 8+):");
        System.out.println("  A variable that is never reassigned after initialization.");
        System.out.println("  It does NOT need the 'final' keyword.");
        System.out.println("  Lambdas and anonymous classes require final or effectively-final");
        System.out.println("  local variables from the enclosing scope.");
    }
}
