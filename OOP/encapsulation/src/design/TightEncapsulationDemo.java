package design;

public class TightEncapsulationDemo {

    // ========== 1. MINIMAL PUBLIC API ==========
    // Only expose what callers need; hide everything else
    static class TemperatureSensor {
        private double rawReading;       // internal representation (Kelvin)
        private boolean calibrated;

        TemperatureSensor(double kelvin) {
            this.rawReading = kelvin;
            this.calibrated = true;
        }

        // PUBLIC: what callers need
        public double getCelsius() {
            return rawReading - 273.15;
        }

        public double getFahrenheit() {
            return getCelsius() * 9.0 / 5.0 + 32;
        }

        // PRIVATE: internal implementation detail
        private void recalibrate() {
            rawReading += 0.01;  // tiny adjustment
            calibrated = true;
        }

        // The caller never knows we store in Kelvin internally.
        // We could change to Celsius internally and callers wouldn't notice.
    }

    // ========== 2. INFORMATION HIDING: Change internals without breaking callers ==========
    // Version 1: stores full name as one string
    static class PersonV1 {
        private String fullName;

        PersonV1(String first, String last) {
            this.fullName = first + " " + last;
        }

        public String getFullName() { return fullName; }
    }

    // Version 2: changed internal representation to two fields
    // but the PUBLIC API (getFullName()) stays the same!
    static class PersonV2 {
        private String firstName;
        private String lastName;

        PersonV2(String first, String last) {
            this.firstName = first;
            this.lastName = last;
        }

        public String getFullName() { return firstName + " " + lastName; }

        // New: added without breaking existing callers
        public String getFirstName() { return firstName; }
        public String getLastName()  { return lastName; }
    }

    // ========== 3. FINAL CLASS: prevent subclass from breaking encapsulation ==========
    static final class ImmutablePoint {
        private final int x;
        private final int y;

        ImmutablePoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() { return x; }
        public int getY() { return y; }

        public double distanceTo(ImmutablePoint other) {
            int dx = this.x - other.x;
            int dy = this.y - other.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        @Override
        public String toString() { return "(" + x + ", " + y + ")"; }
    }

    // WON'T COMPILE: ImmutablePoint is final, cannot extend
    // static class MutablePoint extends ImmutablePoint {
    //     private int x;  // could shadow parent's x and break immutability!
    //     MutablePoint(int x, int y) { super(x, y); this.x = x; }
    //     public void setX(int x) { this.x = x; }  // breaks parent's contract
    // }

    // ========== 4. PACKAGE-PRIVATE HELPER: not part of public API ==========
    // (This class is NOT public -- only visible within the 'design' package)

    public static void run() {
        // --- Minimal public API ---
        System.out.println("--- Tight Encapsulation: Minimal Public API ---");
        TemperatureSensor sensor = new TemperatureSensor(373.15);  // 100°C (boiling)
        System.out.println("  getCelsius()    = " + sensor.getCelsius() + "°C");
        System.out.println("  getFahrenheit() = " + sensor.getFahrenheit() + "°F");
        System.out.println("  Internal storage (Kelvin) is HIDDEN from callers.");
        System.out.println("  We could change to store Celsius internally and no caller would break.");

        // WON'T COMPILE: rawReading is private
        // System.out.println(sensor.rawReading);

        // WON'T COMPILE: recalibrate() is private
        // sensor.recalibrate();

        // --- Information hiding ---
        System.out.println();
        System.out.println("--- Information Hiding: Change Internals Safely ---");
        PersonV1 v1 = new PersonV1("John", "Doe");
        PersonV2 v2 = new PersonV2("John", "Doe");
        System.out.println("  PersonV1.getFullName() = " + v1.getFullName() + " (stores as one string)");
        System.out.println("  PersonV2.getFullName() = " + v2.getFullName() + " (stores as two strings)");
        System.out.println("  -> Same public API, different internal representation.");
        System.out.println("  -> Callers using getFullName() didn't need to change at all.");
        System.out.println("  -> This is the POWER of information hiding: freedom to refactor internals.");

        // --- Final class ---
        System.out.println();
        System.out.println("--- final Class: Prevent Subclass Breaking Encapsulation ---");
        ImmutablePoint p1 = new ImmutablePoint(3, 4);
        ImmutablePoint p2 = new ImmutablePoint(0, 0);
        System.out.println("  p1 = " + p1 + ", p2 = " + p2);
        System.out.println("  p1.distanceTo(p2) = " + p1.distanceTo(p2));
        System.out.println("  ImmutablePoint is 'final' -> no subclass can add setters or");
        System.out.println("  shadow fields to break immutability.");
        System.out.println("  Example: String, Integer, and all wrapper classes are final.");

        // --- Package-private helpers ---
        System.out.println();
        System.out.println("--- Package-Private Classes (Package-Level Encapsulation) ---");
        System.out.println("  Not all classes need to be public.");
        System.out.println("  Package-private (default access) classes are implementation details:");
        System.out.println("    class InternalHelper { ... }  // no 'public' keyword");
        System.out.println("  Only classes in the same package can see them.");
        System.out.println("  This prevents external code from depending on your internals.");
        System.out.println("  Example: many JDK classes are package-private (e.g., java.lang.AbstractStringBuilder)");

        // --- Summary ---
        System.out.println();
        System.out.println("TIGHT ENCAPSULATION CHECKLIST:");
        System.out.println("  1. Make fields private (always)");
        System.out.println("  2. Expose only necessary getters/setters (not all fields!)");
        System.out.println("  3. Use business methods instead of raw setters where possible");
        System.out.println("  4. Make classes final if they shouldn't be extended");
        System.out.println("  5. Use package-private for internal helper classes");
        System.out.println("  6. Return defensive copies of mutable objects");
        System.out.println("  7. Hide internal representation -- callers depend on API, not implementation");
    }
}
