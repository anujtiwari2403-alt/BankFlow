package classes;

public class FinalClassDemo {

    public static void run() {
        ImmutableConfig config = new ImmutableConfig("MyApp", 2, "production");

        System.out.println("Created a final-class instance:");
        System.out.println("  " + config);
        System.out.println("  appName     = " + config.getAppName());
        System.out.println("  version     = " + config.getVersion());
        System.out.println("  environment = " + config.getEnvironment());

        System.out.println();
        System.out.println("  You CAN use a final class (create objects, call methods).");
        System.out.println("  You CANNOT extend it — no subclass is allowed.");

        // WON'T COMPILE: cannot inherit from final ImmutableConfig
        // class ExtendedConfig extends ImmutableConfig {
        //     ExtendedConfig() { super("app", 1, "dev"); }
        // }
    }
}
