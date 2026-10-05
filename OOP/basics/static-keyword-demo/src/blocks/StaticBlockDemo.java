package blocks;

public class StaticBlockDemo {
    public static void run() {
        System.out.println("Creating first DatabaseConfig...");
        DatabaseConfig db1 = new DatabaseConfig("alpha");
        System.out.println("  Result: " + db1);

        System.out.println();
        System.out.println("Creating second DatabaseConfig...");
        DatabaseConfig db2 = new DatabaseConfig("beta");
        System.out.println("  Result: " + db2);

        System.out.println();
        System.out.println("Summary:");
        System.out.println("  Static block ran only ONCE (when the class was first loaded).");
        System.out.println("  Instance block + constructor ran for EACH object.");
        System.out.println("  Execution order: static block -> instance block -> constructor");
    }
}
