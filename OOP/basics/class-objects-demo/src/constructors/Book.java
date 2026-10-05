package constructors;

public class Book {
    private String title;
    private String author;
    private double price;
    private final String isbn;   // blank final — must be assigned exactly once in every constructor path

    // No-arg → chains to the master (4-arg) constructor
    public Book() {
        this("Untitled", "Unknown", 0.0, "000-0000000000");
    }

    // 1-arg (title) → chains to master
    public Book(String title) {
        this(title, "Unknown", 0.0, "000-0000000000");
    }

    // 2-arg (title, author) → chains to master
    public Book(String title, String author) {
        this(title, author, 0.0, "000-0000000000");
    }

    // 3-arg (title, author, price) → chains to master
    public Book(String title, String author, double price) {
        this(title, author, price, "000-0000000000");
    }

    // 4-arg "master" constructor — every other constructor eventually calls this one
    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;          // final field assigned here — only once
    }

    // WON'T COMPILE: this() must be the FIRST statement in a constructor
    // public Book(boolean dummy) {
    //     System.out.println("something first");
    //     this("Untitled", "Unknown", 0.0, "000-0000000000");
    // }

    // WON'T COMPILE: circular constructor invocation
    // public Book(int dummy) { this(true); }
    // public Book(boolean dummy) { this(1); }

    // isbn is final, so there is no setIsbn() method.
    // WON'T COMPILE: assigning a final field outside the constructor
    // public void setIsbn(String isbn) { this.isbn = isbn; }

    public String getTitle()  { return title; }
    public String getAuthor() { return author; }
    public double getPrice()  { return price; }
    public String getIsbn()   { return isbn; }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author
                + "', price=" + price + ", isbn='" + isbn + "'}";
    }
}
