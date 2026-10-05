package getters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MutableReturnDemo {

    // ========== BAD: Returns internal list directly ==========
    static class UnsafeConfig {
        private List<String> allowedHosts = new ArrayList<>(List.of("localhost", "example.com"));

        public List<String> getAllowedHosts() {
            return allowedHosts;  // BAD: returns the actual internal list!
        }

        @Override
        public String toString() {
            return "UnsafeConfig{hosts=" + allowedHosts + "}";
        }
    }

    // ========== GOOD: Returns unmodifiable view ==========
    static class SafeConfig {
        private List<String> allowedHosts = new ArrayList<>(List.of("localhost", "example.com"));

        public List<String> getAllowedHosts() {
            return Collections.unmodifiableList(allowedHosts);  // GOOD: unmodifiable view
        }

        public void addHost(String host) {
            if (host == null || host.isBlank()) {
                throw new IllegalArgumentException("Host cannot be blank");
            }
            if (allowedHosts.contains(host)) {
                System.out.println("    [SKIP] '" + host + "' already exists");
                return;
            }
            allowedHosts.add(host);
            System.out.println("    [ADDED] '" + host + "'");
        }

        @Override
        public String toString() {
            return "SafeConfig{hosts=" + allowedHosts + "}";
        }
    }

    public static void run() {
        System.out.println("--- Mutable Return Problem ---");
        System.out.println();

        // BAD example
        System.out.println("1) UNSAFE: Returning internal list directly");
        UnsafeConfig unsafe = new UnsafeConfig();
        System.out.println("  Before: " + unsafe);

        List<String> hosts = unsafe.getAllowedHosts();
        hosts.add("evil-hacker.com");       // caller modifies internal state!
        hosts.remove("localhost");           // caller removes from internal state!
        System.out.println("  After caller modifies returned list: " + unsafe);
        System.out.println("  -> The internal state was CORRUPTED because we returned the raw list.");

        // GOOD example
        System.out.println();
        System.out.println("2) SAFE: Returning unmodifiable view");
        SafeConfig safe = new SafeConfig();
        System.out.println("  Before: " + safe);

        List<String> safeHosts = safe.getAllowedHosts();
        try {
            safeHosts.add("evil-hacker.com");
        } catch (UnsupportedOperationException e) {
            System.out.println("  Caught UnsupportedOperationException when trying to add to returned list!");
            System.out.println("  -> Unmodifiable list BLOCKS external mutation.");
        }

        System.out.println("  After attempted modification: " + safe + " (unchanged!)");
        System.out.println();

        System.out.println("3) Mutation through dedicated methods (with validation):");
        safe.addHost("api.example.com");
        safe.addHost("localhost");           // duplicate, skipped
        System.out.println("  Final: " + safe);
    }
}
