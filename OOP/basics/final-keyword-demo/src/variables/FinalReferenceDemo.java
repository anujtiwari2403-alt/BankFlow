package variables;

public class FinalReferenceDemo {

    static class MutableBox {
        public int value;

        MutableBox(int value) {
            this.value = value;
        }
    }

    public static void run() {
        // 1. final reference to an ArrayList
        final java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Alice");   // OK: modifying the object's content
        names.add("Bob");     // OK
        System.out.println("1) final ArrayList: names = " + names);

        // WON'T COMPILE: cannot assign a value to final variable names
        // names = new java.util.ArrayList<>();

        // 2. final reference to a custom mutable object
        final MutableBox box = new MutableBox(10);
        System.out.println("2) final MutableBox: box.value = " + box.value + " (original)");
        box.value = 20;  // OK: changing the object's content
        System.out.println("   After box.value = 20: box.value = " + box.value);

        // WON'T COMPILE: cannot assign a value to final variable box
        // box = new MutableBox(30);

        // 3. Summary
        System.out.println();
        System.out.println("   KEY INSIGHT: final means the REFERENCE cannot change,");
        System.out.println("   but the OBJECT it points to CAN be modified.");
    }
}
