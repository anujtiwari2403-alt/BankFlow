package getters;

import java.util.List;

public class GetterSetterDemo {

    public static void run() {
        // --- Boolean getter ---
        System.out.println("--- Boolean Getter Convention ---");
        Employee emp = new Employee("John", "Doe", 75000);
        System.out.println("  isActive() = " + emp.isActive() + "  (NOT getActive())");
        System.out.println("  Convention: boolean fields use 'is' prefix, not 'get'");

        // --- Computed property ---
        System.out.println();
        System.out.println("--- Computed / Derived Property ---");
        System.out.println("  getFullName() = " + emp.getFullName());
        System.out.println("  -> No 'fullName' field exists; computed from firstName + lastName");

        // --- Fluent setters ---
        System.out.println();
        System.out.println("--- Fluent Setters (method chaining) ---");
        emp.setFirstName("Jane")
           .setLastName("Smith")
           .setSalary(85000)
           .setActive(true)
           .addHobby("Reading")
           .addHobby("Hiking");
        System.out.println("  After chaining: " + emp);
        System.out.println("  Each setter returns 'this', enabling: emp.setX().setY().setZ()");

        // --- Write-only field (password) ---
        System.out.println();
        System.out.println("--- Write-Only Field (Password) ---");
        emp.setPassword("secure123");
        System.out.println("  Password set successfully (no getPassword() method exists)");
        System.out.println("  checkPassword(\"wrong\")    = " + emp.checkPassword("wrong"));
        System.out.println("  checkPassword(\"secure123\") = " + emp.checkPassword("secure123"));

        // WON'T COMPILE: no getter for password
        // String pw = emp.getPassword();

        // WON'T COMPILE: field is private
        // String pw = emp.password;

        try {
            emp.setPassword("123");  // too short
        } catch (IllegalArgumentException e) {
            System.out.println("  setPassword(\"123\") -> " + e.getMessage());
        }

        // --- Defensive copy in getter ---
        System.out.println();
        System.out.println("--- Defensive Copy in Getter ---");
        List<String> hobbies = emp.getHobbies();
        System.out.println("  getHobbies() = " + hobbies);
        try {
            hobbies.add("Hacking the list!");
        } catch (UnsupportedOperationException e) {
            System.out.println("  Tried to add to returned list -> UnsupportedOperationException!");
            System.out.println("  -> getHobbies() returns an unmodifiable view. Internal state safe.");
        }

        // --- Defensive copy in setter ---
        System.out.println();
        System.out.println("--- Defensive Copy in Setter ---");
        java.util.ArrayList<String> externalList = new java.util.ArrayList<>(List.of("Swimming", "Cycling"));
        emp.setHobbies(externalList);
        System.out.println("  Set hobbies from external list: " + emp.getHobbies());
        externalList.add("INJECTED!");
        System.out.println("  After modifying external list: " + externalList);
        System.out.println("  Employee hobbies unchanged:    " + emp.getHobbies());
        System.out.println("  -> setHobbies() made a defensive copy of the input list.");

        // --- Mutable Return Demo ---
        System.out.println();
        MutableReturnDemo.run();
    }
}
