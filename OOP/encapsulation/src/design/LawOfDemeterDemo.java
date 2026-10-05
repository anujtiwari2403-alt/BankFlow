package design;

public class LawOfDemeterDemo {

    // ========== Supporting classes ==========
    static class Address {
        private String city;
        private String zipCode;

        Address(String city, String zipCode) {
            this.city = city;
            this.zipCode = zipCode;
        }

        public String getCity() { return city; }
        public String getZipCode() { return zipCode; }
    }

    static class Customer {
        private String name;
        private Address address;

        Customer(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        public String getName() { return name; }
        public Address getAddress() { return address; }

        // GOOD: delegate instead of exposing Address
        public String getCity() { return address.getCity(); }
    }

    // ========== BAD: exposes internals via getter chains ==========
    static class BadOrder {
        private Customer customer;
        private String product;

        BadOrder(Customer customer, String product) {
            this.customer = customer;
            this.product = product;
        }

        public Customer getCustomer() { return customer; }
        public String getProduct() { return product; }
    }

    // ========== GOOD: delegates to internal objects ==========
    static class GoodOrder {
        private Customer customer;
        private String product;

        GoodOrder(Customer customer, String product) {
            this.customer = customer;
            this.product = product;
        }

        public String getProduct() { return product; }

        // Delegation: caller doesn't need to know about Customer or Address
        public String getCustomerName() { return customer.getName(); }
        public String getDeliveryCity() { return customer.getCity(); }
    }

    public static void run() {
        Address address = new Address("Mumbai", "400001");
        Customer customer = new Customer("Alice", address);

        System.out.println("--- Law of Demeter / \"Tell, Don't Ask\" ---");
        System.out.println();

        // BAD: getter chain (train wreck)
        System.out.println("1) BAD -- Getter chain (violates Law of Demeter):");
        BadOrder badOrder = new BadOrder(customer, "Laptop");
        String city = badOrder.getCustomer().getAddress().getCity();
        System.out.println("   badOrder.getCustomer().getAddress().getCity() = " + city);
        System.out.println("   Problems:");
        System.out.println("   - Caller must KNOW the internal structure (Order -> Customer -> Address)");
        System.out.println("   - If Address changes (e.g., city moves to a Location object), callers break");
        System.out.println("   - Tight coupling: caller depends on 3 classes instead of 1");

        // GOOD: delegation
        System.out.println();
        System.out.println("2) GOOD -- Delegation (follows Law of Demeter):");
        GoodOrder goodOrder = new GoodOrder(customer, "Laptop");
        System.out.println("   goodOrder.getDeliveryCity() = " + goodOrder.getDeliveryCity());
        System.out.println("   goodOrder.getCustomerName() = " + goodOrder.getCustomerName());
        System.out.println("   Benefits:");
        System.out.println("   - Caller only talks to GoodOrder (its 'immediate friend')");
        System.out.println("   - Internal structure can change without breaking callers");
        System.out.println("   - Loose coupling: caller depends on 1 class only");

        System.out.println();
        System.out.println("LAW OF DEMETER (a.k.a. Principle of Least Knowledge):");
        System.out.println("  A method should only call methods on:");
        System.out.println("  1. Its own object (this)");
        System.out.println("  2. Objects passed as parameters");
        System.out.println("  3. Objects it creates locally");
        System.out.println("  4. Its direct instance fields");
        System.out.println("  -> Do NOT call methods on objects returned by other methods!");
        System.out.println("  -> \"Only talk to your immediate friends, not strangers.\"");

        System.out.println();
        System.out.println("TELL, DON'T ASK:");
        System.out.println("  Instead of ASKING an object for its internals and making decisions,");
        System.out.println("  TELL the object what to do and let it decide internally.");
        System.out.println("  Bad:  if (account.getBalance() >= amount) account.setBalance(balance - amount);");
        System.out.println("  Good: account.withdraw(amount);  // the object handles the logic");
    }
}
