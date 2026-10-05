package references;

public class WrapperAutoboxingDemo {

    public static void run() {
        System.out.println("--- Wrapper Classes & Autoboxing ---");

        // 1. Autoboxing: primitive -> Wrapper automatically
        System.out.println();
        System.out.println("1) Autoboxing (primitive -> Wrapper):");
        Integer a = 42;   // autoboxing: int -> Integer
        Double d = 3.14;  // autoboxing: double -> Double
        Boolean b = true; // autoboxing: boolean -> Boolean
        System.out.println("   Integer a = 42    -> " + a + " (class: " + a.getClass().getSimpleName() + ")");
        System.out.println("   Double  d = 3.14  -> " + d);
        System.out.println("   Boolean b = true  -> " + b);

        // 2. Unboxing: Wrapper -> primitive automatically
        System.out.println();
        System.out.println("2) Unboxing (Wrapper -> primitive):");
        int x = a;          // unboxing: Integer -> int
        double y = d;       // unboxing: Double -> double
        System.out.println("   int x = a  -> " + x);
        System.out.println("   double y = d -> " + y);

        // 3. null unboxing -> NullPointerException!
        System.out.println();
        System.out.println("3) Null unboxing danger:");
        Integer nullInt = null;
        System.out.println("   Integer nullInt = null;");
        System.out.println("   int val = nullInt;  // -> NullPointerException!");
        try {
            int val = nullInt;  // NullPointerException at runtime
        } catch (NullPointerException e) {
            System.out.println("   Caught: " + e.getClass().getSimpleName());
        }

        // 4. Integer cache: -128 to 127
        System.out.println();
        System.out.println("4) Integer Cache (-128 to 127):");
        Integer i1 = 127, i2 = 127;
        Integer i3 = 128, i4 = 128;
        System.out.println("   Integer 127 == 127 : " + (i1 == i2) + "  (cached -> same object)");
        System.out.println("   Integer 128 == 128 : " + (i3 == i4) + " (not cached -> different objects)");
        System.out.println("   Integer 128.equals(128): " + i3.equals(i4) + "  (ALWAYS use .equals()!)");

        // 5. parseInt vs valueOf
        System.out.println();
        System.out.println("5) parseXxx() vs valueOf():");
        int parsed = Integer.parseInt("42");        // returns primitive int
        Integer valued = Integer.valueOf("42");     // returns Integer object
        System.out.println("   Integer.parseInt(\"42\")  = " + parsed + " (returns int)");
        System.out.println("   Integer.valueOf(\"42\")   = " + valued + " (returns Integer)");

        // 6. All 8 wrapper classes
        System.out.println();
        System.out.println("6) All 8 primitive-wrapper pairs:");
        System.out.println("   byte    -> Byte");
        System.out.println("   short   -> Short");
        System.out.println("   int     -> Integer");
        System.out.println("   long    -> Long");
        System.out.println("   float   -> Float");
        System.out.println("   double  -> Double");
        System.out.println("   char    -> Character");
        System.out.println("   boolean -> Boolean");
    }
}
