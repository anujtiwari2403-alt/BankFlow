package classes;

public final class ImmutableConfig {
    private final String appName;
    private final int version;
    private final String environment;

    public ImmutableConfig(String appName, int version, String environment) {
        this.appName = appName;
        this.version = version;
        this.environment = environment;
    }

    public String getAppName() { return appName; }
    public int getVersion() { return version; }
    public String getEnvironment() { return environment; }

    @Override
    public String toString() {
        return "Config[app=" + appName + ", v=" + version + ", env=" + environment + "]";
    }
}
