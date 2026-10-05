package constructors;

public class ConstructorDemo {
    public static void run() {

        // 1. No-arg constructor
        System.out.println("1) Book() — no arguments:");
        Book b1 = new Book();
        System.out.println("   " + b1);

        // 2. 1-arg constructor (title only)
        System.out.println("2) Book(title):");
        Book b2 = new Book("Java: The Complete Reference");
        System.out.println("   " + b2);

        // 3. 2-arg constructor (title, author)
        System.out.println("3) Book(title, author):");
        Book b3 = new Book("Effective Java", "Joshua Bloch");
        System.out.println("   " + b3);

        // 4. Full 4-arg constructor
        System.out.println("4) Book(title, author, price, isbn) — master constructor:");
        Book b4 = new Book("Head First Java", "Kathy Sierra", 49.99, "978-0596009205");
        System.out.println("   " + b4);

        // 5. Note about chaining
        System.out.println();
        System.out.println("NOTE: Every shorter constructor chains to the 4-arg 'master'");
        System.out.println("      constructor using this(...).  This avoids duplicating");
        System.out.println("      field-assignment logic and guarantees the final field");
        System.out.println("      'isbn' is always assigned exactly once.");
    }
}
