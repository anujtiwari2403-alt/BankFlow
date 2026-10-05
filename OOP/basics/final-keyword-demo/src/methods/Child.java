package methods;

public class Child extends Parent {

    @Override
    public String disconnect() {
        return "Child: disconnected (overridden)";
    }

    @Override
    public String getStatus() {
        return "Child: status OK (overridden)";
    }

    // WON'T COMPILE: cannot override final method connect() from Parent
    // @Override
    // public String connect() { return "Child: connected"; }
}
