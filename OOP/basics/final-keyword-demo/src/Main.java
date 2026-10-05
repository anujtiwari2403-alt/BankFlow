import variables.FinalVariableDemo;
import variables.FinalReferenceDemo;
import variables.FinalArrayDemo;
import variables.FinalVsFinallyVsFinalizeDemo;
import methods.FinalMethodDemo;
import classes.FinalClassDemo;
import classes.FinalParameterDemo;
import classes.FinalLambdaDemo;
import classes.FinalThreadSafetyDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Final Variables ==");
        FinalVariableDemo.run();

        System.out.println();
        System.out.println("== Final References ==");
        FinalReferenceDemo.run();

        System.out.println();
        System.out.println("== Final Methods ==");
        FinalMethodDemo.run();

        System.out.println();
        System.out.println("== Final Classes ==");
        FinalClassDemo.run();

        System.out.println();
        System.out.println("== Final Parameters ==");
        FinalParameterDemo.run();

        System.out.println();
        System.out.println("== Final with Arrays & Compile-Time Constants ==");
        FinalArrayDemo.run();

        System.out.println();
        System.out.println("== final vs finally vs finalize ==");
        FinalVsFinallyVsFinalizeDemo.run();

        System.out.println();
        System.out.println("== Final & Lambdas / Effectively Final ==");
        FinalLambdaDemo.run();

        System.out.println();
        System.out.println("== Final & Thread Safety / Why String is Final ==");
        FinalThreadSafetyDemo.run();
    }
}
