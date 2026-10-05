import java.util.Arrays;
import java.util.Scanner;

public class trainingArray {
  // public static void main(String[] args) {
  // method of difining an array

  // ......... type[] arrayName=new type[size];.....................

  /*
   * Arrays In Java
   * 
   * 1. Arrays in Java are like a list of elements of the same type i.e.
   * a list of integers, a list of booleans etc.
   * Creating an Array (method 1) - with new keyword
   * int[] marks = new int[3];
   * marks[0] = 97;
   * marks[1] = 98;
   * marks[2] = 95;
   * 
   * 2. Creating an Array (method 2)
   * int[] marks = {98, 97, 95};
   * 
   * 3. Taking an array as an input and printing its elements.
   */

  // .........Method-1........

  // int[] marks=new int[3];
  // marks[0]= 78;
  // marks[1]=98;
  // marks[2]=67;

  // System.out.println(marks[0]);
  // System.out.println(marks[1]);
  // System.out.println(marks[2]);

  // ............Method-2..............

  // int marks[]={67, 45, 56 };
  // for (int i = 0; i <3; i++) {
  // System.out.println(marks[i]);
  // }
  // question ........
  // Taking an array as an input and printing its elements.

  // System.err.println(" please enter your input Here ....");
  // Scanner sc= new Scanner(System.in);
  // int size= sc.nextInt();
  // int number[]= new int[size];
  // // for input........
  // for (int i = 0;i < size; i++) {
  // number[i]=sc.nextInt();
  // }

  // // for output.......
  // for (int i = 0; i < number.length; i++) {
  // System.out.print(number[i] +" ");
  // }

  // question-2............

  // Take an array of names as input from the user and print them on the screen.
  // System.out.println("please enter your array size ......");
  // Scanner sc= new Scanner(System.in);
  // int size = sc.nextInt();
  // String names []= new String[size];
  // for (int i = 0; i < size; i++) {
  // names[i]=sc.next();

  // }

  // for (int i = 0; i < names.length; i++) {
  // System.out.print(names[i]+ " ");
  // }

  // Question -3.....................

  // Find the maximum & minimum number in an array of integers.
  // [HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

  // System.out.println("please enter you array size......");
  // Scanner sc= new Scanner(System.in);
  // int size = sc.nextInt();
  // int numbers[]=new int[size];

  // for (int i= 0; i < size; i++) {
  // numbers[i]=sc.nextInt();

  // }
  // int Max=Integer.MIN_VALUE; // intial value is-2147483648
  // int Min=Integer.MAX_VALUE; // intial value is 2147483647

  // for (int i= 0; i< numbers.length; i++) {
  // if (numbers[i]<Min) {
  // Min=numbers[i];

  // }
  // if (numbers[i]>Max) {
  // Max=numbers[i];
  // }
  // }

  // System.out.println("Maximum = "+ Max);
  // System.out.println("minimum ="+ Min);

  // Question>3.............
  /*
   * Take an array of numbers as input and check if it is an array sorted in
   * ascending order.
   * Eg : { 1, 2, 4, 7 } is sorted in ascending order.
   * {3, 4, 6, 2} is not sorted in ascending order.
   */
  // System.out.println("please enter the array size.......");
  // Scanner sc= new Scanner(System.in);
  // int size = sc.nextInt();
  // int numbers[]=new int[size];

  // for (int i = 0; i < size; i++) {
  // numbers[i]=sc.nextInt();
  // }
  // boolean isascending=true;
  // for (int i= 0; i < numbers.length-1; i++) {
  // //(note ... numbers.length-1 is a termination condition)
  // if (numbers[i]>numbers[i+1]) {//(this is the condition of decending order4)
  // isascending=false;
  // }
  // }
  // if (isascending) {
  // System.out.println("the array is shorted to the ascending order ");
  // }else{
  // System.out.println("the array is not shorted in acscending order");
  // }

  // }
  // }

