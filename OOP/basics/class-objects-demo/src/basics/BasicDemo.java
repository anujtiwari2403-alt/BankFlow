package basics;

public class BasicDemo {
    public static void run() {

        // 1. Default constructor
        System.out.println("1) Student created with DEFAULT constructor:");
        Student s1 = new Student();
        System.out.println("   " + s1);

        // 2. Parameterized constructor
        System.out.println("2) Student created with PARAMETERIZED constructor:");
        Student s2 = new Student("Alice", 21, "A");
        System.out.println("   " + s2);

        // 3. Using setters to modify default student
        System.out.println("3) Modifying s1 with setters:");
        s1.setName("Bob");
        s1.setAge(19);
        s1.setGrade("B+");
        s1.displayInfo();

        // 4. Default field values — before our constructor assigns them
        //    Java gives: String → null, int → 0, boolean → false, etc.
        //    Our default constructor overrides these, so let's show
        //    what the constructor actually sets.
        System.out.println("4) Defaults set by OUR constructor (not Java's raw defaults):");
        Student s3 = new Student();
        System.out.println("   getName()  = " + s3.getName());   // "Unknown"
        System.out.println("   getAge()   = " + s3.getAge());    // 0
        System.out.println("   getGrade() = " + s3.getGrade());  // "N/A"

        // 5. Aliasing — two variables pointing to the SAME object
        System.out.println("5) Aliasing demo (two references, one object):");
        Student original = new Student("Eve", 22, "A+");
        Student alias = original;           // alias points to the same object
        System.out.println("   original : " + original);
        System.out.println("   alias    : " + alias);

        alias.setName("Eve (modified via alias)");
        System.out.println("   After alias.setName(...):");
        System.out.println("   original : " + original);
        System.out.println("   alias    : " + alias);
        System.out.println("   Both show the change — they share the same object!");
    }
}
