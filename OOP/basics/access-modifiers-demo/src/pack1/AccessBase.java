package pack1;

public class AccessBase {
    public int pubField = 1;
    protected int protField = 2;
    int defaultField = 3; // package-private (default)
    private int privField = 4;

// public methods
    public String pubMethod() {
        return "pubMethod";
    }
// protected methods
    protected String protMethod() {
        return "protMethod";
    }

// default methods
    String defaultMethod() {
        return "defaultMethod";
    }

// private methods
    private String privMethod() {
        return "privMethod";
    }
// public methods to access private fields
    public int readPrivateInsideClass() {
        return privField;
    }
// public methods to access private methods
    public String callPrivateInsideClass() {
        return privMethod();
    }
}

