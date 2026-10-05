public class numberconcept {
   public static void main(String[] args) {
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

// 4. neon number
  
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


//  5. spy number

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


  // 6. duck number

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

// 7. 1 to 1000 spy number

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



    // 8. decimal to binary 

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
 //9. decimal to optual

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

//10. binary to decimal


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

// 11. factorial of number
    //     int fact=1;
    // for (int i = 1; i <=4; i++) {
    //     fact=i*fact;
    // }
    //      System.out.println(fact);
    

// 12. Strong number

// int num=145;
// int temp=num;//145
// int sum=0;

// int lastdigit=1;
// while (temp!=0) { //145!=0
//     lastdigit=temp%10;// 145%10=5int 
//        int fact=1;
//     for (int i = 1; i <=lastdigit ; i++) {//5
//         fact*=i;//
        
//     }
//     sum+=fact;
//         temp/=10;//120
// }
//     if (sum==num) {
//         System.out.println("strong number");
//     }else{
//         System.out.println("not a strong number");
//     }

   
}
 }
   
