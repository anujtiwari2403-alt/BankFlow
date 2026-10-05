package references;

public class ObjectClassMethodsDemo {

    static class MyObject implements Cloneable {
        int value;

        MyObject(int value) { this.value = value; }

        @Override
        public String toString() { return "MyObject{value=" + value + "}"; }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof MyObject)) return false;
            return this.value == ((MyObject) obj).value;
        }

        @Override
        public int hashCode() { return Integer.hashCode(value); }

        @Override
        public MyObject clone() {
            try {
                return (MyObject) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void run() {
        System.out.println("--- Object Class Methods (all 11) ---");
        MyObject obj = new MyObject(42);

        System.out.println();
        System.out.println("1) toString()  : " + obj.toString());
        System.out.println("   -> Human-readable representation. Override for meaningful output.");

        System.out.println();
        System.out.println("2) equals()    : " + obj.equals(new MyObject(42)));
        System.out.println("   -> Content equality. Default compares references (==).");

        System.out.println();
        System.out.println("3) hashCode()  : " + obj.hashCode());
        System.out.println("   -> Must be consistent with equals(). Used by HashMap, HashSet.");

        System.out.println();
        System.out.println("4) getClass()  : " + obj.getClass().getName());
        System.out.println("   -> Returns runtime class. Cannot be overridden (final method).");

        System.out.println();
        MyObject cloned = obj.clone();
        System.out.println("5) clone()     : " + cloned + " (copy of original)");
        System.out.println("   -> Shallow copy. Must implement Cloneable. Override for deep copy.");
        System.out.println("   -> obj == cloned : " + (obj == cloned) + " (different objects)");

        System.out.println();
        System.out.println("6) finalize()  : DEPRECATED since Java 9");
        System.out.println("   -> Called by GC before reclaiming. Unreliable. Use try-with-resources.");

        System.out.println();
        System.out.println("7-9) wait(), notify(), notifyAll():");
        System.out.println("   -> Thread synchronization. Must be called within synchronized block.");
        System.out.println("   -> wait()      : releases lock, thread waits until notified");
        System.out.println("   -> notify()    : wakes up one waiting thread");
        System.out.println("   -> notifyAll() : wakes up ALL waiting threads");

        System.out.println();
        System.out.println("--- getClass() vs instanceof ---");
        Object parent = new MyObject(10);
        System.out.println("  parent.getClass() == MyObject.class : " + (parent.getClass() == MyObject.class));
        System.out.println("  parent instanceof MyObject          : " + (parent instanceof MyObject));
        System.out.println("  parent instanceof Object            : " + (parent instanceof Object));
        System.out.println("  getClass() checks EXACT type, instanceof checks type hierarchy");
    }
}
