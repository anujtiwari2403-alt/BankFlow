package basics;

import java.util.ArrayList;
import java.util.List;

public class CopyConstructorDemo {

    // --- Class with a copy constructor ---
    static class Address {
        String city;
        String zip;

        Address(String city, String zip) {
            this.city = city;
            this.zip = zip;
        }

        // COPY CONSTRUCTOR
        Address(Address other) {
            this.city = other.city;
            this.zip = other.zip;
        }

        @Override
        public String toString() { return city + " " + zip; }
    }

    static class Person {
        String name;
        Address address;  // mutable reference field

        Person(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        // SHALLOW copy constructor: copies the reference, NOT the object
        Person(Person other, boolean shallow) {
            this.name = other.name;
            this.address = other.address;  // same Address object!
        }

        // DEEP copy constructor: creates a new copy of the Address too
        Person(Person other) {
            this.name = other.name;
            this.address = new Address(other.address);  // new Address object
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', address=" + address + "}";
        }
    }

    public static void run() {
        System.out.println("--- Copy Constructor ---");
        Address addr = new Address("Mumbai", "400001");
        Person original = new Person("Alice", addr);
        System.out.println("Original: " + original);

        System.out.println();
        System.out.println("1) SHALLOW copy (shares the Address object):");
        Person shallowCopy = new Person(original, true);
        shallowCopy.address.city = "Delhi";
        System.out.println("   After changing shallowCopy.address.city to 'Delhi':");
        System.out.println("   shallowCopy: " + shallowCopy);
        System.out.println("   original:    " + original + "  <-- ALSO changed!");

        // Reset
        addr.city = "Mumbai";

        System.out.println();
        System.out.println("2) DEEP copy (creates a new Address object):");
        Person deepCopy = new Person(original);
        deepCopy.address.city = "Bangalore";
        System.out.println("   After changing deepCopy.address.city to 'Bangalore':");
        System.out.println("   deepCopy:  " + deepCopy);
        System.out.println("   original:  " + original + "  <-- NOT changed!");

        System.out.println();
        System.out.println("KEY: Shallow copy shares references. Deep copy clones nested objects.");
        System.out.println("     Always use deep copy for mutable fields to avoid surprises.");
    }
}
