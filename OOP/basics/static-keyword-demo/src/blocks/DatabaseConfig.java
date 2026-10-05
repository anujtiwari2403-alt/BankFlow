package blocks;

public class DatabaseConfig {
    private static String dbUrl;
    private static int connectionPool;
    private String instanceId;
    private static int instanceCounter = 0;

    // STATIC BLOCK: runs ONCE when the class is first loaded
    static {
        System.out.println("  [Static Block] Loading database configuration...");
        dbUrl = "jdbc:mysql://localhost:3306/mydb";
        connectionPool = 10;
        System.out.println("  [Static Block] DB URL = " + dbUrl);
        System.out.println("  [Static Block] Pool size = " + connectionPool);
    }

    // INSTANCE INITIALIZER BLOCK: runs EACH TIME an object is created (before constructor)
    {
        instanceCounter++;
        System.out.println("  [Instance Block] Creating instance #" + instanceCounter);
    }

    // CONSTRUCTOR: runs EACH TIME after the instance block
    public DatabaseConfig(String instanceId) {
        this.instanceId = instanceId;
        System.out.println("  [Constructor] Instance '" + instanceId + "' ready");
    }

    public static String getDbUrl() { return dbUrl; }
    public static int getConnectionPool() { return connectionPool; }
    public String getInstanceId() { return instanceId; }

    @Override
    public String toString() {
        return "DatabaseConfig[id=" + instanceId + ", url=" + dbUrl + "]";
    }
}
