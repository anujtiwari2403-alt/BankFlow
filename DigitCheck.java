//public class String {
    //public static void main(String[] args) {
        //String 
   // here (***) Means most imp method to remember>>>>>>>>

//         // Initialize a string
      //String s1 = "Hello, World!";

       //  1. length()  (*****)
        // int len = s1.length();
        // System.out.println("Length of the string: " + len);

//         // 2. charAt()
//         char ch = s1.charAt(0);
//         System.out.println("Character at index 0: " + ch);

//         // 3. toUpperCase()
//         String upper = s1.toUpperCase();
//         System.out.println("Uppercase string: " + upper);

//         // 4. toLowerCase()
//         String lower = s1.toLowerCase();
//         System.out.println("Lowercase string: " + lower);

//         // 5. concat()
//         String concatenated = s1.concat(" Welcome!");
//         System.out.println("Concatenated string: " + concatenated);

//         // 6. substring() (single index)
//         String sub1 = s1.substring(7);
//         System.out.println("Substring from index 7: " + sub1);

//         // 7. substring() (range)
//         String sub2 = s1.substring(0, 5);
//         System.out.println("Substring from index 0 to 5: " + sub2);

//         // 8. replace()
//         String replaced = s1.replace("World", "Java");
//         System.out.println("Replaced string: " + replaced);

//         // 9. trim() (*******)
//         String s2 = "   Hello   ";
//         String trimmed = s2.trim();
//         System.out.println("Trimmed string: '" + trimmed + "'");

//         // 10. startsWith()
//         boolean starts = s1.startsWith("Hello");
//         System.out.println("String starts with 'Hello': " + starts);

//         // 11. endsWith()
//         boolean ends = s1.endsWith("!");
//         System.out.println("String ends with '!': " + ends);

//         // 12. contains()
//         boolean contains = s1.contains("World");
//         System.out.println("String contains 'World': " + contains);

//         // 13. isEmpty()
//         String emptyString = "";
//         boolean isEmpty = emptyString.isEmpty();
//         System.out.println("String is empty: " + isEmpty);

//         // 14. equals()   (*******)
//         boolean equals = s1.equals("Hello, World!");
//         System.out.println("String equals 'Hello, World!': " + equals);

//         // 15. equalsIgnoreCase() ********
//         boolean equalsIgnoreCase = s1.equalsIgnoreCase("hello, WORLD!");
//         System.out.println("String equalsIgnoreCase 'hello, WORLD!': " + equalsIgnoreCase);

//         // 16. compareTo() (********)
//         int compare = s1.compareTo("Hello, Java!");
//         System.out.println("Comparing with 'Hello, Java!': " + compare);

//         // 17. compareToIgnoreCase()
//         int compareIgnoreCase = s1.compareToIgnoreCase("hello, WORLD!");
//         System.out.println("Comparing (ignoring case) with 'hello, WORLD!': " + compareIgnoreCase);

//         // 18. indexOf()
//         int indexOf = s1.indexOf("World");
//         System.out.println("Index of 'World': " + indexOf);

//         // 19. indexOf() (starting from index)
//         int indexOfFrom = s1.indexOf('o', 5);
//         System.out.println("Index of 'o' starting from index 5: " + indexOfFrom);

//         // 20. lastIndexOf()
//         int lastIndexOf = s1.lastIndexOf('o');
//         System.out.println("Last index of 'o': " + lastIndexOf);

//         // 21. split() (********)
//         String[] words = s1.split(", ");
//         System.out.println("Split string into words:");
//         for (String word : words) {
//             System.out.println(word);
//         }

//         // 22. valueOf()
//         int number = 123;
//         String numberStr = String.valueOf(number);
//         System.out.println("String value of 123: " + numberStr);

//         // 23. matches()
//         boolean matches = s1.matches(".*World.*");
//         System.out.println("String matches '.*World.*': " + matches);

//         // 24. repeat()
//         String repeated = "Hi ".repeat(3);
//         System.out.println("Repeated string: " + repeated);

//         // 25. toCharArray()  (********)
//         char[] charArray = s1.toCharArray();
//         System.out.println("Character array:");
//         for (char c : charArray) {
//             System.out.print(c + " ");
//         }
//         System.out.println();

