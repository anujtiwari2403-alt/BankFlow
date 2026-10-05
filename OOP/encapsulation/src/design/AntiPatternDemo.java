package design;

import java.lang.reflect.Field;

public class AntiPatternDemo {

    // ========== ANTI-PATTERN 1: Public fields (no encapsulation) ==========
    static class PublicFieldPerson {
        public String name;      // anyone can set to null, "", or anything
        public int age;          // anyone can set to -999
        public double salary;    // anyone can set to negative

        PublicFieldPerson(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "PublicFieldPerson{name='" + name + "', age=" + age + ", salary=" + salary + "}";
        }
    }

    // ========== ANTI-PATTERN 2: Anemic model (getters/setters only, no behavior) ==========
    static class AnemicAccount {
        private double balance;

        public double getBalance() { return balance; }
        public void setBalance(double balance) { this.balance = balance; }
    }

    // ========== GOOD: Rich domain model (behavior encapsulated) ==========
    static class RichAccount {
        private double balance;

        RichAccount(double initialBalance) {
            if (initialBalance < 0) throw new IllegalArgumentException("Cannot start with negative balance");
            this.balance = initialBalance;
        }

        public double getBalance() { return balance; }

        // No setBalance()! State changes only through meaningful business methods
        public void deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Withdrawal must be positive");
            if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
            balance -= amount;
        }

        public void transfer(RichAccount target, double amount) {
            this.withdraw(amount);
            target.deposit(amount);
        }
    }

    // ========== ANTI-PATTERN 3: Reflection bypass ==========
    static class SecretVault {
        private String secretCode = "TOP-SECRET-42";

        public String getHint() { return "The code has " + secretCode.length() + " characters"; }

        // No getter for secretCode -- it's meant to be hidden!
    }

    public static void run() {
        // --- Anti-pattern 1: Public fields ---
        System.out.println("--- Anti-Pattern 1: Public Fields ---");
        PublicFieldPerson person = new PublicFieldPerson("Alice", 30, 50000);
        System.out.println("  Created: " + person);

        person.age = -999;
        person.salary = -1;
        person.name = "";
        System.out.println("  After direct field access: " + person);
        System.out.println("  -> NO validation, NO protection. Anyone can set invalid values.");
        System.out.println("  -> NEVER use public fields (except for constants: public static final).");

        // --- Anti-pattern 2: Anemic model ---
        System.out.println();
        System.out.println("--- Anti-Pattern 2: Anemic Domain Model ---");
        AnemicAccount anemic = new AnemicAccount();
        anemic.setBalance(1000);
        System.out.println("  balance = " + anemic.getBalance());

        anemic.setBalance(-999999);  // no validation!
        System.out.println("  After setBalance(-999999): " + anemic.getBalance());
        System.out.println("  -> Anemic model: class is just a data holder with getters/setters");
        System.out.println("  -> Business logic lives OUTSIDE the class (in services/controllers)");
        System.out.println("  -> Result: no validation, no invariant protection");

        System.out.println();
        System.out.println("  GOOD: Rich Domain Model");
        RichAccount rich = new RichAccount(1000);
        rich.deposit(500);
        System.out.println("  After deposit(500): " + rich.getBalance());

        try {
            rich.withdraw(5000);
        } catch (IllegalArgumentException e) {
            System.out.println("  withdraw(5000) -> " + e.getMessage());
        }

        // No setBalance() exists -- state changes only via business methods
        // WON'T COMPILE: no setBalance() method
        // rich.setBalance(-999999);

        System.out.println("  -> Rich model: behavior is INSIDE the class with validation");
        System.out.println("  -> Class protects its own invariants (balance >= 0)");

        // --- Anti-pattern 3: Reflection bypass ---
        System.out.println();
        System.out.println("--- Anti-Pattern 3: Reflection Bypasses private ---");
        SecretVault vault = new SecretVault();
        System.out.println("  vault.getHint() = " + vault.getHint());
        System.out.println("  No getter for secretCode -- it's meant to stay hidden.");

        try {
            Field field = SecretVault.class.getDeclaredField("secretCode");
            field.setAccessible(true);  // bypasses private!
            String stolen = (String) field.get(vault);
            System.out.println("  Reflection: field.get(vault) = " + stolen + " (private bypassed!)");
            field.set(vault, "HACKED");
            System.out.println("  Reflection: field.set(vault, \"HACKED\") -> hint = " + vault.getHint());
        } catch (Exception e) {
            System.out.println("  Reflection failed: " + e.getMessage());
        }

        System.out.println();
        System.out.println("  CAUTION: Reflection can bypass private access.");
        System.out.println("  This is used by frameworks (Spring, Hibernate) but should NEVER");
        System.out.println("  be used in application code to break encapsulation.");
        System.out.println("  Java Module System (JPMS) can block this with 'opens' directives.");
    }
}
