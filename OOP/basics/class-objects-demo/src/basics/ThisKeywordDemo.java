package basics;

public class ThisKeywordDemo {

    // ========== USE 1: Field disambiguation (already in Student.java, recap) ==========
    // ========== USE 2: Constructor chaining (already in Book.java, recap) ==========
    // ========== USE 3: Passing 'this' as an argument ==========
    // ========== USE 4: Returning 'this' for fluent API / builder pattern ==========

    // --- Builder pattern using 'return this' ---
    static class EmailBuilder {
        private String to;
        private String subject;
        private String body;
        private boolean urgent;

        EmailBuilder to(String to)           { this.to = to; return this; }
        EmailBuilder subject(String subject) { this.subject = subject; return this; }
        EmailBuilder body(String body)       { this.body = body; return this; }
        EmailBuilder urgent(boolean urgent)  { this.urgent = urgent; return this; }

        String build() {
            return "Email{to='" + to + "', subject='" + subject
                    + "', body='" + body + "', urgent=" + urgent + "}";
        }
    }

    // --- Passing 'this' to a method ---
    static class EventSource {
        private String name;

        EventSource(String name) { this.name = name; }

        void fireEvent(EventListener listener) {
            System.out.println("  [EventSource] Firing event from '" + name + "'");
            listener.onEvent(this);  // passing 'this' as argument
        }

        String getName() { return name; }
    }

    interface EventListener {
        void onEvent(EventSource source);
    }

    // WON'T COMPILE: 'this' cannot be used in a static context
    // static void attemptThisInStatic() {
    //     System.out.println(this.toString());  // error: non-static variable this
    // }

    public static void run() {
        System.out.println("--- 'this' keyword: All 4 Uses ---");

        System.out.println();
        System.out.println("USE 1: Field disambiguation (this.field = param)");
        System.out.println("  See Student.java constructor: this.name = name;");

        System.out.println();
        System.out.println("USE 2: Constructor chaining (this(...))");
        System.out.println("  See Book.java: this(title, \"Unknown\", 0.0, \"000\");");

        System.out.println();
        System.out.println("USE 3: Passing 'this' as an argument");
        EventSource source = new EventSource("Button");
        source.fireEvent(src ->
            System.out.println("  [Listener] Received event from: " + src.getName())
        );  

        System.out.println();
        System.out.println("USE 4: Returning 'this' for fluent API / builder pattern");
        String email = new EmailBuilder()
                .to("bob@example.com")
                .subject("Meeting")
                .body("Let's meet at 3 PM")
                .urgent(true)
                .build();
        System.out.println("  Built: " + email);
        System.out.println("  Each setter returns 'this' so calls can be chained.");
    }
}
