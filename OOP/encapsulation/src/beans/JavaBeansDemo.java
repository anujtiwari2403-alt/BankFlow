package beans;

public class JavaBeansDemo {

    public static void run() {
        // --- JavaBeans convention ---
        System.out.println("--- JavaBeans Convention ---");
        System.out.println("  Rules:");
        System.out.println("  1. No-arg (default) constructor");
        System.out.println("  2. Private fields with public getXxx() / setXxx()");
        System.out.println("  3. Boolean properties use isXxx() (not getXxx())");
        System.out.println("  4. Implements Serializable (for persistence/transfer)");
        System.out.println();

        // Using no-arg constructor + setters (framework style)
        UserBean bean = new UserBean();
        bean.setName("Bob");
        bean.setEmail("bob@example.com");
        bean.setAge(30);
        bean.setVerified(true);
        System.out.println("  Created via no-arg ctor + setters: " + bean);

        // Using convenience constructor
        UserBean bean2 = new UserBean("Charlie", "charlie@example.com", 25);
        System.out.println("  Created via parameterized ctor:    " + bean2);

        System.out.println();
        System.out.println("  isVerified() = " + bean.isVerified() + "  (boolean uses 'is' prefix)");
        System.out.println("  getName()    = " + bean.getName() + "     (non-boolean uses 'get' prefix)");

        System.out.println();
        System.out.println("  Why frameworks need JavaBeans:");
        System.out.println("  - Spring: creates beans via no-arg ctor, sets properties via setters");
        System.out.println("  - Hibernate/JPA: maps database rows to bean properties");
        System.out.println("  - Jackson/JSON: serializes/deserializes using get/set/is methods");
        System.out.println("  - JSP/JSTL: ${user.name} calls getName() behind the scenes");

        // --- Records ---
        System.out.println();
        RecordVsBeanDemo.run();
    }
}
