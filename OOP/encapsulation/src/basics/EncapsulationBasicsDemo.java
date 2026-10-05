package basics;

public class EncapsulationBasicsDemo {

    public static void run() {
        System.out.println("--- What is Encapsulation? ---");
        System.out.println("  1. Data Hiding: fields are private, not directly accessible");
        System.out.println("  2. Bundling: data + methods that operate on it live in one class");
        System.out.println("  3. Controlled Access: public getters/setters with validation");
        System.out.println();

        BankAccount account = new BankAccount("ACC-1001", "Alice", 1000.0);
        System.out.println("Created: " + account);

        // --- Validation in action ---
        System.out.println();
        System.out.println("--- Validation in Setters / Methods ---");
        account.deposit(500);
        account.withdraw(200);
        account.deposit(-100);       // rejected: negative
        account.withdraw(5000);      // rejected: insufficient funds

        System.out.println();
        System.out.println("Final state: " + account);

        // --- Why public fields are bad ---
        System.out.println();
        System.out.println("--- Why Public Fields Are Bad ---");
        System.out.println("  If 'balance' were public, anyone could do:");
        System.out.println("    account.balance = -1000;  // no validation, no audit trail!");

        // WON'T COMPILE: balance is private
        // account.balance = -1000;

        System.out.println("  With encapsulation, the ONLY way to change balance is through");
        System.out.println("  deposit() and withdraw(), which enforce business rules.");

        // --- Read-only field ---
        System.out.println();
        System.out.println("--- Read-Only Fields ---");
        System.out.println("  accountNumber = " + account.getAccountNumber());
        System.out.println("  There is no setAccountNumber() -- it's set once in the constructor.");
        System.out.println("  This prevents accidental or malicious changes to the account number.");

        // WON'T COMPILE: no setter exists
        // account.setAccountNumber("HACKED-999");

        // --- Encapsulation vs Information Hiding ---
        System.out.println();
        System.out.println("--- Encapsulation vs Information Hiding (Interview Q) ---");
        System.out.println("  ENCAPSULATION = bundling data + methods into a class");
        System.out.println("    (the 'capsule' that holds everything together)");
        System.out.println("  INFORMATION HIDING = making internal details invisible to outsiders");
        System.out.println("    (using private/protected to hide fields and implementation)");
        System.out.println();
        System.out.println("  They are related but distinct:");
        System.out.println("  - You can have encapsulation WITHOUT hiding (public fields in a class)");
        System.out.println("  - Information hiding is the GOAL; encapsulation is the MECHANISM");
        System.out.println("  - In practice, good encapsulation always includes information hiding.");
    }
}
