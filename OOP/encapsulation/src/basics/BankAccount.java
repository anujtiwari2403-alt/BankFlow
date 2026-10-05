package basics;

public class BankAccount {
    private final String accountNumber;  // read-only: set once in constructor, no setter
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double initialBalance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be blank");
        }
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = initialBalance;
    }

    // --- Read-only: getter only, NO setter for accountNumber ---
    public String getAccountNumber() { return accountNumber; }

    // WON'T COMPILE if uncommented: accountNumber is final
    // public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public String getHolderName() { return holderName; }

    public void setHolderName(String holderName) {
        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException("Holder name cannot be blank");
        }
        this.holderName = holderName;
    }

    // balance has a getter but NO public setter -- modified only through deposit/withdraw
    public double getBalance() { return balance; }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("  [REJECTED] Deposit amount must be positive. Got: " + amount);
            return false;
        }
        balance += amount;
        System.out.println("  [OK] Deposited " + amount + ". New balance: " + balance);
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("  [REJECTED] Withdrawal amount must be positive. Got: " + amount);
            return false;
        }
        if (amount > balance) {
            System.out.println("  [REJECTED] Insufficient funds. Balance: " + balance + ", Requested: " + amount);
            return false;
        }
        balance -= amount;
        System.out.println("  [OK] Withdrew " + amount + ". New balance: " + balance);
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{acc='" + accountNumber + "', holder='" + holderName + "', balance=" + balance + "}";
    }
}
