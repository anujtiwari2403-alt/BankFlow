import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class haspmap {   // yaha put= insertion hai
    //public static void main(String[] args) {
        // HashMap<Integer, String> hashMap = new HashMap<>();
        // hashMap.put(1, "Anuj");
        // hashMap.put(2, "rohit");
        // hashMap.put(3, "virat");
        // hashMap.put(4, "dhoni");
        // hashMap.put(5, "varun");
        // hashMap.put(null, "rahul");
        // System.out.println("hasmap is :" + hashMap);
        // System.out.println(hashMap.size());


        //  HashMap<Integer, String> hashMap = new HashMap<>();
        // hashMap.put(1, "Anuj");
        // hashMap.put(9, "rohit");
        // hashMap.put(3, "virat");
        // hashMap.put(0, "dhoni");
        // hashMap.put(6, "varun");
        // hashMap.put(null, "rahul");
        // System.out.println("hasmap is :" + hashMap);
        // System.out.println(hashMap.size());

        //  treemap= shorting karta hai
       //   ye null value nhi leta 
        //  TreeMap<Integer, String> hashMap = new TreeMap<>();
        // hashMap.put(1, "Anuj");
        // hashMap.put(2, "rohit");
        // hashMap.put(7, "virat");
        // hashMap.put(9, "dhoni");
        // hashMap.put(4, "varun");
        // System.out.println("hasmap is :" + hashMap);
        // System.out.println(hashMap.size());

        // hashtable= desending key value provide karta hai

        //  Hashtable<Integer, String> hashMap = new Hashtable<>();
        // hashMap.put(1, "Anuj");
        // hashMap.put(2, "rohit");
        // hashMap.put(9, "virat");
        // hashMap.put(0, "dhoni");
        // hashMap.put(5, "varun");
        // System.out.println("hasmap is :" + hashMap);
        // System.out.println(hashMap.size());


        // Method used in Haspmap......

// 1.put() ★
// 2.get() ★
// 3.containsKey() ★
// 4.remove() ★
// 5.size() ★
// 6.isEmpty() ★
// 7.getOrDefault() ★
// 8.keySet()
// 9.values()
// 10.entrySet()
// 11.replace()





        // Creating HashMap
       // HashMap<String, Integer> map = new HashMap<>();

        // =====================================================
        // 1. put() -> Add data
        // =====================================================

//         map.put("Apple", 45);
//         map.put("Orange", 65);
//         map.put("Kiwi", 55);
//         map.put("PineApple", 85);

//         System.out.println("HashMap: " + map);


//         // =====================================================
//         // 2. size() -> Total number of entries
//         // =====================================================

//         System.out.println("Size: " + map.size());


//         // =====================================================
//         // 3. get() -> Get value using key
//         // =====================================================

//         System.out.println("Apple Quantity: " + map.get("Apple"));
//         System.out.println("Orange Quantity: " + map.get("Orange"));


//         // =====================================================
//         // 4. put() -> Update existing value
//         // =====================================================

//         map.put("Orange", 100);

//         System.out.println("Updated HashMap: " + map);
//         System.out.println("Updated Orange Quantity: " + map.get("Orange"));


//         // =====================================================
//         // 5. containsKey() -> Check whether key exists
//         // =====================================================

//         System.out.println(
//                 "DragonFruit Present: "
//                         + map.containsKey("DragonFruit")
//         );

//         System.out.println(
//                 "Orange Present: "
//                         + map.containsKey("Orange")
//         );


//         // =====================================================
//         // 6. remove() -> Remove key-value pair
//         // =====================================================

//         map.remove("Apple");

//         System.out.println("After Removing Apple: " + map);


//         // =====================================================
//         // 7. keySet() -> Get all keys
//         // =====================================================

//         System.out.println("All Keys: " + map.keySet());


//         // Using keySet() with for-each loop

//         System.out.println("\nKeys and Values:");

//         for (String key : map.keySet()) {

//             System.out.println(
//                     key + " : " + map.get(key)
//             );
//         }


//         // =====================================================
//         // 8. values() -> Get all values
//         // =====================================================

//         System.out.println("\nAll Values: " + map.values());


//         // =====================================================
//         // 9. entrySet() -> Get key + value together
//         // =====================================================

//         System.out.println("\nAll Entries: " + map.entrySet());


//         // =====================================================
//         // 10. containsValue() -> Check whether value exists
//         // =====================================================

//         System.out.println(
//                 "Value 85 Present: "
//                         + map.containsValue(85)
//         );

//         System.out.println(
//                 "Value 500 Present: "
//                         + map.containsValue(500)
//         );


//         // =====================================================
//         // 11. getOrDefault() -> Default value
//         // =====================================================

//         System.out.println(
//                 "Mango Quantity: "
//                         + map.getOrDefault("Mango", 0)
//         );


//         // =====================================================
//         // 12. replace() -> Replace existing value
//         // =====================================================

//         map.replace("Kiwi", 200);

//         System.out.println(
//                 "After Replacing Kiwi: " + map
//         );


//         // =====================================================
//         // 13. replace(key, oldValue, newValue)
//         // =====================================================

//         map.replace("PineApple", 85, 2000);

//         System.out.println(
//                 "After Conditional Replace: " + map
//         );


//         // =====================================================
//         // 14. Map.Entry -> Get key and value separately
//         // =====================================================

//         System.out.println("\nUsing Map.Entry:");

//       //  for (Map.Entry<String, Integer> entry : map.entrySet()) {

//             // System.out.println(
//             //         "Key: " + entry.getKey()
//             // );

//             // System.out.println(
//             //         "Value: " + entry.getValue()
//             // );
//         }


//         // =====================================================
//         // 15. isEmpty() -> Check whether HashMap is empty
//         // =====================================================

//         // System.out.println(
//         //         "\nIs HashMap Empty? "
//         //                 + map.isEmpty()
//         // );


//         // =====================================================
//         // 16. clear() -> Remove everything
//         // =====================================================

// //         map.clear();

// //         System.out.println(
// //                 "After clear(): " + map
// //         );

// //         System.out.println(
// //                 "Size After clear(): "
// //                         + map.size()
// //         );

// //         System.out.println(
// //                 "Is HashMap Empty? "
// //                         + map.isEmpty()
// //         );
// //     }

// public static void findSymmetricpairs(HashMap<String,String>pair) {
//    HashMap<String,String> symmetricPairs =new HashMap<>();
//     for (Map.Entry<String,String>entry: pair.entrySet()) {
//         String key=entry.getKey();
//         String value=entry.getValue();
//         if (pair.containsKey(value) &&pair.get(value).equals(key) ) {
//             if (!symmetricPairs.containsKey(value)) {
//                 symmetricPairs.put(key,value);
//             }
           

//         }
//           System.out.println(key+ " = " + value);
//     }
// }

// public static void main(String[] args) {
// HashMap<String,String>pairs=new HashMap<>();
// pairs.put("A", "B");
// pairs.put("C", "D");
// pairs.put("E", "F");
// pairs.put("I", "J");
// pairs.put("K", "K");
// pairs.put("M", "M");
// pairs.put("O", "O");
// pairs.put("B", "A");
// pairs.put("Z", "A");
// pairs.put("D", "C");
// pairs.put("A", "B");
// pairs.put("A", "B");
// pairs.put("A", "B");
//     findSymmetricpairs(pairs);
//}

// Question 2......

// private static char firstUniqueCharacter(String input){

//    

//     // Frequency count
//     for (char ch : input.toCharArray()) {
//         map.put(ch, map.getOrDefault(ch, 0) + 1);
//     }

//     // First character whose frequency is 1
//     for (char ch : input.toCharArray()) {
//         if (map.get(ch) == 1) {
//             return ch;
//         }
//     }

//     return '\0';

// }

// public static void main(String[] args) {
//     String input="DDAACBE";
//     char firstUniqueCharacter =firstUniqueCharacter(input);
//     if (firstUniqueCharacter!='\0') {
//         System.out.println("first Unique Character is:"+ firstUniqueCharacter);
//     }else{
//         System.out.println("No Unique Character found");
//     }
// }
// }



    public static void main(String[] args) {

        String input = "DDAACBE";

        TreeMap<Character, Integer> map = new TreeMap<>();

        
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);

        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                System.out.println("First Unique Character: " + entry.getKey());
                break;
            }
        }
}
}

// Array is contiguous or not

// private static boolean iscontiguous(int[]arr){

//     for (int num  : arr) {
//         hashSet.add(num);
//     }
//     int min=Integer.MAX_VALUE;
//     int max=Integer.MIN_VALUE;
//     for(int num:arr){
//         min=Math.min(num, min);
//         max=Math.max(num, max);
//     }
// }

// public static void main(String[] args) {
//     int[] arr1={1,2,3,4,5,6};//true
//     int[] arr2={5,6,4,9,8};//false
//     int[] arr3={1,6,5,4,2,3};//true
//     System.out.println("Array1 is contiguous"+ iscontiguous(arr1));
//     System.out.println("Array2 is contiguous"+ iscontiguous(arr2));
//     System.out.println("Array3 is contiguous"+ iscontiguous(arr3));

// }


// topic HashSet>>>>>>
 //    }

    











