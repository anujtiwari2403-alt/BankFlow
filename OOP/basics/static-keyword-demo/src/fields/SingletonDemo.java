package fields;

public class SingletonDemo {

    // ========== 1. EAGER INITIALIZATION ==========
    static class EagerSingleton {
        private static final EagerSingleton INSTANCE = new EagerSingleton();

        private EagerSingleton() {
            System.out.println("  [EagerSingleton] Instance created (at class load time)");
        }

        public static EagerSingleton getInstance() { return INSTANCE; }

        public void doWork() { System.out.println("  [EagerSingleton] Working..."); }
    }

    // ========== 2. LAZY INITIALIZATION (not thread-safe) ==========
    static class LazySingleton {
        private static LazySingleton instance;

        private LazySingleton() {
            System.out.println("  [LazySingleton] Instance created (on first use)");
        }

        public static LazySingleton getInstance() {
            if (instance == null) {
                instance = new LazySingleton();
            }
            return instance;
        }

        public void doWork() { System.out.println("  [LazySingleton] Working..."); }
    }

    // ========== 3. BILL PUGH SINGLETON (static holder pattern) ==========
    static class BillPughSingleton {
        private BillPughSingleton() {
            System.out.println("  [BillPughSingleton] Instance created (on first getInstance() call)");
        }

        // Inner static class is NOT loaded until getInstance() is called
        private static class Holder {
            private static final BillPughSingleton INSTANCE = new BillPughSingleton();
        }

        public static BillPughSingleton getInstance() {
            return Holder.INSTANCE;  // triggers loading of Holder class
        }

        public void doWork() { System.out.println("  [BillPughSingleton] Working..."); }
    }

    // ========== static final constants naming convention ==========
    public static final int MAX_CONNECTIONS = 100;
    public static final String DEFAULT_HOST = "localhost";
    public static final double PI = 3.14159265358979;

    public static void run() {
        System.out.println("--- Singleton Pattern (using static) ---");

        System.out.println();
        System.out.println("1) Eager initialization:");
        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        e1.doWork();
        System.out.println("  Same instance? " + (e1 == e2));
        System.out.println("  Pros: Simple, thread-safe (JVM guarantees class loading)");
        System.out.println("  Cons: Instance created even if never used");

        System.out.println();
        System.out.println("2) Lazy initialization:");
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        l1.doWork();
        System.out.println("  Same instance? " + (l1 == l2));
        System.out.println("  Pros: Created only when needed");
        System.out.println("  Cons: NOT thread-safe (two threads could create two instances)");

        System.out.println();
        System.out.println("3) Bill Pugh / Static Holder pattern (RECOMMENDED):");
        BillPughSingleton b1 = BillPughSingleton.getInstance();
        BillPughSingleton b2 = BillPughSingleton.getInstance();
        b1.doWork();
        System.out.println("  Same instance? " + (b1 == b2));
        System.out.println("  Pros: Lazy + thread-safe (inner class loaded on first use)");
        System.out.println("  Cons: Slightly more complex code");

        System.out.println();
        System.out.println("--- static final Constants (naming convention) ---");
        System.out.println("  MAX_CONNECTIONS = " + MAX_CONNECTIONS);
        System.out.println("  DEFAULT_HOST    = " + DEFAULT_HOST);
        System.out.println("  PI              = " + PI);
        System.out.println("  Convention: UPPER_SNAKE_CASE for public static final constants");
    }
}
