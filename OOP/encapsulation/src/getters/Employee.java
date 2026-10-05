package getters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private boolean active;
    private String password;          // write-only: setter exists, but NO getter (security)
    private List<String> hobbies;     // mutable collection: needs defensive copy

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.active = true;
        this.password = "changeme";
        this.hobbies = new ArrayList<>();
    }

    // --- Standard getters ---
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName; }
    public double getSalary()    { return salary; }

    // --- Boolean getter: isActive() NOT getActive() (JavaBeans convention) ---
    public boolean isActive() { return active; }

    // --- Computed / derived property: no backing field ---
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // --- Write-only field: setter but NO getter (password should never be exposed) ---
    public void setPassword(String password) {
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("Password must be at least 6 characters");
        }
        this.password = password;
    }

    // NO getPassword() method -- write-only for security
    // WON'T COMPILE if someone tries: employee.password (field is private)

    public boolean checkPassword(String attempt) {
        return this.password.equals(attempt);
    }

    // --- Fluent setters: return 'this' for method chaining ---
    public Employee setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Employee setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Employee setSalary(double salary) {
        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.salary = salary;
        return this;
    }

    public Employee setActive(boolean active) {
        this.active = active;
        return this;
    }

    // --- Defensive copy in SETTER: copy the input to prevent caller from mutating our state ---
    public Employee setHobbies(List<String> hobbies) {
        this.hobbies = new ArrayList<>(hobbies);  // defensive copy!
        return this;
    }

    // --- Defensive copy in GETTER: return unmodifiable view ---
    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public Employee addHobby(String hobby) {
        if (hobby != null && !hobby.isBlank()) {
            hobbies.add(hobby);
        }
        return this;
    }

    @Override
    public String toString() {
        return "Employee{name='" + getFullName() + "', salary=" + salary
                + ", active=" + active + ", hobbies=" + hobbies + "}";
    }
}
