import java.util.Scanner;

public class loop {
   public static void main(String[] args) {
      // for loop
      // for(initialistion; condition; updation){
      // write a code
      // }

      // q. print hellow world 100 times using for loop

      // for(int i=1;i<=100;i++){
      // System.out.print(i + ":helloworld ");
      // }

      // System.out.println();

      // use 1 to 100 number if number is even b/w 1 to 100 then print
      // helloanuj else print byeanuj

      // for(int i=1; i<=100;i++){
      // if (i%2==0) {
      // System.out.println(i+"helloanuj");

      // }else{
      // System.out.println(i+"byeanuj");
      // }
      // }

      // print only even number b/w 1 to 100
      // for(int i=1;i<=100;i++){
      // if (i%2==0) {
      // System.out.print(i+" ");
      // }else{

      // }

      // }

      // System.out.println();

      // get all the number from 200 to 700
      // after dividing 5 remainder is 4 and afte dividing by
      // 7 remainder is 5

      // for(int i=200; i<=700;i++){
      // if (i%5==4 && i%7==5) {
      // System.out.print(i+" ");
      // }else{

      // }
      // }
      // System.out.println();

      // if all the number btw 1 to 100 sum is even then print even else odd

      // int sum=0;
      // for( int i=1;i<=100;i++){
      // sum=sum+i;
      // }
      // System.out.println("sum="+sum);

      // if (sum%2==0) {
      // System.out.println("even");
      // }else{
      // System.out.println("odd");
      // }

      // print sum of natural number

      // int sum=0;
      // for( int i=1; i<=100; i++){
      // sum=sum+i;
      // }
      // System.out.println("sum="+sum);

      // print all method of if else

      // first method

      // for(int i=1; i<=100; i++){
      // if (i%2==0) {
      // System.out.println(i+" even ");
      // }else{
      // System.out.println(i+" odd ");
      // }
      // }

      // second method

      // for(int i=1; i<=100;i++){
      // if ((i/2)*2==i) {
      // System.out.println(i+ " even ");
      // }else{
      // System.out.println(i+" odd ");
      // }
      // }

      // third method

      // for(int i=1; i<=100;i++){
      // if ((i &1)==0) {
      // System.out.println(i + " even ");
      // }else{
      // System.out.println(i+ " odd ");
      // }
      // }

      // find all the numbers between 300 to 600 hundred
      // both not included which are divisble by 5 and remainder 4
      // and after divided by 9 remainder is 7 , count all such numbers
      // and find the count is even or odd

      // int count=0;
      // for(int i=300;i<600; i++){

      // if (i%5==4 && i%9==7) {
      // System.out.print(i + " ");
      // count++;
      // }else{
      // System.out.print(i + " ");

      // }

      // }
      // if (count%2==0) {
      // System.out.println("the count is:"+ count+ ":even");
      // }else{
      // System.out.println("the count is:"+ count+ ":odd");
      // }
      // System.out.println();

      // find all the numbers between 300 to 600 hundred
      // both not included which are divisble by 5 and remainder 4
      // and after divided by 9 remainder is 7 , add all such numbers
      // int sum=0;
      // for(int i=300; i<600; i++){

      // if (i%5==4 && i%9==7) {
      // sum=sum+i;
      // System.out.println("sum is:"+ sum);

      // }
      // }

      // Find all factors of 120
      // int num=120;
      // for(int i=1; i<=120;i++){
      // if (num%i==0) {
      // System.out.println(i+ " ");
      // }
      // }

      // second method
      // int num=780;
      // for(int i=1; i<=Math.sqrt(num); i++){
      // int x= num/i;
      // if (num%i==0) {
      // System.out.println(i + "*" + x);
      // }
      // }

      // reverse the given number>>> 24032006

      // int num=24032006;
      // for(int i=1; i<=num; i++){
      // int lastdigit=num%10;
      // System.out.print(lastdigit);
      // num/=10;
      // }
      // System.out.println();

      // sum of first n natural number
      // System.out.println(" please enter your number");
      // Scanner sc= new Scanner(System.in);
      // int n=sc.nextInt();
      // int sum=0;
      // for(int i=1; i<=n;i++){
      // sum+=i;

      // }
      // System.out.println("the sum is:"+ sum);

      // topic ... break statement
      // " to exit the loop "
      // break statement ka use kisi bhi loop se bahar jane
      // ke liye kiya jata hai

      // for example>>>>>>

      // for(int i= 1; i<=10;i++){
      // if (i==5) {
      // break;

      // }
      // System.out.println(i);
      // }
      // System.out.println(" i am the out of loop");

      // question>> keep entring numbner till user enter multiple of 10
      // System.out.println(" please enter your number ");
      // Scanner sc= new Scanner(System.in);
      // int n=sc.nextInt();

      // for(int i=1; i<=n; i++){
      // if (n%10==0) {
      // break;
      // }
      // System.out.println(i);
      // }
      // System.out.println(" i am out of loop");

      // topic >>> "continue statement"

      // continue statement means>>> "skip an iteration"

      // for ex-------

      // for(int i=1;i<=10;i++){
      // if (i==3) {
      // continue;
      // }
      // System.out.println(i);
      // }

      // q... display all number entered by user excepts multiplies of 10

      // do {
      // System.out.println("enter your number ");
      // Scanner sc=new Scanner(System.in);
      // int i= sc.nextInt();

      // if (i%10==0) {
      // continue;
      // }
      // System.out.println("your number is:"+i);
      // } while (true);

      // }
      // check if any number is prime or not
      // System.out.println("please enter your number ");
      // Scanner sc=new Scanner(System.in);
      // int n=sc.nextInt();

      // if (n==2) {
      // System.out.println("n is a prime");
      // }else{
      // boolean isPrime=true;
      // for(int i=2; i<=Math.sqrt(n); i++){
      // if (n%i==0) {
      // isPrime=false;
      // }

      // }
      // if (isPrime==true) {
      // System.out.println(":this is a prime number");
      // }else{
      // System.out.println(":this is not a prime number");
      // }
      // }

      // }

      // }

      // }

      // armstrong number or narcisist number
      // int count=0;
      // int n=153;
      // int temp=n;
      // int sum=0;

      // while (temp!=0) {
      // count++;
      // temp/=10;
      // }
      // temp=n;
      // while (temp!=0) {
      // int lastdigit= temp%10;
      // sum+=Math.pow(lastdigit, count);
      // temp/=10;
      // }
      // if (sum==n) {
      // System.out.println("Armstrong number");
      // }else{
      // System.out.println("not a Armstrong number");
      // }

      // print number is disarium or not
      // int n=89;
      // int temp=n;
      // int count=0;
      // int sum=0;
      // while (temp!=0) {
      // count++;
      // temp/=10;
      // }
      // temp=n;
      // while (temp!=0) {
      // int lastdigit= temp%10;
      // sum+=Math.pow(lastdigit, count);
      // count--;
      // temp/=10;
      // }
      // if (sum==n) {
      // System.out.println("disarium number");
      // }else{
      // System.out.println("not a disarium number");
      // }

      // print 1 to 1000 disarium number
      // for(int n=1; n<=1000;n++){
      // int temp=n;
      // int count=0;
      // int sum=0;

      // while (temp!=0) {
      // count++;
      // temp/=10;
      // }
      // temp=n;
      // while (temp!=0) {
      // int lastdigit= temp%10;
      // sum+=Math.pow(lastdigit, count);
      // count--;
      // temp/=10;
      // }
      // if (sum==n) {
      // System.out.println(n);
      // }

      // }
      // for(int n=1; n<=1000;n++){
      // int temp=n;
      // int count=0;
      // int sum=0;

      // while (temp!=0) {
      // count++;
      // temp/=10;
      // }
      // temp=n;
      // while (temp!=0) {
      // int lastdigit= temp%10;
      // sum+=Math.pow(lastdigit, count);
      // temp/=10;
      // }
      // if (sum==n) {
      // System.out.println(n);
      // }
      // }
      // }
      // }
      // print any number is prime or not using break statement

      // int n=1033333908;
      // boolean isPrime=true;
      // for(int i=2;i<=Math.sqrt(n); i++){
      // if (n%i==0) {
      // isPrime=false;
      // break;
      // }
      // }
      // if (isPrime) {
      // System.out.println(n +": is a prime numbner ");
      // }else{
      // System.out.println(n +": is a composite number");
      // }
      // }
      // }

      // print count of any number
      // System.out.println("please enter your number");
      // Scanner sc=new Scanner(System.in);
      // int num=sc.nextInt();
      // int count=0;
      // for (int i = num; i != 0; i/=10) {
      // count++;
      // }
      // System.out.println("the count off "+ num + " is:"+count);
      //

      // print count of any number is even or odd
      // System.out.println("please enter your number ");
      // Scanner sc=new Scanner(System.in);
      // int num=sc.nextInt();
      // int evencount=0;
      // int oddcount=0;
      // for (int i =num; i !=0; i/=10) {
      // if (i%2==0) {
      // evencount++;

      // }else{
      // oddcount++;
      // }

      // }
      // System.out.println("the Evencount off"+ num + " is:"+ evencount);
      // System.out.println("the Oddcount off"+ num + " is:"+ oddcount);

      // add all the even digits , add all the odd digits
      // then find the difference and if that difference is prime or
      // composit
      // System.out.println("please enter your number ");
      // Scanner sc=new Scanner(System.in);
      // int num= sc.nextInt();;
      // int evensum=0;
      // int oddsum=0;
      // for (int i = num; i != 0; i/=10) {
      // int x=i%10;
      // if (x%2==0) {
      // evensum+=x;
      // }else{
      // oddsum+=x;
      // }
      // }
      // int difference= evensum-oddsum;
      // if (difference>1) {
      // boolean isPrime=true;
      // for (int i = 2; i <= Math.sqrt(difference); i++) {
      // if (difference%i==0) {
      // isPrime=false;
      // break;
      // }
      // if (isPrime) {
      // System.out.println("the"+ difference + "prime number");
      // }else{
      // System.out.println("the"+ difference + "composite number");
      // }
      // }
      // if (isPrime) {
      // System.out.println("the " + difference + "prime number");
      // }else{
      // System.out.println("the " + difference + "composite number");
      // }

      // }else{
      // System.out.println("the number is not prime or composite number ");
      // }
      //// Sum of all digits of the Number
      // input: 456778
      // output: 37

      // int num=456778;
      // int sum=0;

      // for (int i =num; i!=0; i/=10) {
      // int lastdigit=i%10;
      // sum+=lastdigit;
      // }
      // System.out.println("the sum of all digit:"+sum);

      // Reverse a Number
      // input:456778
      // output:877654

      // int num=456778;
      // while (num>0) {
      // int lastdigit=num%10;
      // System.out.print(lastdigit);
      // num/=10;
      // }
      // System.out.println();

      // Palindrome Number or not
      // input:456778
      // output:877654

      // int n=421124;
      // int lastdigit=0;
      // int temp=n;
      // int rev=0;
      // while (n>0) {
      // lastdigit=n%10;
      // rev=rev*10+ lastdigit;
      // System.out.print(lastdigit);
      // n/=10;
      // }
      // if (rev==temp) {
      // System.out.println(" :it is a palindrome number");
      // }else{
      // System.out.println(" :it is not a palindrome number");
      // }
      // System.out.println();
      // }
      // }
      // print all prime Number from 2 to 2000 using nested loop

      // for (int i = 2; i <= 1000; i++) {
      // boolean isPrime = true;
      // for (int j = 2; j <= Math.sqrt(i); j++) {
      // if (i % j == 0) {
      // isPrime = false;
      // break;

      // }

      // }
      // if (isPrime) {
      // System.out.print(i + " ");

      // }

      // }
      // }
      // }

      // print all palindrome Number from 1 to 1000

      // for (int i = 2; i<=1000; i++) {
      // int rev=0;
      // for (int j= i; j !=0;j/=10) {
      // int lastdigit=j%10;
      // rev=rev*10+ lastdigit;
      // }
      // if (rev==i) {
      // System.out.print(i + " ");
      // }
      // }

      // print all prime palindrome Number from 2 to 1000
      // for (int i = 2; i <= 1000; i++) {
      // int rev = 0;
      // for (int j = i; j != 0; j /= 10) {
      // int lastdigit = j % 10;
      // rev = rev * 10 + lastdigit;
      // }
      // if (rev == i) {
      // boolean isPrime = true;
      // if (i == 2) {
      // isPrime = false;
      // }
      // for (int j = 2; j <= Math.sqrt(i); j++) {
      // if (i % j == 0) {
      // isPrime = false;
      // break;
      // }
      // if (isPrime) {
      // System.out.print(i + " ");
      // }
      // }
      // }
      // }

      // }
      // }

      // second method of find palindrome number
      // for (int num= 2; num<=1000; num++) {
      // int rev=0;
      // int temp=num;

      // while (temp!=0) {
      // int rem=temp%10;
      // rev=rev*10+rem;
      // temp/=10;
      // }

      // if (num==rev) {
      // System.out.print(num + ",");
      // }

      // }
      // System.out.println();
      // }
      // }

      // second method of find prime number

   //    int num=17;
   //    boolean isPrime=true;
   //    if (num<=1) {
   //    isPrime=false;
   //    System.out.println("not a prime number");
   //    return;
   //    }else{
   //    for (int i = 2;i<num ; i++) {
   //    if (num%i==0) {
   //    isPrime=false;
   //    break;
   //    }

   //    }

   //    }
   //    if (isPrime) {
   //    System.out.println("it is a prime number");
   //    }else{
   //    System.out.println("not a prime number");
   //    }
   // }}

      // second method of finding prime number b/w 1 to 1000
      // for (int num = 2; num<=1000; num++) {

      // boolean isPrime=true;
      // for (int i = 2;i<num/2 ; i++) {
      // if (num%i==0) {
      // isPrime=false;
      // break;
      // }

      // }
      // if (isPrime) {
      // System.out.print(num +"," );

      // }
      // }

      // System.out.println();
      // }
      // }

      // print all prime palindrome Number from 2 to 1000
      // print all prime palindrome Number from 2 to 1000
      // for (int i = 2; i <= 1000; i++) {
      // int rev = 0;
      // for (int j = i; j != 0; j /= 10) {
      // int lastdigit = j % 10;
      // rev = rev * 10 + lastdigit;
      // }
      // if (rev == i) {
      // for (int num = 2; num<=1000; num++) {

      // boolean isPrime=true;

      // if (num%i==0) {
      // isPrime=false;
      // break;
      // }
      // if (isPrime) {
      // System.out.print(num +"," );
      // }

      // }
      // }

      // System.out.println();
      // }
      // }
      // }

      // print star pattern
      // *
      // * *
      // * * *
      // * * * *
      // for (int i = 1;i<=4; i++) {
      // for (int star = 1; star<=i; star++) {
      // System.out.print(" * ");
      // }
      // System.out.println();
      // }

      // print inverted star pattern
      // * * * *
      // * * *
      // * * *
      // *

      // for (int i = 1; i<=4; i++) {
      // for (int star = 1; star<=4-i+1; star++) {
      // System.out.print(" * ");
      // }
      // System.out.println();
      // }

      // armstrong number or narcisist number
      // int count=0;
      // int n=5678;
      // int temp=n;
      // int sum=0;

      // while (temp!=0) {
      // count++;
      // temp/=10;
      // }
      // temp=n;
      // while (temp!=0) {
      // int lastdigit= temp%10;
      // sum+=Math.pow(lastdigit, count);
      // temp/=10;
      // }
      // if (sum==n) {
      // System.out.println("Armstrong number");
      // }else{
      // System.out.println("not a Armstrong number");
      // }

      // print number is disarium or not
      // int n=28;
      // int temp=n;
      // int count=0;
      // int sum=0;
      // while (temp!=0) {
      // count++;
      // temp/=10;
      // }
      // temp=n;
      // while (temp!=0) {
      // int lastdigit= temp%10;
      // sum+=Math.pow(lastdigit, count);
      // count--;
      // temp/=10;
      // }
      // if (sum==n) {
      // System.out.println("disarium number");
      // }else{
      // System.out.println("not a disarium number");
      // }
      // }
      // }

      // // print 1 to 1000 disarium number
      // for(int n=1; n<=1000;n++){
      // int temp=n;
      // int count=0;
      // int sum=0;

      // while (temp!=0) {
      // count++;
      // temp/=10;
      // }
      // temp=n;
      // while (temp!=0) {
      // int lastdigit= temp%10;
      // sum+=Math.pow(lastdigit, count);
      // count--;
      // temp/=10;
      // }
      // if (sum==n) {
      // System.out.println(n);
      // }

      // }
      // for(int n=1; n<=1000;n++){
      // int temp=n;
      // int count=0;
      // int sum=0;

      // while (temp!=0) {
      // count++;
      // temp/=10;
      // }
      // temp=n;
      // while (temp!=0) {
      // int lastdigit= temp%10;
      // sum+=Math.pow(lastdigit, count);
      // temp/=10;
      // }
      // if (sum==n) {
      // System.out.println(n);
      // }
      // }

      // find perfect number

      // int num=28;
      // int sum=0;
      // for (int i = 0; i<=num/2; i++) {
      // if (num%i==0) {
      // sum+=i;
      // }
      // }
      // if (num==sum) {
      // System.out.println("it is a perfect number");
      // }else{
      // System.out.println("not a perfect number");
      // }
      // }
      // }
      // find strong number
      // int n=1000;
      // int temp=n;
      // int sum=0;
      // for(int i=1; i<=1000;i++){

      // while (temp>0) {
      // int lastdigit= temp%10;
      // int fact=1;
      // for (int j = 0; j <=lastdigit; i++) {
      // fact*=j;
      // }
      // sum+=fact;
      // temp/=10;
      // }
      // }

      // if (sum==n) {
      // System.out.println("it's a strong number");
      // }else{
      // System.out.println("not a strong number");
      // }

      // print automorpic number
//       int num = 0;
//       int square = num * num;// 625
//       int temp = num;// 25
//       while (temp > 0) {
//          if (temp % 10 != square % 10) { //
//             System.out.println("it is not a automorpic number");
//             return;
//          }
//          temp /= 10;
//          square /= 10;
//       }
//       System.out.println("automorpic number");
//    }
// }


   // second method
   // int number=25;
   // temp= number;
   // int square=number * number;
   // int count =0;
   // while{
   // count ++;
   // temp/=10;
   // }
   // int modulo=)(int)Math.pow)(10,cout);
   // int result=square%modulo;
   // if(number==result){
   // System.err.println("automorpic number");
   // }else{
   // System.out.println("not a automorpic number");
   // }

   // third method
   // int num=90;
   // int square=num*num;//625

   // boolean isAutomorpic=true;
   // while (num>0) {
   // if (num%10!=square%10) { //
   // isAutomorpic=false;

   // }
   // num/=10;
   // square/=10;

   // }
   // if (isAutomorpic) {
   // System.out.println(" automorpic number");
   // }else{
   // System.out.println(" not a automorpic number");
   // }

   // print harshad number
   // int num=1234;
   // int temp=num;
   // int sum=0;
   // while (temp>0) {
   // int digit= temp%10;
   // sum+=digit;
   // temp/=10;
   // }
   // if (num%sum==0) {
   // System.out.println("harshad number");
   // }else{
   // System.out.println("not a harshad number");
   // }
   // }
   // }

//    for(int i= 1;i<=1000;i++)
//    {
//       int temp = i;
//       int sum = 0;
//       while (temp > 0) {
//          int digit = temp % 10;
//          sum += digit;
//          temp /= 10;
//       }
//       if (i % sum == 0) {
//          System.out.println(sum + " ");

//       }

//    }
// }


// print palindrome harshad number
//  for(int i= 1;i<=1000;i++){
//       int temp = i;
//       int sum = 0;
//       while (temp!= 0) {
//          int digit = temp % 10;
//          sum += digit;
//          temp /= 10;
//       }
//       if (i % sum == 0) {
//          int rev=0;
//          temp=i;
//          while (temp!=0) {
//             int rem= temp%10;
//             rev= rev*10+rem;
//             temp/=10;
//          }
//          if (rev==i) {
//             System.out.print(i+ " ,") ;
       

//       }

 
   

   
//    }
//           System.out.println();
// }
// }
// }





// print all yhe unique concept of number that is used in java

//1. reverse of a number

//    int num=1234;
//    int rev=0;
//    int lastdigit=0;

//    while (num!=0) {
//       lastdigit=num%10;
//       rev=rev*10+lastdigit;
//       num/=10;
//    }
//    System.err.println(rev);
//    }
// }

//2. palindrome number 

   // int num=121;
   // int temp=num;
   //  int rev=0;
   //  int lastdigit=0;

   //  while (temp!=0) {
   //    lastdigit=temp%10;
   //    rev=rev*10+lastdigit;
   //    temp/=10;

   //  }
   //      System.out.println("the reverse of number is:"+rev);
   //     if (num==rev) {
   //       System.out.println("palindrome number");
   //     }else{
   //       System.out.println("not a palindrome number");
   //     }


   // 3. sum of any digit of a number

      //  int num=84567;
      //  int digit=0;
      //  int sum=0;
      //   while (num!=0) {
      //    digit=num%10;
      //    sum+=digit;
      //    num/=10;

      //   }
      // System.out.println("the sum of these digit is:"+sum);

//       // 4. find prime number
//            int num=1;
//            boolean isprime =true;
//         if (num<=1) {
//             isprime=false;
//             System.out.println("it is not a prime number");
//             return;
//         }else{
         
//           for (int i =2; i <num ; i++) {
//             if (num%i==0) {
//                isprime=false;
//                break;

//             }
//           }
         
         
//         }
//   if (isprime) {
//             System.out.println("prime number");
//           }else{
//             System.out.println(" not prime number");
//           }
         // print prime number b/w 1 to 1000


     
//     for (int num = 2; num <=1000; num++) {
//       boolean isprime=true;
//     for (int i = 2; i<=Math.sqrt(num); i++) {
//       if (num%i==0) {
//          isprime=false;
//          break;
//       }
//     }
//     if (isprime) {
//          System.out.print(num + ", " );
       
//     }
        
       

// }
//  System.out.println();
// }
// }

// for (int num = 2; num<=1000; num++) {

//       boolean isPrime=true;
//       for (int i = 2;i<num/2 ; i++) {
//       if (num%i==0) {
//       isPrime=false;
//       break;
//       }

//       }
//       if (isPrime) {
//       System.out.print(num +"," );

//       }
//       }

//       System.out.println();
//       }
//       }

// neon number
  
// int num=9; // 9
// int temp=num;//9
// int square=num*num;// 81
// int sum=0;


// while (square!=0) {
//    int lastdigit=square%10;//81%10=1
//     sum+=lastdigit;
//     square/=10;
// }
//    if (num==sum) {
//       System.out.println("it is a neon number");
//    }else {
//       System.out.println("not a neon number ");
// }


// spy number

//   int num=123;
//   int sum=0;
//   int product =1;
//   int rem=0;
//   while (num!=0) {
//      rem=num%10;
//      sum+=rem;
//      product*=rem;
//      num/=10;
//   }
//   while (num!=0) {
//      rem=num%10;
//      product*=rem;
//      num/=10;
//   }
//        if (sum==product) {
//          System.out.println("it is a spy number");
//        }else{
//          System.out.println("not a spy number");
//        }
//       }
//    }


  // duck number

   //  int num=1023;
   //  int rem=0;
   //  Boolean duck=true;
   //  while (rem==0) {
   //    rem=num%10;
   //    if (rem==0) {
   //       duck=false;
   //       break;
   //    }
   //    num/=10;
   //  }
   //  if (duck) {
   //    System.out.println("it is a duck number");
   //  }else{
   //    System.out.println("not a duck number");
   //  }

// 1 to 1000 spy number

//  for (int num = 1; num <= 1000; num++) {
//    int temp=num;
//   int sum=0;
//   int product =1;
//   int rem=0;

//   while (temp!=0) {
//      rem=temp%10;
//      sum+=rem;
//      product*=rem;
//      temp/=10;
//   }
  
//        if (sum==product) {
//          System.out.print( num+ ",");
       
//        }
//       }
//       System.out.println();



    // decimal to binary 

//         int n=777;
//         int rem=0;
//         String binary=" ";
//         if (n==0) {
//            binary ="0";
//         }else{
//          while (n!=0) {
//          rem=n%2;
//          binary=rem+binary;
//          n/=2;
//         }
//         }
        
//         System.out.println(binary + "binary");

//    }
// }
 // decimal to optual

//         int n=723;
//         int rem=0;
//         String optual=" ";
//         if (n==0) {
//            optual ="0";
//         }else{
//          while (n!=0) {
//          rem=n%8;
//          optual=rem+optual;
//          n/=8;
//         }
//         }
        
//         System.out.println(optual + "optual number");
// 

// binary to decimal


//         int binary=100;
//         int rem=0;
//         int power=0;
//         int decimal=0;

//         while (binary!=0) {
//          rem=binary%10;
//          decimal=decimal+ rem* (int)Math.pow(2, power);
//          power++;
//          binary/=10;

//         }
//         System.out.println(decimal);


    // optual to decimal 
            
      //   int optual=725;
      //   int rem=0;
      //   int power=0;
      //   int decimal=0;

      //   while (optual!=0) {
      //    rem=optual%10;
      //    decimal=decimal+ rem* (int)Math.pow(8, power);
      //    power++;
      //    optual/=10;

      //   }
      //   System.out.println(decimal);

        // check if any number is binary or not

//         int num=100;
//        int temp=num;
//         boolean binary=true;

//         while (temp!=0) {
//           int lastdigit=temp%10;
//           if (lastdigit!=0 && lastdigit!=1) {
//             binary=false;
//             break;
//           }
//           temp/=10;

//         }
//         if (binary) {
//          System.out.println("binary number");
//         }else{
//          System.out.println("not a binary number");
//         }

// }
//  }