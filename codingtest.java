import java.util.Scanner;

public class codingtest {
  public static void codingthinker() {
    byte b=127;
   int c=  (int)(b++ + ++b);
System.out.println(b);
  }
    public static void main(String[] args) {
        codingthinker();
// question 1=int x=10;
                 //System.out.println(x++ + ++x);
       // output is=22


       // question 2= char ch='A';
        // int x= ch+5;
        // System.out.println(x);
        // output is= 70


        //question 3= System.out.println(7+ "7" +7+7);
           // output is=7777

           //question 4=byte b=127;
         //b++;
         //System.out.println(b);
         //output is= -128
         //  because byte range is 127 to -128
           // that's why value get overflow and store in minimum value

           //question 5=
             //int x=5;
             //System.out.println(x+++ + ++x);
             //output is= 12

//question 6= Take a double value from user and convert it into: 
// • float 
// • long 
// • int 
// • short 
// • byte 
// Print all values


// double a=5667.8999;
// float b= (float) (a);//5667.9
// long c=(long)(a);    //5667
// int d= (int) (a);    //5667
// short e= (short)(a); //5667
// byte f= (byte)(a);//wrapping overflow ki wajah se output 35 print ho raha hai 

// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(d);
// System.out.println(e);
// System.out.println(f);

// question 7= Write a program to show overflow of: 
// • byte 
// • short 
// using increment operator.

// write byte code

// byte b=127;
//    int c=  (int)(b++ + ++b);
// System.out.println(b);
    // output is -127 it is overflow condition

    // write short code

    // short s=32767;
    //  s++;
    //  System.out.println(s);
     // output is -32768 because the range of short is 
         // -32768 to 32767 so it a overflow condition


   //question 8 ?
//  Write a program to check whether explicit casting loses data. 
// Example: 
// 130.876 → byte 
// Explain result

    //  byte b= (byte)130.876;
    //  System.out.println(b);

    // output is=-126
  //  beause byte range is 127 to -128 so 
       //130>127 so value store in minumum value
       // like -128, -127,and -126

       //question 9?

//  Check whether number is: 
// • positive 
// • negative 
// • zero 
// using nested if-else only.
// System.out.println("enter you num");
// Scanner sc=new Scanner(System.in);
//  int num=sc.nextInt();

//  if (num>0) {
//     System.out.println("your number is :"+"positive number");

//  }else{
//     if (num==0) {
//         System.out.println("your number is :"+ "the number is zero");

//     }else{
//         System.out.println("Your number is:"+"negative number");
//     }
// }

// Find largest among: 
// w x y z 
// using: 
// • nested if-else only 
// • no logical operators

// int w=4;
// int x=6;
// int y=5;
// int z=4;

// if (w>x) {
// if (w>y) {
// if (w>z) {
//     System.out.println("w is the largest");
// }else{
//     if (x>y) {
//      if (x>z) {
//         System.out.println("x is the largest");
//      } else{
//         System.out.println("z is the largest");
//      }  
//     }else{
//         if (y>z) {
//             System.out.println("y is the largest");
//         }else{
//             System.out.println("z is the largest");
//         }
//     }


// }   
// }
// }


//     }
// }


//  int w = 70;
// int x = 6;
// int y = 50;
// int z = 4;

//         if (w > x) {

//             if (w > y) {

//                 if (w > z) {
//                     System.out.println("w is the largest");
//                 }

//             }

//         } else {

//             if (x > y) {

//                 if (x > z) {
//                     System.out.println("x is the largest");
//                 } else {
//                     System.out.println("z is the largest");
//                 }

//             } else {

//                 if (y > z) {
//                     System.out.println("y is the largest");
//                 } else {
//                     System.out.println("z is the largest");
//                 }

//             }
//         }
//     }
// }
//   int w=40;
//   int x=500;
//   int y=60;
//   int z=7;
  
// if (w>x) { 
//     if (w>y) { 
//     if (w>z) { 
//     System.out.println("w is the largest");
//     }else {
//     System.out.println("z is the largest");
//     }
//     }else{
//     if (y>z) { //6>7
//     System.out.println("y is largest");;

//     }else{
//     System.out.println("z is the largest");;
//     }
//     }
//     }else {
//     if (x>y) {
//     if (x>z) {
//     System.out.println("x is the largest");;
//     }else{
//     System.out.println("z is the largest");;
//     }
//     }else{
//     if (y>z) {
//     System.out.println("y is the largest ");;
//     }else{
//     System.out.println("z isthe largest");;
//     }
//     }
//     }
//     }
// }

// Question 11 
// Find second largest among 4 numbers. 
// Constraint: 
// • no arrays 
// • no sorting

// int a=70000;
// int b=988;
// int c=5900;
// int d=465;
// int largest=0;
// int secondlargest=0;
// if (a>=b && a>=c && a>=d) {
//     largest=a;
//     if (b>=c && b>=d) {
//        secondlargest=b; 
//     }else{
//         if (c>=b && c>=d) {
//             secondlargest=c;
//         }else{
//             secondlargest=d;
//         }
//     }
// }else{
//     if (b>=a && b>=c && b>=d) {
//         largest=b;
//         if (a>=c && a>=d) {
//             secondlargest=a;
//         }else{
//             if (c>=a && c>=d) {
//                 secondlargest=c;
//             }else{
//                 secondlargest=d;
//             }
//         }
//     }else{
//         if (c>=a && c>=b && c>=d) {
//             largest=c;
//             if (b>=a && b>=d) {
//                 secondlargest=b;
//             }else{
//                 if (a>=b && a>=d) {
//                 secondlargest=a;    
//                 }else{
//                     secondlargest=d;
                
//             }
//         }
//     }else{
//         if (d>=a && d>=b && d>=c) {
//             largest=d;
//         }else{
//             if (a>=b && a>=c) {
//                 secondlargest=a;
//             }else{
//                 if (b>=a && b>=c) {
//                     secondlargest=b;
//                 }else{
//                     secondlargest=c;
//                 }
            
//             }
            
              
//         }
//     }
// } 

// }
// System.err.println("largest :"+ largest);
//             System.out.println("secondlargest :"+ secondlargest);
//          Question 12 
// Find smallest among 5 numbers using nested if-else.  
 
// int a=400;
// int b=50;
// int c=60;
// int d=400;
// int e=40;

// if (a<b) {
// if (a<c) {
// if (a<d) {
// if (a<e) {
//     System.out.println("a is the smallest among 5");
// } else{
//     System.out.println("e is the smallest among 5");
// }
// } else{
//     System.out.println("d is the smallest among 5");
// }
// }else{
//     System.out.println(" c is the smallest among 5");
// }    
// }else{
//     if (b<c) {
//     if (b<d) {
//      if (b<e) {
//         System.out.println("b is the smallest among 5 ");
//      } else{
//         System.out.println("e is the smallest among 5");
//      }  
//     }    
//     }else{
//         if (c<d) {
//          if (c<e) {
//           System.out.println("c is the smallest among 5");  
//          }else{
//             System.out.println("e is the smallest among 5");
//          }   
//         }else{
//             if (d<e) {
//                 System.out.println("d isthe smallest among 5");
//             }else{
//                 System.out.println("e is the smallest among 5");
//             }
//         }
//     }
// }


// Question 13 
// Check even/odd using: 
// 1. modulo 
// 2. bitwise operator 
// 3. division logic

// int num=67;     //1. modulo

// if (num%2==0) {
//     System.out.println("even number");
// }else{
//     System.out.println("odd number");
// }
   

// int a=67;           // bitwise opertore

// if ((a&1)==0) {
//     System.out.println("even");
// }else{
//     System.out.println("odd");
// }


// int a= 5;              //3.division logic
//   if ((a/2)*2==a) {
//     System.out.println("even");
//   }else{
//     System.out.println("odd");
//   }

// Question 14 
// Check whether number divisible by: 
// • 3 
// • 5 
// • 7 
// without using %.

// int num=90;

// if ((num/3)*3==num) {
//   System.out.println("number is divisible by 3");
//   }else{
// System.out.println("num is not divisible by 3");

 // check number is divisible by 5

//  int n =50;
//  if ((n/5)*5==n) {
//   System.out.println("number is divisible by 5");
//  }else{
//   System.out.println("number is not divisible by 5");
//  }

   // check number is divisible by 7

  //  int n=98;
  //  if ((n/7)*7==n) {
  //    System.out.println("number is divisible by 7");
  //  }else{
  //    System.out.println("number is not divisible by 7");
  //  }


//   Question 15 
// Check whether: 
// (sum of digits) 
// is even or odd.

// int a=7;
// int b=10;
// int c=8;
// int d=10;

// int sum=a+b+c+d;

// if (sum%2==0) {
//   System.out.println("even number ");
// }else{
//   System.out.println("odd number");
// }

//  Question 16 
// Check whether third-last digit is: 
// • odd 
// • even 
// • prime 

// int a= 567499;
// int b= a%10;
// a/=10;
// int c=a%10;
// a/=10;
// int d=a%10;
// a/=10;
// if (d%2==0) {
//   System.out.println("even number");
// }else{
//   System.out.println("odd number");
// }if (d==2 || d==3 || d==5 || d==7 ||d==9) {
//   System.out.println("prime number");
// }else{
//   System.out.println("not a prime number");
// }


// Question 17 
// Check whether character is: 
// • uppercase 
// • lowercase 
// • digit 
// • symbol

// char opp=0;
// if (opp>='A' && opp<='Z') {
//   System.out.println("char is uppercase");
// }else{
//   if (opp>='a' && opp<='z') {
//     System.out.println("char is lowercase");
//   }else{
//     if (opp>=0 && opp<=9) {
//       System.out.println("it is a digit");
//     }else{
//       System.out.println("it is a symbol");
//     }
//   }
// }

// Question 18 
// Check whether alphabet is: 
// • vowel 
// • consonant 
// without using logical OR operator.


// char ch='I';

// if (ch>='A' && ch<='Z') {
//   ch=(char)(ch+32);
// }
// if (ch=='a') {
//   System.out.println("vowal");
// }else{
//   if (ch=='e') {
//     System.out.println("vowal");
//   }else{
//     if (ch=='i') {
//       System.out.println("vowal");
//     }else{
//       if (ch=='o') {
//         System.out.println("vowal");
//       }else{
//         if (ch=='u') {
//           System.out.println("vowal");
//         }else{
//           System.out.println("consonant");
//         }
      
//       }
//     }
//   }
// }

//second method

// char ch='I';


// if (ch=='A') {
//   System.out.println("vowal");
// }else{
//   if (ch=='E') {
//     System.out.println("vowal");
//   }else{
//     if (ch=='I') {
//       System.out.println("vowal");
//     }else{
//       if (ch=='O') {
//     System.out.println("vowal");
//       }else{
//         if (ch=='U') {
//           System.out.println("vowal");
//         }else{
//           if (ch=='a') {
//           System.out.println("vowal");
//           }else{
//             if (ch=='e') {
//           System.out.println("vowal");
//             }else{
//               if (ch=='i') {
//                System.out.println("vowal"); 
//               }else{
//                 if (ch=='o') {
//                   System.out.println("vowal");
//                 }else{
//                   if (ch=='u') {
//                     System.out.println("vowal");
                    
//                   }else{
//                     System.out.println("consonant");
//                   }
//                 }
//               }
//             }
//           }
//         }
//       }
//     }
//   }
// }

// Question 19 
// Convert: 
// • uppercase → lowercase 
// • lowercase → uppercase 
// without built-in methods.

// char ch='B';

// if (ch>='A' && ch<='Z') {
//   ch=(char) (ch+32);
//   System.out.println(ch);
// }else{
//   if (ch>='a' && ch<='z') {
//     ch=(char) (ch-32);
//     System.out.println(ch);
//   }else{
//     System.out.println("symbol ");
//   }
// }

// 
// char ch='k';
// if (ch>=0 && ch<=9) {
//   System.out.println("hexadecimal digit");
// }else{
//   if (ch>='A' && ch<='F') {
//     System.out.println("hexadecimal digit");
//   }else{
//     if (ch>='a' && ch<='f') {
//       System.out.println(" hexadecimal digit");
//     }else{
//       System.out.println("not a hexadecimal digit");
//     }
//   }
// }

// Question 21 
// Build calculator using: 
// • switch statement 
// Operations: 
// + - 
// * 
// / 
// %
// System.out.println("enter first value ");
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// System.out.println("enter second value");
// int b=sc.nextInt();
// System.out.println("choose a operator");
// char opp=sc.next().charAt(0);


// switch (opp) {
//   case '+':
//     System.out.println(a+b);
//     break;
//   case '-':
//     System.out.println(a-b);
//     break;
//     case '*':
//       System.out.println(a*b);
//       break;
//       case '/':
//         System.out.println(a/b);
//         break;
//         case '%':
//           System.out.println(a%b);
//           break;
//   default:
//     System.out.println("invaild operator");
//     break;
// }

// Question 22 
// Add support for: 
// power (^) 
// operation.
// System.out.println("enter first number");
// Scanner sc=new Scanner(System.in);
// double a=sc.nextDouble();
// System.out.println("enter second number");
// double b=sc.nextDouble();
// System.out.println("choose your operator >> +, -, *, /, % ,^");
// char opp=sc.next().charAt(0);

// switch (opp) {
//   case '+':
//     System.out.println("your result is:"+(a+b));
//     break;
// case '-':
//     System.out.println(" your result is:"+ (a-b));
//     break;
// case '*':
//     System.out.println("your result is:"+(a*b));
//     break;
// case '/':
//     System.out.println("your result is"+(a/b));
//     break;
// case '%':
//     System.out.println("your result is"+(a%b));
//     break;
// case '^':
//     System.out.println("your result is:"+(Math.pow(a, b)));
//     break;

//   default:
//     System.out.println("invaild operatore");
//     break;
// }

//Question 23 
//3Create menu-driven calculator.
Scanner sc=new Scanner(System.in);
System.out.println("1. Addition");
System.out.println("2. substraction");
System.out.println("3. multiplication");
System.out.println("4. division");
System.out.println("5. modulo");
System.out.println("6. power");

System.out.println("enter choice");

int choice= sc.nextInt();
System.out.println("enter first number");
double a=sc.nextDouble();
System.out.println("enter second number");
double b=sc.nextDouble();

switch (choice) {
  case 1:
    System.out.println("your result is:"+(a+b));
    break;
case 2:
    System.out.println(" your result is:"+ (a-b));
    break;
case 3:
    System.out.println("your result is:"+(a*b));
    break;
case 4:
    System.out.println("your result is"+(a/b));
    break;
case 5:
    System.out.println("your result is"+(a%b));
    break;
case 6:
    System.out.println("your result is:"+(Math.pow(a, b)));
    break;

  default:
    System.out.println("invaild operatore");
    break;
   }
// Question 24 
// Check whether 3 sides form triangle.
//System.out.println("enter side 1");
// Scanner sc=new Scanner(System.in);
// System.out.println("enter side 1");
// int a=sc.nextInt();
// System.out.println("enter side 2");
// int b=sc.nextInt();
// System.out.println("enter side 3");
// int c=sc.nextInt();

// if (a+b>c) {
//   if (b+c>a) {
//     if (a+c>b) {
//       System.out.println("triangle can be formed");
//     }else{
//       System.out.println("triangle can not be formed");
//     }
//   }else{
//     System.out.println("trianglr can not be formed");
//   }
// }else{
//   System.out.println("triangle can not be formed");
// }



// Question 25 
// Identify: 
// • Equilateral 
// • Isosceles 
// • Scalene

//  Scanner sc=new Scanner(System.in);
// System.out.println("enter side 1");
// int a=sc.nextInt();
// System.out.println("enter side 2");
// int b=sc.nextInt();
// System.out.println("enter side 3");
// int c=sc.nextInt();


// if (a+b>c && b+c>a && a+c>b) {
//   System.out.println("triangle can be formed");


//   if (a==b && b==c) {
//     System.out.println("equilateral triangle");
//   }else{
//     if (a==b || b==c || c==a) {
//       System.out.println("isosceles triangle");
//     }else{
//       System.out.println("scalene");
//     }
//   }
// }else{
// System.out.println("triangle can not be formed");
// }

// Question 26 
// Check whether triangle is: 
// • acute 
// • right 
// • obtuse 
// using Pythagoras logic.

// Scanner sc=new Scanner(System.in);
// System.out.println("enter side 1");
// int a=sc.nextInt();
// System.out.println("enter side 2");
// int b=sc.nextInt();
// System.out.println("enter side 3");
// int c=sc.nextInt();


// if (a+b>c && b+c>a && a+c>b) {
//   System.out.println("triangle can be formed");


//   if (a==b && b==c) {
//     System.out.println("equilateral triangle");
//   }else{
//     if (a==b || b==c || c==a) {
//       System.out.println("isosceles triangle");
//     }else{
//       System.out.println("scalene");
//     }
//   }
// }else{
// System.out.println("triangle can not be formed");
// }

// int x=a*a;
// int y=b*b;
// int z=c*c;

// if (x+y==z || y+z==x || x+z==y) {
//   System.out.println("angle type is : right angle");
// }else{
//   if (x+y>z || y+z>x || x+z>y) {
//     System.out.println("angle type: obtuse angle");
//   }else{
//     System.out.println("angle type:acute angle");
//   }
// }


// Question 27 
// Find area of triangle using:

// double base =90;
// double height=5;

// double area=0.5*base*height;
// System.out.println("Area of the triangle is:"+area);

// Question 28 
// Check leap year using: 
// • nested if-else only
// int year=2047;
// if (year%400==0) {
//   System.out.println("leap year");
// }else{
//   if (year%100==0) {
//     System.out.println("leap year");
//   }else{
//     if (year%4==0) {
//       System.out.println("leap year");
//     }else{
//       System.out.println("not a leap year");
//     }
//   }
// } 

//Question 29 
// Find number of leap years between: 
// 1900 to 2025


// Question 30 
// Print next leap year after given year.

  //  int year=1896;
  //    year++;
  //    if ((year+1)%4==0) {
  //     System.out.println(year+1);
  //    }else{
  //     if ((year+2)%4==0) {
  //       System.out.println(year+2);
  //     }else{
  //       if ((year+3)%4==0) {
  //         System.out.println(year+3);
  //       }else{
  //         System.out.println(year+4);
  //       }
  //     }
  //    }

//   Question 31 
// Print day name using switch

// int day=6;
// switch (day) {
//   case 1:
//     System.out.println("Monday");
//     break;
// case 2:
//     System.out.println("Tuesday");
//     break;
// case 3:
//     System.out.println("Wednesday");
//     break;
// case 4:
//     System.out.println("thusday");
//     break;
// case 5:
//     System.out.println("Friday");
//     break;
// case 6:
//     System.out.println("saturday");
//     break;
// case 7:
//     System.out.println("sunday");
//     break;

//   default:
//     System.out.println("invaild day");
//     break;
// }
// System.out.println("enter your month");
// Scanner sc=new Scanner(System.in);
// int month=sc.nextInt();
// switch (month) {
//   case 1:
//     System.out.println("january : 31 days");
//     break;

// case 2:
//     System.out.println("february : 28/29 days");
//     break;

    
//     case 3:
//     System.out.println("march : 31 days");
//     break;

//     case 4:
//     System.out.println("april : 30 days");
//     break;

//     case 5:
//     System.out.println("may : 31 days");
//     break;

//     case 6:
//     System.out.println("june : 30 days");
//     break;

//     case 7:
//     System.out.println("july : 31 days");
//     break;

//     case 8:
//     System.out.println("august : 31 days");
//     break;

//     case 9:
//     System.out.println("september : 30 days");
//     break;

//     case 10:
//     System.out.println("october : 31 days");
//     break;

//     case 11:
//     System.out.println("november : 30 days");
//     break;

//     case 12:
//     System.out.println("december : 31 days");
//     break;

//   default:
//     System.out.println("invaild month");
//     break;
// }

// Question 33 
// Create role-based access system: 
// Admin 
// User 
// Guest 
// Director 
// using switch.

// System.out.println("enter your role");
// Scanner sc= new Scanner(System.in);
// String str=sc.nextLine();
// switch (str) {
//   case "Admin":
//     System.out.println("given acces to admin");
//     break;
// case "User":
//     System.out.println("given acces to user");
//     break;
// case "Guest":
//     System.out.println("given acces to gust");
//     break;
// case "Director":
//     System.out.println("given acces to director");
//     break;
  
//   default:
//     System.out.println("invaild detail");
//     break;
// }

// Question 34 
// Reverse 3-digit number. 
// Example: 
// 123 → 321

// Question 35 
// Check palindrome number.


// Question 36 
// Swap two numbers: 
// 1. using third variable 
// 2. without third variable 
// 3. using XOR

// Question 37 
// Find greatest among numbers using ternary only.


// int a=67;
// int b=450;

// int greatest=(a>b)? a:b ;
//     System.out.println("greatest number is:"+greatest);

// Question 38 
// Check whether number is Armstrong.

// Question 39 
// Extract: 
// • first digit 
// • middle digit 
// • last digit


// Question 40 
// Create grading system. 
// Marks Grade 
// 90+ 
// 75+ 
// 60+ 
// 40+ 
// A 
// B 
// C 
// D 
// Below 40 Fail

// System.out.println("enter your marks");
// Scanner sc=new Scanner(System.in);
// int num=sc.nextInt();

// if (num>=90) {
//   System.out.println("A grade");
// }else{
//   if (num>=75) {
//     System.out.println("B grade");
//   }else{
//     if (num>=60) {
//       System.out.println("C grade");
//     }else{
//       if (num>=40) {
//         System.out.println("D grade");
//       }else{
//         System.out.println("fail");
//       }
//     }
//   }
// }
  }
 }
  




 
