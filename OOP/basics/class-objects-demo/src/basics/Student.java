package basics;

public class Student {
    private String name;
    private int age;
    private String grade;

    // Default constructor — sets safe defaults
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = "N/A";
    }

    // Parameterized constructor — all three fields
    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // ---------- Getters ----------

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    // ---------- Setters ----------

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // ---------- Display / toString ----------

    public void displayInfo() {
        System.out.println("  Name : " + name);
        System.out.println("  Age  : " + age);
        System.out.println("  Grade: " + grade);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade='" + grade + "'}";
    }
}
