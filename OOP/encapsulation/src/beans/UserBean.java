package beans;

import java.io.Serializable;

public class UserBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String email;
    private int age;
    private boolean verified;

    // JavaBeans RULE 1: No-arg (default) constructor required
    public UserBean() { }

    // Convenience constructor (optional, not part of JavaBeans spec)
    public UserBean(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.verified = false;
    }

    // JavaBeans RULE 2: getXxx() / setXxx() for each property
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // JavaBeans RULE 3: boolean uses isXxx(), not getXxx()
    public boolean isVerified() { return verified; }
    public void setVerified(boolean verified) { this.verified = verified; }

    @Override
    public String toString() {
        return "UserBean{name='" + name + "', email='" + email
                + "', age=" + age + ", verified=" + verified + "}";
    }
}
