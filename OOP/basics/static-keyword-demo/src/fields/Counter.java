package fields;

public class Counter {
    private static int count = 0;  // shared across ALL instances
    private int id;                // unique to each instance

    public Counter() {
        count++;
        this.id = count;
    }

    public int getId() { return id; }
    public static int getCount() { return count; }

    public static void resetCount() { count = 0; }

    @Override
    public String toString() {
        return "Counter[id=" + id + ", totalCount=" + count + "]";
    }
}
