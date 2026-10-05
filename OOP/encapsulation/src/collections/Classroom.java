package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classroom {
    private final String className;
    private final List<String> students;  // mutable internal list

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public String getClassName() { return className; }

    // SAFE getter: returns unmodifiable VIEW (not the internal list)
    public List<String> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public int getStudentCount() { return students.size(); }

    // Controlled mutation with validation
    public boolean addStudent(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("    [REJECTED] Student name cannot be blank");
            return false;
        }
        if (students.contains(name)) {
            System.out.println("    [REJECTED] '" + name + "' is already enrolled");
            return false;
        }
        students.add(name);
        System.out.println("    [ENROLLED] " + name);
        return true;
    }

    public boolean removeStudent(String name) {
        if (!students.contains(name)) {
            System.out.println("    [NOT FOUND] '" + name + "' is not in this class");
            return false;
        }
        students.remove(name);
        System.out.println("    [REMOVED] " + name);
        return true;
    }

    @Override
    public String toString() {
        return "Classroom{name='" + className + "', students=" + students + ", count=" + students.size() + "}";
    }
}
