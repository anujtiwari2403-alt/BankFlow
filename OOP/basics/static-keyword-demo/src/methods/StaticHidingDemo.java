package methods;

public class StaticHidingDemo {

    // ========== STATIC METHOD HIDING ==========
    static class Animal {
        // STATIC method: resolved at compile time (static binding)
        static String staticSound() {
            return "Animal: generic sound (static)";
        }

        // INSTANCE method: resolved at runtime (dynamic binding / polymorphism)
        String instanceSound() {
            return "Animal: generic sound (instance)";
        }
    }

    static class Dog extends Animal {
        // This HIDES the parent static method (not overriding!)
        static String staticSound() {
            return "Dog: Woof! (static - hidden)";
        }

        // WON'T COMPILE: @Override cannot be applied to static methods
        // @Override
        // static String staticSound() { return "error"; }

        // This OVERRIDES the parent instance method (true polymorphism)
        @Override
        String instanceSound() {
            return "Dog: Woof! (instance - overridden)";
        }
    }

    public static void run() {
        System.out.println("--- Static Method Hiding vs Instance Method Overriding ---");

        Dog dog = new Dog();
        Animal animalRef = dog;  // same Dog object, but reference type is Animal

        System.out.println();
        System.out.println("Object: Dog, Reference types: Dog and Animal");

        // Instance method: uses OBJECT type (runtime) -> always Dog's version
        System.out.println();
        System.out.println("INSTANCE method (dynamic binding / polymorphism):");
        System.out.println("  dog.instanceSound()       = " + dog.instanceSound());
        System.out.println("  animalRef.instanceSound()  = " + animalRef.instanceSound());
        System.out.println("  -> Both call Dog's version (resolved by OBJECT type at runtime)");

        // Static method: uses REFERENCE type (compile time) -> depends on variable type
        System.out.println();
        System.out.println("STATIC method (static binding / hiding):");
        System.out.println("  Dog.staticSound()         = " + Dog.staticSound());
        System.out.println("  Animal.staticSound()      = " + Animal.staticSound());
        System.out.println("  dog.staticSound()         = " + dog.staticSound());
        System.out.println("  animalRef.staticSound()   = " + animalRef.staticSound());
        System.out.println("  -> Depends on REFERENCE type (resolved at compile time)");
        System.out.println("  -> animalRef is typed as Animal, so Animal's version runs");

        // Static binding vs Dynamic binding summary
        System.out.println();
        System.out.println("STATIC BINDING vs DYNAMIC BINDING:");
        System.out.println("  Static binding  (compile-time): static methods, private methods, final methods");
        System.out.println("  Dynamic binding (runtime):      instance methods (virtual dispatch / polymorphism)");
        System.out.println("  -> Static methods do NOT participate in polymorphism!");

        // super restriction
        System.out.println();
        System.out.println("RESTRICTIONS in static context:");
        System.out.println("  Cannot use 'this'  -> no instance to refer to");
        System.out.println("  Cannot use 'super' -> no instance to inherit from");
        System.out.println("  See MathHelper.demoRestrictions() for 'this' demo");

        // WON'T COMPILE inside a static method:
        // super.toString();  // error: non-static variable super
        // this.toString();   // error: non-static variable this
    }
}
