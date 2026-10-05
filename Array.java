import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    // public static void main(String[] args) {
    // // Array by array Literal
    // int[] arr = { 10, 20, 30, 40 };
    // System.out.println("First Element of array is: " + arr[0]);
    // System.out.println("Last Element of array is: " + arr[3]);
    // // System.out.println("Last Element of array is: " +
    // // arr[4]);//IndexOutOfBoundsException
    // System.out.println("Last Element of array is: " + arr[arr.length - 1]);
    // System.out.println(arr);// this prints array reference

    // System.out.println("Array length is: " + arr.length);

    // for (int i = 0; i <= arr.length - 1; i++) {
    // System.out.print(arr[i] + " ");

    // }
    // System.out.println();
    // for (int num : arr) {
    // System.out.print(num + " ");

    // }
    // System.out.println();

    // // Array using new keyword
    // int[] arr1 = new int[5];
    // for (int i = 0; i <= arr1.length - 1; i++) {
    // System.out.print(arr1[i] + " ");

    // }
    // System.out.println();
    // System.out.println("Array 1 length is: " + arr1.length);

    // arr1[0] = 90;// updation
    // arr1[1] = 90;
    // arr1[2] = 90;
    // arr1[3] = 90;
    // arr1[4] = 90;

    // for (int i = 0; i <= arr1.length - 1; i++) {
    // System.out.print(arr1[i] + " ");

    // }
    // System.out.println();

    // int[] arr2 = new int[] { 10, 20, 30, 40 };
    // for (int i = 0; i <= arr2.length - 1; i++) {
    // System.out.print(arr2[i] + " ");

    // }

    // arr = arr1;
    // System.out.println();

    // System.out.println("Array length is: " + arr.length);

    // }

    // }

    // Add Even Numbers in an array:
    // input: 2,4,5,6,80,24,57,12,26
    // output: 154

    // public class Array {
    // public static int addNumbers(int[] arr) {
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] % 2 == 0) {
    // sum += arr[i];
    // }

    // }
    // return sum;

    // }

    // public static void main(String[] args) {
    // int[] arr = { 2, 4, 5, 6, 80, 24, 57, 12, 26 };
    // int result = addNumbers(arr);
    // System.out.println("The Sum of Even Number is : " + result);

    // }
    // }

    // return 0 if number is odd and if it is even return 1
    // input: 2,4,5,6,80,24,57,12,26
    // output: 1,1,0,1,1,1,0,1,1

    // import java.util.Arrays;

    // public class Array {
    // public static int[] specialArray(int[] arr) {
    // int[] arr1 = new int[arr.length];
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] % 2 == 0) {
    // arr1[i] = 1;

    // } else {
    // arr1[i] = 0;

    // }

    // }
    // return arr1;

    // }

    // public static void main(String[] args) {
    // int[] arr = { 2, 4, 5, 6, 80, 24, 57, 12, 26 };
    // int[] result = specialArray(arr);
    // System.out.println("The Sum of Even Number is : " + Arrays.toString(result));

    // }
    // }

    // //Add all the indexes of the even number
    // // input: 2,4,5,6,80,24,57,12,26
    // //output:

    // public class Main {
    // public static int specialArray(int[] arr) {
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] % 2 == 0) {
    // sum += i;
    // }

    // }
    // return sum;

    // }

    // public static void main(String[] args) {
    // int[] arr = { 2, 4, 5, 6, 80, 24, 57, 12, 26 };
    // int result = specialArray(arr);
    // System.out.println("The Sum of Even Number is : " + (result));

    // }
    // }

    /*
     * 
     * 
     * The King's Seal
     * In the Kingdom of Murshidabad, every province sends a tribute value to the
     * royal
     * treasury.
     * Before the tribute is recorded, it must pass through the Palace Checkpoint.
     * The Queen examines each tribute according to an ancient rule:
     * 
     * If the tribute bears the King's Seal, the Queen grants it 5 additional gold
     * coins.
     * Otherwise, she grants it only 1 additional gold coin.
     * 
     * A tribute is said to bear the King's Seal if it can be evenly divided into
     * two equal
     * parts.
     * 
     * Given the tribute values sent by all provinces, determine the final values
     * received
     * by the treasury.
     * 
     * Input
     * The first line contains an integer N — the number of provinces.
     * The second line contains N space-separated integers A₁, A₂, ..., Aₙ
     * representing
     * the tribute values.
     * 
     * Output
     * Print N integers representing the tribute values after the Queen's blessing.
     * 
     * Constraints
     * 1 ≤ N ≤ 10^5
     * 0 ≤ Aᵢ ≤ 10^9
     * 
     * Example 1
     * Input
     * 5
     * 10 21 30 49 78
     * 
     * Output
     * 15 22 35 50 83
     * 
     * 
     * Explanation
     * 10 bears the King's Seal → 10 + 5 = 15
     * 21 does not bear the King's Seal → 21 + 1 = 22
     * 30 bears the King's Seal → 30 + 5 = 35
     * 49 does not bear the King's Seal → 49 + 1 = 50
     * 78 bears the King's Seal → 78 + 5 = 83
     * 
     * 
     */

    // import java.util.Arrays;

    // public class Array {
    // public static int[] specialArray(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i] % 2 == 0) {
    // arr[i] += 5;

    // } else {
    // arr[i] += 1;
    // }

    // }
    // return arr;

    // }

    // public static void main(String[] args) {
    // int[] arr = { 10, 21, 30, 49, 78 };
    // int[] result = specialArray(arr);
    // System.out.println("The Sum of Even Number is : " + Arrays.toString(result));

    // }
    // }

    // Array: equals vs ==

    // import java.util.Arrays;

    // /**
    // * Main
    // */
    // public class Array {

    // public static void main(String[] args) {
    // int[] arr = { 1, 2, 3 };
    // int[] arr1 = { 1, 2, 3 };
    // int[] arr2 = new int[] { 1, 2, 3 };

    // System.out.println("arr is equal to arr1 o not ? : " + Arrays.equals(arr,
    // arr1));
    // System.out.println("arr1 is equal to arr2 o not ? : " + Arrays.equals(arr1,
    // arr2));
    // System.out.println("arr is equal to arr2 o not ? : " + Arrays.equals(arr,
    // arr2));

    // System.out.println("arr is equal to arr1 o not ? : " + (arr == arr1));
    // System.out.println("arr1 is equal to arr2 o not ? : " + (arr1 == arr2));
    // System.out.println("arr is equal to arr2 o not ? : " + (arr == arr2));

    // String str = "Amit";
    // String str1 = "Amit";
    // String str2 = new String("Amit");
    // System.out.println("str is equal to str1 ? : " + (str.equals(str1)));
    // System.out.println("str1 is equal to str2 ? : " + (str1.equals(str2)));
    // System.out.println("str is equal to str1 ? : " + (str.equals(str2)));

    // System.out.println("str is equal to str1 ? : " + (str == str1));//true
    // System.out.println("str1 is equal to str2 ? : " + (str1 == str2));//false
    // System.out.println("str is equal to str2 ? : " + (str == str2));//false

    // }
    // }

    // print second maximam in array
    // public static int[] secondMax(int[] arr) {

    // int max1 = Integer.MIN_VALUE;
    // int max2 = Integer.MIN_VALUE;

    // for (int i = 0; i < arr.length; i++) {
    // if (arr[i]>max1) {
    // max2=max1;
    // max1=arr[1];
    // }else if (arr[]i>max2 && arr[i]!=max1) {

    // }
    // }
    // }
    // public static void main(String[] args) {
    // int[] arr={100,90,123,67};
    // int[] result=secondMax(arr);
    // System.out.println(Arrays.toString(result));

    // }

    // Reverse an array: using for loop

    // public static int[] reverseNumber(int[]arr) {
    // int left=0;
    // int right= arr.length-1;
    // while (left<right) {
    // int temp=arr[left];
    // arr[left]= arr[right];
    // arr[right]=temp;
    // right++;
    // left++;
    // }
    // return arr;
    // }

    // public static void main(String[] args) {
    // int[] arr={10,20,30,40,50};
    // int[] result=reverseNumber(arr);
    // System.out.println("Reversed number ");
    // }

    // topic .. Arraylist
    // public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     list.add(10);
    //     list.add(20);
    //     list.add(30);
    //     list.add(40);
    //     list.add(50);
    //     list.add(60);
    //     System.out.println("the ArrayList is : " + list);
    //     System.out.println("the first Element is:" + list.get(0));
    //     System.out.println("Last element is :" + list.get(list.size() - 1));

    //     for (int i = 0; i < list.size(); i++) {
    //         System.out.println(list.get(i) + " ");
    //     }
    //     System.out.println("size pf arraylist is :" + list.size());
    //     System.out.println("if element 30 is present in arraylist ?:" + list.contains(0));
    //     list.remove(2);
    //     System.out.println("if element 30 is present in arraylist ? :" + list.contains(list));
    //     System.out.println("size of the analist is :" + list.size());
    //     list.set(2, 100);

    //     for (int i = 0; i < list.size(); i++) {
    //         System.out.println(list.get(i) + " ");
    //     }
    // }

    // arraylist: print by intreator

    // public static void main(String[] args) {
    //     ArrayList<String>fruit=new ArrayList<>();
    //     fruit.add("Avacodo");
    //     fruit.add("dragon fruit");
    //     fruit.add("Kiwi");
    //     fruit.add("Green Apple");
    //     fruit.add("BlueBarry");
    //     fruit.add("Raspberry");
    //     System.out.println("the ArrayList is:");
    //     fruit.forEach(System.out::println);
    //     // method reference forEach()
    // }
    public int[] rearrangeArray(int[] nums) {
        int[]ans=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int num: nums){
            if(num>0){
                ans[pos]=num;
                pos+=2;
            }else{
                ans[neg]=num;
                neg+=2;
            }
        }
        return ans;
    }
}
