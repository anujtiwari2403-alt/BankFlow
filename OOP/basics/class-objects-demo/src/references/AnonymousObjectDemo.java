package references;

import basics.Student;

public class AnonymousObjectDemo {
    public static void run() {

        // 1. Anonymous object used directly in println
        System.out.println("1) Anonymous object in println:");
        System.out.println("   " + new Student("Temp", 20, "A"));

        // 2. Anonymous object passed directly to a method
        System.out.println("2) Anonymous object passed to a method:");
        printStudentInfo(new Student("Guest", 18, "B+"));

        // 3. Method chaining on an anonymous object
        //    (toString() returns a String, and we call .toUpperCase() on it)
        System.out.println("3) Method chaining on anonymous object:");
        String upper = new Student("Demo", 25, "A+").toString().toUpperCase();
        System.out.println("   " + upper);

        // 4. Key takeaway
        System.out.println();
        System.out.println("NOTE: Anonymous objects have no variable name, so they");
        System.out.println("      cannot be reused after the statement executes.");
        System.out.println("      They are handy for one-off usage like passing to a");
        System.out.println("      method or quick toString() calls.");
    }

    static void printStudentInfo(Student s) {
        System.out.println("   Received -> " + s);
    }
}
