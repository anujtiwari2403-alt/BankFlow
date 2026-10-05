package references;

public class PassByValueDemo {

    // Simple inner class for the demo
    static class Box {
        public int value;

        Box(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Box{value=" + value + "}";
        }
    }

    public static void run() {

        // --- Object reference demo ---
        System.out.println("--- Object references ---");
        Box box = new Box(10);
        System.out.println("Before modifyContent(): " + box);

        modifyContent(box);
        System.out.println("After  modifyContent(): " + box);
        System.out.println("  => Change IS visible — the method mutated the same object.");

        System.out.println();
        System.out.println("Before reassignReference(): " + box);

        reassignReference(box);
        System.out.println("After  reassignReference(): " + box);
        System.out.println("  => Change is NOT visible — the method only reassigned its");
        System.out.println("     local copy of the reference, not the caller's variable.");

        // --- Primitive demo ---
        System.out.println();
        System.out.println("--- Primitives ---");
        int num = 42;
        System.out.println("Before modifyPrimitive(): num = " + num);

        modifyPrimitive(num);
        System.out.println("After  modifyPrimitive(): num = " + num);
        System.out.println("  => Unchanged — Java passes a COPY of the primitive value.");
    }

    static void modifyContent(Box b) {
        b.value = 99;    // mutates the object that b points to
    }

    static void reassignReference(Box b) {
        b = new Box(999); // b now points to a NEW object — caller's reference is unaffected
        System.out.println("  (inside reassignReference: " + b + ")");
    }

    static void modifyPrimitive(int n) {
        n = 0;            // only changes the local copy
        System.out.println("  (inside modifyPrimitive: n = " + n + ")");
    }
}
