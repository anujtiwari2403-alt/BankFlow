package basics;

import java.util.Objects;

public class EqualsHashCodeDemo {

    static class Point {
        private final int x, y;

        Point(int x, int y) { this.x = x; this.y = y; }

        // --- PROPER equals() override ---
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;              // same reference
            if (!(obj instanceof Point)) return false; // type check + null check
            Point other = (Point) obj;
            return this.x == other.x && this.y == other.y;
        }

        // --- PROPER hashCode() override (MUST override if equals is overridden) ---
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() { return "Point(" + x + ", " + y + ")"; }
    }

    public static void run() {
        // --- == vs .equals() on objects ---
        System.out.println("--- == vs .equals() ---");
        Point p1 = new Point(3, 4);
        Point p2 = new Point(3, 4);
        Point p3 = p1;

        System.out.println("p1 = " + p1 + ", p2 = " + p2 + ", p3 = p1");
        System.out.println("  p1 == p2     : " + (p1 == p2) + "  (different objects in memory)");
        System.out.println("  p1.equals(p2): " + p1.equals(p2) + "  (same content)");
        System.out.println("  p1 == p3     : " + (p1 == p3) + "  (same reference)");

        // --- hashCode contract ---
        System.out.println();
        System.out.println("--- hashCode() contract ---");
        System.out.println("  p1.hashCode() = " + p1.hashCode());
        System.out.println("  p2.hashCode() = " + p2.hashCode());
        System.out.println("  Equal objects MUST have the same hashCode.");
        System.out.println("  If you override equals(), you MUST override hashCode().");

        // --- instanceof ---
        System.out.println();
        System.out.println("--- instanceof operator ---");
        Object obj = new Point(1, 2);
        System.out.println("  obj instanceof Point  : " + (obj instanceof Point));
        System.out.println("  obj instanceof Object : " + (obj instanceof Object));
        System.out.println("  null instanceof Point : " + (null instanceof Point) + "  (always false)");

        // --- String pool and == ---
        System.out.println();
        System.out.println("--- String Pool: == vs .equals() ---");
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = s3.intern();

        System.out.println("  s1 = \"Hello\",  s2 = \"Hello\",  s3 = new String(\"Hello\")");
        System.out.println("  s1 == s2           : " + (s1 == s2) + "  (same pool object)");
        System.out.println("  s1 == s3           : " + (s1 == s3) + " (new String creates a separate object)");
        System.out.println("  s1.equals(s3)      : " + s1.equals(s3) + "  (same content)");
        System.out.println("  s1 == s3.intern()  : " + (s1 == s4) + "  (intern() returns pool reference)");

        // --- Integer cache ---
        System.out.println();
        System.out.println("--- Integer Cache: == gotcha ---");
        Integer a = 127, b = 127;
        Integer c = 128, d = 128;
        System.out.println("  Integer 127 == 127 : " + (a == b) + "  (cached: -128 to 127)");
        System.out.println("  Integer 128 == 128 : " + (c == d) + " (outside cache -> different objects)");
        System.out.println("  ALWAYS use .equals() for object comparison!");
    }
}