  // creating an array >>>>>

  // int marks[]=new int[50];
  // System.out.println(Arrays.toString(marks));

  // int marks2[]={1,2,3};
  // System.out.println(Arrays.toString (marks2));

  // String fruits[]={"apple", "mango", "banana"};
  // System.out.println(Arrays.toString(fruits));

  // input funtion in Array>>>>>>
  // System.out.println("enter your marks here");
  // int marks[]=new int[100];
  // Scanner sc=new Scanner(System.in);

  // marks[1]=sc.nextInt();
  // marks[2]=sc.nextInt();
  // marks[3]=sc.nextInt();
  // marks[1]+=45;
  // System.out.println("physics marks is:"+ marks[1]);
  // System.out.println("chemistry marks is:"+ marks[2]);
  // // marks[1]=marks[1]+1;
  // System.out.println("math marks is:"+ marks[3]);

  // System.out.println("please enter your subjects marks here one by one
  // .......");
  // int marks[] = new int[100];
  // Scanner sc = new Scanner(System.in);
  // System.out.println("please enter your physics marks here");
  // marks[0] = sc.nextInt();
  // System.out.println("please enter your chemistry marks here");
  // marks[1] = sc.nextInt();
  // System.out.println("please enter your math marks here");
  // marks[2] = sc.nextInt();

  // if (marks[1] <= 23) {
  // System.out.println("student is fail in physics");
  // }
  // if (marks[2] <= 23) {
  // System.out.println("student is fail in chemistry:");
  // }
  // if (marks[3] <= 23) {
  // System.out.println("student is fail in math");
  // }
  // if (marks[0] > 23 && marks[1] > 23 && marks[2] > 23) {
  // System.out.println("student is pass in all subjects");
  // }

  // topic passing An array as a arguments>>>>

  // public static void update(int marks[],int nonChangeable) {
  // nonChangeable=67;
  // for (int i = 0; i < marks.length; i++) {
  // marks[i]+=1;
  // }
  // }
  // public static void main(String[] args) {
  // int marks[]={89,67,78,90,45};
  // int nonChangeable=34;
  // update(marks,nonChangeable );
  // System.out.println(nonChangeable);

  // for (int i = 0; i < marks.length; i++) {
  // System.err.print(marks[i]+" ");
  // }
  // System.out.println();
  // }

  // linear search technique in java>>>>>

  // public static int linearSearch(int number[], int key) {
  // for (int i = 0; i < number.length; i++) {
  // if (number[i] == key) {
  // return i;
  // }
  // }
  // return -1;
  // }

  // public static void main(String[] args) {
  // int number[] = { 1, 3, 5, 8, 30, 12, 78 };
  // int key = 1;
  // int index = linearSearch(number, key);
  // if (index == -1) {
  // System.err.println("key Not found");
  // } else {
  // System.out.println("Key at index:" + index);
  // }
  // }

  // using String method>>>>

  // public static int linearSearch(String snacks[], String key){
  // for (int i = 0; i < snacks.length; i++) {
  // if (snacks[i]==key) {
  // return i;
  // }
  // }
  // return -1;
  // }
  // public static void main(String[] args) {
  // String snacks[]={"burgur", "taco", "pizza","samosa","nodels"};
  // String key="taco";
  // int index=linearSearch(snacks, key);
  // if (index==-1) {
  // System.out.println("key Not found");
  // }else{
  // System.out.println("snack key: "+ snacks[index]);
  // System.out.println("key found at index: "+index);
  // }
  // }

  // print largest and second largest number in array.....

  // public static int[] secondMax(int[] arr) {

