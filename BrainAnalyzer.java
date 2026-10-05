
public class BrainAnalyzer {

    public static void main(String[] args) throws Exception {

        String person1 = "anuj";
        String person2 = "vayu";

        int iq1 = 5769;
        int iq2 = 1188;

        System.out.println("==========================================");
        System.out.println("        BRAIN ANALYZER v2.0");
        System.out.println("==========================================");

        System.out.println("\nInitializing AI Engine...");
        Thread.sleep(1000);

        System.out.println("Loading Neural Network...");
        Thread.sleep(1000);

        System.out.println("Scanning Brain Capacity...");
        Thread.sleep(1000);

        System.out.println("\nAnalyzing Subjects...");
        Thread.sleep(1500);

        System.out.println("------------------------------------------");
        System.out.println("Subject 1 : " + person1);
        System.out.println("Brain Score : " + iq1);
        System.out.println("------------------------------------------");

        Thread.sleep(1000);

        System.out.println("Subject 2 : " + person2);
        System.out.println("Brain Score : " + iq2);
        System.out.println("------------------------------------------");

        Thread.sleep(1500);

        if (iq1 > iq2) {
            System.out.println("\nAI Verdict:");
            System.out.println("🏆 " + person1 + " ranks higher in this comparison.");
            System.out.println("Difference : " + (iq1 - iq2) + " points.");
        } else if (iq2 > iq1) {
            System.out.println("\nAI Verdict:");
            System.out.println("🏆 " + person2 + " ranks higher in this comparison.");
            System.out.println("Difference : " + (iq2 - iq1) + " points.");
        } else {
            System.out.println("\nAI Verdict:");
            System.out.println("Both subjects have equal scores.");
        }

        System.out.println("\n==========================================");
        System.out.println(" Analysis Complete");
        System.out.println(" Note: agar aapko ye dekh kar bura lga to acchi baat hai .");
        System.out.println("==========================================");
    }
}
   