//         // 26. intern() (********)
//         String s3 = new String("Hello").intern();
//         System.out.println("Interned string: " + s3);

//         // 27. format()
//         String formatted = String.format("Name: %s, Age: %d", "Alice", 25);
//         System.out.println("Formatted string: " + formatted);

      
    // }

   // Question >>>>>>>
   // 1.Convert the first Letter of Each Word to Uppercase 
   //2. Input: " heLLo     amit     woRLd"
//    import java.util.Arrays;

// public class capitalizedWord {

//     public static String capitalizeFirstLetters(String input) {

//         if (input == null || input.isEmpty()) {
//             return input;
//         }

//         String[] words = input.trim().split("\\s+");

//         System.out.println(Arrays.toString(words));

//         String result = "";

//         for (String word : words) {

//             if (word.isEmpty()) {
//                 continue;
//             }

//             String capitalizedWord =
//                     word.substring(0, 1).toUpperCase()
//                     + word.substring(1).toLowerCase();

//             result += capitalizedWord + " ";
//         }

//         return result.trim();
//     }

//     public static void main(String[] args) {

//         String input = "  heLLo   amit   woRLd";

//         String result = capitalizeFirstLetters(input);

//         System.out.println("Input  : \" " + input +"\"");
//         System.out.println("Output : \"" + result +"\"");
//     }
// }

// question 2......

//1. Remove duplicate Characters from a String
//2. Input:" programing"
//3. Output:" progamin"
// public class RemoveDuplicate {

//     public static String removeDuplicates(String input) {

//         String result = "";

//         for (int i = 0; i < input.length(); i++) {

//             char ch = input.charAt(i);

//             if (result.indexOf(ch) == -1) {
//                 result += ch;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         String input = "programming";

//         String result = removeDuplicates(input);

//         System.out.println("Input : \"" + input + "\"");
//         System.out.println("Output : \"" + result + "\"");
//     }
// }

//  count the Number of Words in a String 
  // input: "  hello World"
   // output:2
//    public class CountWords {

//     public static int countWords(String input) {

//         if (input == null || input.trim().isEmpty()) {
//             return 0;
//         }

//         String[] words = input.trim().split("\\s+");

//         return words.length;
//     }

//     public static void main(String[] args) {

//         String input = "  hello World";

//         int result = countWords(input);

//         System.out.println("Input  : \"" + input + "\"");
//         System.out.println("Output : " + result);
//     }
// }

// 



/*
check if a string Contain only digits
input="12345"
output=true

*/
public class DigitCheck {
    // public static void main(String[] args) {

    //     String input = "12345";
    //     boolean result = true;

    //     for (int i = 0; i < input.length(); i++) {
    //         if (!Character.isDigit(input.charAt(i))) {
    //             result = false;
    //             break;
    //         }
    //     }

    //     System.out.println(result);
    // }

    // using Matches method

    
    // public static void main(String[] args) {

    //     String input = "12345";

    //     boolean result = input.matches("\\d+");

    //     System.out.println(result);
    // }

    // Next question 
    // Replace All Space is a string with %20
    // Input " hello World"
    // output "hello%20world"
 

     

//     public static String replaceSpaceBruteforce(String input) {

//         String output = "";

//         for (int i = 0; i < input.length(); i++) {

//             char ch = input.charAt(i);

//             if (ch == ' ') {
//                 output += "%20";
//             } else {
//                 output += ch;
//             }
//         }

//         return output;
//     }

//     public static void main(String[] args) {

//         String input = "hello World";

//         System.out.println(replaceSpaceBruteforce(input));
//     }
 
// NExt question......

// Implement a function to perform Basic String compression
// input :"aabccccaaa"
// output :"a2b1c5a3"
//input : abcd
// output : abcd


    public static String stringCompressionOPtimized(String input) {

        String output = "";
        int count = 1;

        for (int i = 0; i < input.length(); i++) {

            if (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                output += input.charAt(i);
                output += count;
                count = 1;
            }
        }
          if (output.length() >= input.length() ) {
        return input;
    }

        return output;
    }

    public static void main(String[] args) {

        String input = "abccd";

        System.out.println(stringCompressionOPtimized(input));
    }

    // Second method
    // public static String compressString(String S) {
    //     StringBuilder compressed = new StringBuilder();
        
    // }
}





