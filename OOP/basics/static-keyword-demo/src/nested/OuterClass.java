package nested;

public class OuterClass {
    private int outerInstanceField = 100;
    private static int outerStaticField = 200;

    // STATIC nested class: does NOT have access to outer instance members
    public static class StaticNested {
        public void display() {
            System.out.println("  [StaticNested] Can access outerStaticField = " + outerStaticField);
            // WON'T COMPILE: non-static field cannot be referenced from a static context
            // System.out.println(outerInstanceField);
        }
    }

    // NON-STATIC inner class: HAS access to outer instance members
    public class Inner {
        public void display() {
            System.out.println("  [Inner] Can access outerStaticField = " + outerStaticField);
            System.out.println("  [Inner] Can access outerInstanceField = " + outerInstanceField);
        }
    }

    public int getOuterInstanceField() { return outerInstanceField; }
}