  // int max1 = Integer.MIN_VALUE;
  // int max2 = Integer.MIN_VALUE;
  // int max3 = Integer.MIN_VALUE;

  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] > max1) {
  // max3 = max2;
  // max2 =max1;
  // max1 = arr[i];
  // }
  // if (arr[i] > max2 && arr[i] != max1) {
  // max3=max2;
  // max2 = arr[i];

  // }
  // }
  // return new int[] { max1, max2 , max3};
  // }

  // public static void main(String[] args) {
  // int[] arr = { 666, 78, 123, 607 };
  // int[] result = secondMax(arr);
  // System.out.println(Arrays.toString(result));

  // }

  // }

  // find largest number in an array.....
  // public static int getLargest(int numbers[]) {
  // int largest=Integer.MIN_VALUE;
  // for (int i = 0; i < numbers.length; i++) {
  // if (largest<numbers[i]) {
  // largest=numbers[i];
  // }
  // }
  // return largest;
  // }
  // public static void main(String[] args) {
  // int numbers[]={1000,3000,3000,476,467,60};
  // System.out.println("the largest number is "+getLargest(numbers));

  // }
  // }

  // find smallest in array.....
  // public static int getLargest(int numbers[]) {
  // int largest=Integer.MIN_VALUE;
  // int smallest=Integer.MAX_VALUE;
  // for (int i = 0; i < numbers.length; i++) {
  // if (largest<numbers[i]) {
  // largest=numbers[i];
  // }
  // if (smallest>numbers[i]) {
  // smallest=numbers[i];
  // }

  // }
  // System.out.println("the smallest number is :"+smallest);
  // return largest;
  // }
  // public static void main(String[] args) {
  // int numbers[]={1000,3000,3000,476,467,60};
  // System.out.println("the largest number is "+getLargest(numbers));

  // }
  // }

  // find second largest in array.....
  // public static int getSecondLargest(int nums[]) {
  // int largest=Integer.MIN_VALUE;
  // int secondlargest=Integer.MIN_VALUE;
  // for (int i= 0; i < nums.length; i++) {
  // if (largest<nums[i]) {
  // secondlargest=largest;
  // largest=nums[i];
  // }else if (secondlargest<nums[i] && largest!=nums[i]) {
  // secondlargest=nums[i];
  // }
  // }

  // System.out.println("the laregst number is :"+largest);
  // return secondlargest;
  // }

  // public static void main(String[] args) {
  // int []nums={23,345,567,0,678,};
  // System.out.println("the second laregst number is : "+getSecondLargest(nums));
  // }

  // }

  // find smallest and second smallest in array.....
  // public static int getSmallest(int num[]){
  // int smallest=Integer.MAX_VALUE;
  // int secondSmallest=Integer.MAX_VALUE;
  // for(int i=0; i<num.length;i++){
  // if (smallest>num[i]) {
  // secondSmallest=smallest;
  // smallest=num[i];
  // }else if (secondSmallest>num[i] && num[i]!=smallest) {
  // secondSmallest=num[i];
  // }
  // }
  // System.out.println("the smallest number is : "+smallest);
  // return secondSmallest;
  // }
  // public static void main(String[] args) {
  // int num[]={12,34,5,6678,67,567,};
  // System.out.println("the secondSmallest number is :"+getSmallest(num));

  // }

  // }

  // print thrid maximum in array... leetcode question no.414
//   public static int Thirdlargest(int nums[]) {
//     int max1 = Integer.MIN_VALUE;
//     int max2 = Integer.MIN_VALUE;
//     int max3 = Integer.MIN_VALUE;
//     for (int i= 0; i < nums.length; i++) {
//          if (max1<nums[i]) {
//             max3=max2;
//             max2=max1;
//             max1=nums[i];
//          }else if (max2<nums[i] && max1!=nums[i]) {
//                   max3=max2;
//                   max2=nums[i];
//          }else if (max3<nums[i]&& max2<nums[i] && max1!=nums[i]) {
//              max3=nums[i];
//          }
//     }
//      return max3;
//   }

//   public static void main(String[] args) {
//     int[] nums = { 45, 45, 34, 56, 445 };
//     System.out.println("the thirdlargest number is : "+Thirdlargest(nums));
//   }

// }
