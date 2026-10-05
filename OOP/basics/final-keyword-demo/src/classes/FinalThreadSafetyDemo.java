package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinalThreadSafetyDemo {

    // Complete immutable class with defensive copies
    static final class Money {
        private final String currency;
        private final double amount;
        private final List<String> auditLog;

        Money(String currency, double amount, List<String> auditLog) {
            this.currency = currency;
            this.amount = amount;
            this.auditLog = new ArrayList<>(auditLog);  // defensive copy
        }

        String getCurrency() { return currency; }
        double getAmount() { return amount; }
        List<String> getAuditLog() {
            return Collections.unmodifiableList(auditLog);  // unmodifiable view
        }

        @Override
        public String toString() {
            return currency + " " + amount + " (audit: " + auditLog + ")";
        }
    }

    public static void run() {
        // --- final and thread safety (JMM) ---
        System.out.println("--- final and Thread Safety ---");
        System.out.println();
        System.out.println("Java Memory Model (JMM) guarantee:");
        System.out.println("  Once a constructor completes, final fields are guaranteed to be");
        System.out.println("  visible to ALL threads -- no explicit synchronization needed.");
        System.out.println();
        System.out.println("  Without final: another thread might see a partially-constructed");
        System.out.println("  object (field has default value 0/null instead of the assigned value).");
        System.out.println("  With final: the JVM inserts a memory barrier after the constructor,");
        System.out.println("  ensuring all final fields are properly published.");

        // --- Why String is final ---
        System.out.println();
        System.out.println("--- Why is String final? ---");
        System.out.println("  1. SECURITY: Strings are used in class loading, file paths, network");
        System.out.println("     connections. If someone could subclass String and override methods,");
        System.out.println("     they could alter these critical operations.");
        System.out.println("  2. STRING POOL: The JVM caches String literals. Immutability ensures");
        System.out.println("     shared references are safe (no one can modify a pooled String).");
        System.out.println("  3. HASHCODE CACHING: String caches its hashCode. This is only safe");
        System.out.println("     because the content never changes (used extensively in HashMap).");
        System.out.println("  4. THREAD SAFETY: Immutable objects are inherently thread-safe.");
        System.out.println("     No synchronization needed when sharing Strings across threads.");

        // --- Complete immutable class with defensive copies ---
        System.out.println();
        System.out.println("--- Complete Immutable Class (with defensive copies) ---");
        List<String> log = new ArrayList<>();
        log.add("created");
        Money m = new Money("INR", 1000.0, log);
        System.out.println("  Created: " + m);

        log.add("HACKED!");
        System.out.println("  After modifying original list: " + m);
        System.out.println("  -> Object unchanged (constructor made a defensive copy)");

        try {
            m.getAuditLog().add("HACKED VIA GETTER!");
        } catch (UnsupportedOperationException e) {
            System.out.println("  -> Getter returns unmodifiable view: " + e.getClass().getSimpleName());
        }

        // --- final and performance ---
        System.out.println();
        System.out.println("--- final and Performance ---");
        System.out.println("  1. Final methods: JVM can INLINE them (replace call with body)");
        System.out.println("     because it knows they won't be overridden.");
        System.out.println("  2. Final variables: compiler can perform constant folding");
        System.out.println("     (compute at compile time instead of runtime).");
        System.out.println("  3. Final classes: JVM can optimize virtual method dispatch");
        System.out.println("     since no subclass can exist.");
        System.out.println("  NOTE: Modern JVMs are smart enough to optimize even without final,");
        System.out.println("  but final makes the intent explicit and guarantees the optimization.");
    }
}
