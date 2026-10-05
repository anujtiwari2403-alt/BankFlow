//import java.util.Scanner;

import java.util.Scanner;

public class JavaBasics { // input method
  public static void main(String[] args) {
    // Scanner sc= new Scanner (System.in);

    // System.out.println("Enter a character:");
    // String str= sc.nextLine();
    // System.out.println(str );

    // String str= sc.next();
    // System.out.println(str);

    // char c= sc.next().charAt(2);
    // System.out.println(c);

    // coditional statement

    // int num =12;
    // if (num>0) {
    // System.out.println("positive number");
    // }

    // else{
    // System.out.println("negative number");
    // }
    // if the multiple condition run together then use else if
    // int num =0;
    // if(num>0) {
    // System.out.println("positive number");
    // }else if(num==0) {
    // System.out.println("number is zero");

    // }else {
    // System.out.println("negative number");
    // }

    // create a income tax calculator

    // Scanner sc= new Scanner(System.in);
    // System.out.println("enter youe annul income");
    // int income= sc.nextInt();
    // int tax ;
    // if (income<=400000) {
    // tax=0;
    // } else if(income>=400000 && income<=800000){
    // tax= (int) (income*0.05);
    // } else if(income>800000 && income<=1200000){
    // tax= (int) (income*0.10);
    // }
    // else if (income>1200000 && income<=1600000) {
    // tax= (int) (income*0.15);
    // }
    // else if (income>1600000 && income<=2000000) {
    // tax= (int) (income*0.20);
    // }
    // else if (income>2000000 && income<=2400000) {
    // tax= (int) (income*0.25);
    // }
    // else{
    // tax= (int) (income*0.30);
    // }
    // System.out.println("your annul tax is:"+tax);

    // int marks=85;
    // if (marks>=80) {
    // System.out.println("A");

    // } else if (marks>=90) {
    // System.out.println("A+");
    // }else if (marks>=70) {
    // System.out.println("B+");
    // }else if (marks>=60) {
    // System.out.println("B");
    // }else if (marks>=50) {
    // System.out.println("c");
    // }else{
    // System.out.println("fail");
    // }

    // class date-9/05/26
    // Scanner sc= new Scanner(System.in);
    // System.out.println("enter your annul income");
    // Double income= sc.nextDouble();
    // double tax =0;
    // if (income <= 400000) {

    // }else if (income>400000 && income<=80_000_0) {
    // tax=income*0.05;
    // }else if (income>800000 && income<=1200000){
    // tax = income*0.10;
    // }else if (income>1200000 && income<=1600000) {
    // tax= income*0.15;
    // }else if (income>1600000 && income<=2000000) {
    // tax=income*0.20;
    // }else if (income>2000000 && income<=2400000) {
    // tax= (income)*0.25;

    // }else{
    // tax =income*0.30;
    // }
    // System.out.println(" your annual tax is:"+ tax);

    // Scanner sc= new Scanner(System.in);
    // System.out.println("enter your number is");
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // char operator= sc.next().charAt(0);

    // switch (operator) {
    // case '+': System.out.println(a+b);

    // break;
    // case '-': System.out.println(a-b);
    // break;
    // case '*': System.out.println(a*b);
    // break;
    // case '/': System.out.println(a/b);
    // default:System.out.println("wrong opreator");
    // break;
    // }
    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter value 1");
    // double a=sc.nextDouble();
    // System.out.println("enter the value 2");
    // double b=sc.nextDouble();
    // char opp=sc.next().charAt(0);

    // if (opp=='+') {
    // System.out.println(a+b);
    // }else if (opp=='-') {
    // System.out.println(a-b);
    // }else if (opp=='*') {
    // System.out.println(a*b);
    // }else if (opp=='/') {
    // System.out.println(a/b);
    // }else if (opp=='%') {
    // System.out.println(a%b);
    // }else{
    // System.out.println("invaild opreator");
    // }

    // Scanner sc= new Scanner(System.in);
    // System.out.println("Enter a num1 :");
    // double num1 = sc.nextDouble();
    // System.out.println("Enter a Operator: ");
    // char operator = sc.next().charAt(0);
    // System.out.println("Enter a num2 :");
    // double num2 = sc.nextDouble();

    // double solution = 0;

    // if (operator == '+') {

    // System.out.println("Sum is : " + (num1 + num2));
    // solution = num1 + num2;
    // } else if (operator == '-') {

    // System.out.println("Substraction is : " + (num1 - num2));
    // solution = num1 - num2;
    // } else if (operator == '*') {

    // System.out.println("Multiplication is : " + (num1 * num2));
    // solution = num1 * num2;
    // } else if (operator == '/') {

    // if (num2 != 0) {
    // System.out.println("Division is : " + (num1 / num2));
    // solution = num1 / num2;

    // } else {
    // System.out.println(" num2 can not be equal to zero ");
    // }
    // } else if (operator == '%') {
    // System.out.println("Division is : " + (num1 % num2));
    // solution = num1 % num2;

    // } else {
    // System.out.println("Invalid Operator");
    // }

    // System.out.println("Solution is : "+ solution);

    // date 12/05/26
    // question

    // print the largest of 3

    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter a value ");
    // int a=sc.nextInt();
    // System.out.println("enter b value");
    // int b=sc.nextInt();
    // System.out.println("enter c value");
    // int c=sc.nextInt();
    // if (a>=b && a>=c) {
    // System.out.println("a is the largest of 3");
    // } else if (b>=c && b>=a) {
    // System.out.println("b is the largest of 3");
    // }else{
    // System.out.println("c is the largest of 3");
    // }
    // System.out.println("enter a number");
    // date 14/05/26

    // print a number 9876545 and check the number 5 and 3 %9876545 (sum%7==0)

    // int x=9876545;
    // int y=x%5;
    // int z=x%3;
    // int sum =y+z;

    // if (sum%7==0) {
    // System.out.println("condition is true ");
    // } else {
    // System.out.println("condtion is false");
    // }

    // ise question ko karne ka simple sa trick

    // int x=9876545;

    // if (((x%5) + (x%3))%7==0) {
    // System.out.println("condition is true");
    // } else {
    // System.out.println("condition is false ");
    // }

    // class date-14/05/26
    // int x=1238623;
    // int y=x/10;
    // if (x%2==0) {
    // System.out.println("even number");
    // }else{
    // System.out.println("odd number");
    // // }

    // print the last third digit of a number
    // int x=1238623;
    // int p=x%1000;
    // p/=100;

    // System.out.println(p);
    // if (p%2==0) {
    // System.out.println("even number");
    // } else {
    // System.out.println("odd number");
    // }

    // question give the soloution of these statement 23+68+25=ans%5
    // 1st method is question ko karne ke liye

    // int x=236825;
    // int x1=x/10000;
    // int y=x%10000;
    // int y1=y/100;
    // int z=x%100;
    // int sum=x1+y1+z;

    // if (sum%5==0) {
    // System.out.println("even number");
    // } else{
    // System.out.println("odd number");
    // }
    // second method is qestion ko karne ke liye

    // int x=236825;
    // int p=x%100;
    // x/=100;
    // int q=x%100;
    // x/=100;
    // int r=x%100;
    // x/=100;

    // int sum = p+q+r;
    // System.out.println(p);
    // System.out.println(q);
    // System.out.println(r);

    // System.out.println(sum);

    // if (sum%5==0) {
    // System.out.println("even number ");
    // } else{
    // System.out.println("odd number");
    // }

    // print the sum of 1+7+3+2+4+5=sum%==0

    // method first ye method thoda sa bada aur complicated hai

    // int a=173245;
    // int a1=a/100000;
    // int b=a/10000;
    // int b1=b%10;
    // int c=a/1000;
    // int c1=c%10;
    // int d=a/100;
    // int d1=d%10;
    // int e=a/10;
    // int e1=e%10;
    // int f= a/1;
    // int f1=f%10;

    // int sum=a1+b1+c1+d1+e1+f1;
    // System.out.println(sum);
    // System.out.println(a1);

    // System.out.println(b1);

    // System.out.println(c1);

    // System.out.println(d1);

    // System.out.println(e1);

    // System.out.println(f1);

    // if (sum%5==0) {
    // System.out.println("even number");
    // }else{
    // System.out.println("odd number");
    // }
    // }
    // second aur sabse best method hai kisi bhi question ko karne ke liye

    // int x=173245;
    // int p=x%10;
    // x/=10;
    // int q=x%10;
    // x/=10;
    // int r=x%10;
    // x/=10;
    // int s=x%10;
    // x/=10;
    // int t=x%10;
    // x/=10;
    // int w=x%10;

    // int sum=p+q+r+s+t+w;

    // System.out.println(p);
    // System.out.println(q);
    // System.out.println(r);
    // System.out.println(s);
    // System.out.println(t);
    // System.out.println(w);

    // System.out.println(sum);

    // if (sum%5==0) {
    // System.out.println("even number");
    // }else{
    // System.out.println("odd number");
    // }

    // }
    // }
    // topic is next at

    // print a char is lower case or upper case
    // System.out.println("enter your char ");
    // Scanner sc=new Scanner(System.in);
    // char opp= sc.next().charAt(0);
    // if (opp>='A' && opp<='Z' ) {
    // System.out.println("Upper case");
    // } else if (opp>='a' && opp<='z') {
    // System.out.println("lower case");
    // }else if (opp>='0' && opp<='9') {
    // System.out.println("its a number");
    // }else{
    // System.out.println("symbol");
    // }

    // topic (next at) date 16/05/26

    // .Scanner sc=new Scanner(System.in);

    // if ((num%7==0) && (num%5==2)) {
    // System.out.println("yes");
    // }else {
    // System.out.println("no");
    // }
    // if (num%7!=0) {
    // System.out.println("even");
    // }else{
    // System.out.println("odd");
    // }

    // print if any alpha bet is vowal or consnant
    // System.out.println("enter your alphabet");
    // Scanner sc=new Scanner(System.in);
    // char ch=sc.next().charAt(5);

    // if ((ch>='A' || ch<='Z') && (ch>='a' || ch<='z')) {
    // if ((ch=='A'|| ch=='E' || ch=='I' ||ch=='O' || ch=='u' ) && (ch=='a' ||
    // ch=='e'|| ch=='i' || ch=='o' || ch=='u') ) {
    // System.out.println("vowal");
    // }else{
    // System.out.println("consonent");

    // }else if (ch<=0 || ch<=9) {
    // System.out.println("number");
    // }else{
    // System.out.println("symbol");
    // }

    // {
    // class date>>19/05/26

    // switch statement
    // System.out.println("enter a number ");
    // Scanner sc=new Scanner(System.in);
    // int day =sc.nextInt();
    // switch (day) {
    // case 1:
    // System.out.println("monday");
    // break;
    // case 2:
    // System.out.println("tuesday");
    // break;
    // case 3:
    // System.out.println("wednesday");
    // break;
    // case 4:
    // System.out.println("thusday");
    // break;

    // case 5:
    // System.out.println("friday");
    // break;
    // case 6:
    // System.out.println("saturday");
    // break;
    // case 7:
    // System.out.println("sunday");
    // break;
    // default:
    // System.out.println("enter a vaid day");
    // break;
    // }

    // create a calculator using switch statement
    // System.out.println("enter first number");
    // Scanner sc=new Scanner(System.in);
    // double a =sc.nextDouble();
    // System.out.println("enter second number");
    // double b= sc.nextDouble();
    // System.out.println("choose operator sign");

    // char opp=sc.next().charAt(0);

    // switch (opp) {

    // case '+':
    // System.out.println(a+b);
    // break;
    // case '-':
    // System.out.println(a-b);
    // break;
    // case'*':
    // System.out.println(a*b);
    // break;
    // case '/':
    // System.out.println(a/b);
    // break;
    // case '%':
    // System.out.println(a%b);
    // default:
    // System.out.println("enter a vaild number");
    // break;
    // }

    // check student grade using switch statement

    // System.out.println("enter your grade");
    // Scanner sc= new Scanner(System.in);
    // String grade=sc.next();

    // switch (grade) {
    // case "A+":
    // System.out.println("excellent");
    // break;
    // case "A":
    // System.out.println("very good");
    // break;
    // case "B+":
    // System.out.println("good");
    // break;

    // case "b":
    // System.out.println("nice");
    // break;

    // case "c+":
    // System.out.println("avrage");
    // break;

    // case "c":
    // System.out.println(" try to more prepare");
    // break;

    // case "d":
    // System.out.println("bad");
    // break;

    // case "e":
    // System.out.println("very bad ");
    // break;

    // case "f":
    // System.out.println("fail");
    // break;

    // default:
    // System.out.println("enter a vaild grade");

    // break;
    // }

    // check a alphabet is vowal or consonant
    // System.out.println("enter your alphabet");
    // Scanner sc= new Scanner(System.in);
    // char ch=sc.next().charAt(0);

    // switch (ch) {
    // case 'a':
    // System.out.println("vowal");
    // break;
    // case 'e':
    // System.out.println("vowal");
    // break;
    // case 'i':
    // System.out.println("vowal");
    // break;
    // case 'o':
    // System.out.println("vowal");
    // break;
    // case 'u':
    // System.out.println("vowal");
    // break;
    // case 'A':
    // System.out.println("vowal");
    // break;
    // case 'E':
    // System.err.println("VOWAL");
    // break;
    // case 'O':
    // System.out.println("vowal");
    // break;
    // case 'U':
    // System.err.println("vowal");

    // break;
    // default:
    // System.out.println("consonant");
    // }

    // short form of this code

    // switch (ch) {
    // case 'a':
    // case 'e':
    // case 'i':
    // case 'o':
    // case 'u':

    // case 'A':
    // case 'E':
    // case 'I':
    // case 'O':
    // case 'U':

    // System.out.println("vowal");
    // break;

    // default:
    // System.out.println("consonant");
    // break;
    // }

    // print largest between three number

    // int x=30;
    // int y=9;
    // int z=37;
    // int largest;
    // if (x>y) {
    // if (x>z) {
    // largest=x;
    // }else{
    // largest=z;

    // }
    // }
    // else{
    // if (y>z) {
    // largest=y;
    // }else{
    // largest=z;
    // }
    // System.out.println("largest number is: +largest");
    // }
    // }

    // topic . ternary opreator

    // print largest beytween three number using ternary operator
    // int x=30;
    // int y=9;
    // int z=37;

    // int largest=(x>y)? ((x>z) ? x:z) : ((y>z) ? y:z);
    // System.out.println("largest number is :" + largest);

    // quetion>> print largesdt between 4 numbers using only
    // nested if else

    // System.out.println("enter value a");
    // Scanner sc=new Scanner(System.in);
    // double a = sc.nextDouble();//4
    // System.out.println("enter value b");
    // double b= sc.nextDouble();//5
    // System.out.println("enter value c");
    // double c=sc.nextDouble();//6
    // System.out.println("enter value d");
    // double d=sc.nextDouble();//7

    // double largest;

    // if (a>b) { //4>5
    // if (a>c) { //4>6
    // if (a>d) { //4>7
    // largest=a;
    // }else {
    // largest=d;
    // }
    // }else{
    // if (c>d) { //6>7
    // largest=c;

    // }else{
    // largest=d;
    // }
    // }
    // }else {
    // if (b>c) {
    // if (b>d) {
    // largest=b;
    // }else{
    // largest=d;
    // }
    // }else{
    // if (c>d) {
    // largest=c;
    // }else{
    // largest=d;
    // }
    // }
    // }

    // print largest of 4 number using ternary operator

    // int a= 5;
    // int b=4;
    // int c=3;
    // int d=2;

    // int largest =(a>b)? (a>c)? ((a>d) ? a:d) : ((c>d)? c:d) :(b>c)?((b>d)? b:d) :
    // (c>d)? c:d;
    // System.out.println("largest number is :"+largest);

    // int a=7;
    // int b=6;
    // int c=5;

    // int largest= (a>b)? ((a>c)? (a):(c)) : ((b>c)? (b):(c));
    // System.out.println("largest number is:"+largest);

    // print if any number square is a perfect square
    // System.out.println("enter your number");
    // Scanner sc= new Scanner(System.in);
    // int n= sc.nextInt();
    // int a= (int) Math.sqrt(n);
    // int b= (int)Math.pow(a,2);

    // if (n==b) {
    // System.out.println("perfect square");
    // }else{
    // System.out.println("not perfect square");
    // }
    // }

    // print if any triange is equilateral , isosceles, scalane..............

    // int a=8;
    // int b=9;
    // int c=8;

    // if (a+b>c && b+c>a && c+a>b) {
    // System.out.println("it is triangle");
    // if (a==b && a==c) {
    // System.out.println("it is equalatrail");
    // }else if (a==b || a==c || c==a) {
    // System.out.println("isosceles");
    // }else{
    // System.out.println("scalane");
    // }
    // }else{
    // System.out.println("not a triangle");
    // }

    // using ternary operator we can solve this question
    // System.out.println("enter side 1");
    // Scanner sc = new Scanner(System.in);
    // int a= sc.nextInt();
    // System.out.println("enter side 2");
    // int b= sc.nextInt();
    // System.out.println("enter side 3");
    // int c= sc.nextInt();

    // boolean vaild=(a+b>c && b+c>a && a+c>b);
    // System.out.println(vaild ? "triangle hai " :"not a triangle");

    // if (vaild) {
    // String sideType=(a==b && b==c ) ? "Equilateral":(a==b || b==c || a==c)
    // ? "isosceles":"scalene";
    // System.out.println(sideType);
    // }

    // Scanner sc= new Scanner (System.in );
    // System.out.println("enter angle 1");
    // int a=sc.nextInt();
    // System.out.println("enter angle 2");
    // int b=sc.nextInt();
    // System.out.println("enter angle 3");
    // int c= sc.nextInt();

    // boolean vaild =(a+b>c && b+c>a && a+c>b);
    // System.out.println( vaild? "it is a triangle" : "it is not a triangle");

    // String sideType= (a==b && b==c )? "equlateral":(a==b || b==c || a==c)?
    // "isosceles":"scalene";

    // System.out.println(sideType);
    // }

    // ? print this in nested if else

    // Scanner sc= new Scanner(System.in);
    // System.out.println("enter side 1");
    // Double a=sc.nextDouble();
    // System.out.println("enter side 2");
    // double b= sc.nextDouble();
    // System.out.println("enter side 3");
    // double c= sc.nextDouble();

    // if (a+b>c) {

    // if (a+c>b) {

    // if (b+c>a) {

    // System.out.println("it is a triangle");

    // if (a==b && b==c) {
    // System.out.println("your triangle is:"+"equilateral");
    // }
    // else if (a==b || b==c || a==c) {
    // System.out.println("your triangle is:"+"isosceles");
    // }
    // else {
    // System.out.println("your triangle is:"+"scalene");
    // }

    // }
    // }

    // }
    // else {
    // System.out.println("it is not a triangle");
    // }

    // print a tringle side type || angle type

    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter Side 1");
    // int a = sc.nextInt();
    // System.out.println("enter side 2");
    // int b = sc.nextInt();
    // System.out.println("enter side 3");
    // int c = sc.nextInt();

    // boolean vaild=(a+b>c && b+c>a && a+c>b);
    // System.out.println(vaild? "it is a triangle ": "it is not a triangle");

    // String sideType=(a==b && a==c)? "equilateral": (a==b || b==c ||
    // a==c)?"isosecles": "scelene";
    // System.out.println(sideType);

    // int x=a*a;
    // int y=b*b;
    // int z=c*c;

    // String angleType=

    // (x+y==z || y+z==x || x+z==y)? "Angle type : right angle ":
    // (x+y<z || y+z<x ||x+z<y)? " Angle type :obtuse ":
    // "Angle type : acute angle";
    // System.out.println(angleType);

    // solve this through nested if else

    // if (a + b > c) {
    // if (b + c > a) {
    // if (a + c > b) {
    // System.out.println("it is a triangle");
    // if (a == b) {
    // if (a == c) {
    // System.out.println("it is an epuilateral triangle");
    // } else {
    // System.out.println("it is an isosecles triangle");
    // }
    // } else {
    // if (a == c) {
    // System.out.println("it is an isosceles triangle");
    // } else {
    // if (b == c) {
    // System.out.println("it ia an isosceles triangle");
    // } else {
    // System.out.println("it is an scalene triangle");
    // }
    // }
    // }
    // } else {
    // System.out.println("it is not a triangle");
    // }
    // } else {
    // System.out.println("it is not a triangle");
    // }
    // } else {
    // System.out.println("it is not a triangle");
    // }
    // }
    // }
    // print if any year is leap or not using nested if else

    // System.out.println(" enter year");
    // Scanner sc= new Scanner(System.in);
    // int year = sc.nextInt();

    // if (year % 4 == 0) {

    // if (year % 100 != 0) {
    // System.out.println("not leap year");
    // } else {
    // System.out.println("leap year");
    // }
    // } else {
    // if (year % 400 == 0) {
    // System.out.println("Leap Year");

    // } else {
    // System.out.println("not a leap year");

    // }

    // }

    // nested switch
    // System.out.println("enter your input");
    // Scanner sc= new Scanner(System.in);
    // String str= sc.nextLine();
    // switch (str) {
    // case "Admin":
    // System.out.println("given acces to admin ");
    // break;
    // case "user":
    // System.out.println("given acces to user ");
    // break;
    // case "SuperAdmin":
    // System.out.println("given acces to super admin ");
    // break;
    // case "Gust":
    // System.out.println("given acces to gust ");
    // break;
    // case "Dictore":
    // System.out.println("given acces to diector ");
    // break;

    // default:
    // System.out.println(" you are unknown person");
    // break;
    // }

    // Scanner sc=new Scanner(System.in);
    // System.out.println("enter side 1");
    // int a= sc.nextInt(); // a=b=c all side equal (equilateral)
    // //a==b,a==c,b==c any two side equal (isosceles)
    // // if all side do not equal (scalene)
    // System.out.println("enter side 2");
    // int b= sc.nextInt();
    // System.out.println("enter side 3");
    // int c= sc.nextInt();

    // if (a+b>c) {
    // if (b+c>a) {
    // if (a+c>b) {
    // System.out.println("it is an vaild triangle");
    // if (a==b) {
    // if (a==c) {
    // System.out.println("it is an equilateral triangle");
    // }else{
    // System.out.println("it is an isosceles triangle");
    // }
    // }else{
    // if (a==c) {

    // }else{
    // if (b==c) {
    // System.out.println("it is an isosceles triangle");
    // }else{
    // System.out.println("it is an scalene triangle");
    // }
    // }
    // }
    // }else{
    // System.out.println( "it is not a vaild triangle");
    // }
    // }else{
    // System.out.println("it is not a vaild triangle");
    // }
    // }else{
    // System.out.println("it is not a vaild triangle");
    // }

    // nested switch

    // String department="cs";
    // int year=1;
    // switch (department) {
    // case "cs":
    // switch (year) {
    // case 1:
    // System.out.println("1st year cs student ");
    // break;
    // case 2:
    // System.out.println("2st year cs student ");
    // break;
    // case 3:
    // System.out.println("3st year cs student ");
    // break;
    // case 4:
    // System.out.println("4st year cs student ");
    // break;
    // default:
    // System.out.println("enter a vaild year:cs");
    // break;
    // }

    // case "ai":
    // switch (year) {
    // case 1:
    // System.out.println("1st year cyber student");
    // break;
    // case 2:
    // System.out.println("2st year cyber student");
    // break;
    // case 3:
    // System.out.println("3st year cyber student");
    // break;
    // case 4:
    // System.out.println("4st year cyber student");
    // break;

    // default:
    // System.out.println("enter a vaild year:ai");
    // break;
    // }

    // case "cyber":
    // switch (year) {

    // case 1:
    // System.out.println("1st year cyber student");
    // break;
    // case 2:
    // System.out.println("2st year cyber student");
    // break;
    // case 3:
    // System.out.println("3st year cyber student");
    // break;
    // case 4:
    // System.out.println("4st year cyber student");
    // break;

    // default:
    // System.out.println("enter a vaild year:ai");
    // break;
    // }

    // case "dl":
    // switch (year) {

    // case 1:
    // System.out.println("1st year dl student");
    // break;
    // case 2:
    // System.out.println("2st year dl student");
    // break;
    // case 3:
    // System.out.println("3st year dl student");
    // break;
    // case 4:
    // System.out.println("4st year dl student");
    // break;

    // default:
    // System.out.println("enter a vaild year:dl");
    // break;
    // }

    // default:
    // System.out.println("enter a vaild department");
    // break;
    // }

    // new topic. loops date>2/06/26
    // 1. for loop

    // print hello word 100 times

    // for(int i=1; i<=100; i++){
    // System.out.println("hello world");
    // }

    // for(int i=1; i<=100; i++){
    // if (i%2==0) {
    // System.out.println(i+"hello world");
    // }else{
    // System.out.println(i+"java");
    // }
    // }
    // print 1 to 100
    // for(int i=1; i<=100;i++){
    // System.out.print(i + " ");
    // }
    // print only even number b/w 1 to 100
    // for(int i=1; i<=100; i++){
    // if (i%2==0) {
    // System.out.print(i + " ");
    // }
    // }

    // get all the number from 200 to 700
    // after dividing 5 remainder is 4 and afte dividing by
    // 7 remainder is 5

    // if all the number sum is even then print even else odd

    // for(int i=1;i<=100;i++ ){
    // if(i%2!=0){

    // }else{
    // System.out.println(i + " ");
    // }
    // }
    // }
    // }

    // print if else in all method

    // for(int i=1; i<=100; i++){
    // if ((i/2)*2==i) {
    // System.out.println(i + " ");
    // }
    // }
    // }
    // }

    // sum of natural numb
    // for(int i=1; i<=100; i++);
    // System.out.println(i);
    // }
    // }

    // get all the number from 200 to 700
    // after getting by 5 remainder is 4 and after dividing by
    // 7 remainder is 5

    // while loop

    // int i= 200;
    // while(i<=700){
    // if (i%5==4 && i%7==5) {
    // System.out.println(i +" ");
    // }else{
    // System.out.println(i + " ");
    // }
    // i++;
    // }
    // find all the numbers between 300 to 600 hundred
    // both not included which are divisble by 5 and remainder 4
    // and after divided by 9 remainder is 7 , count all such numbers
    // and find the count is even or odd

    // int i = 300;
    // int count = 0;
    // while (i < 600) {
    //   if (i % 5 == 4 && i % 9 == 7) {
    //     System.out.print(i + " ");
    //     count++;
    //   }
    //   i++;
    // }

    // System.out.println();
    // if (count % 2 == 0) {
    //   System.out.println("the count is: " + count + "it is even");
    // } else {
    //   System.out.println("the count is: " + count + "it is odd");
    // }

    //find all the numbers between 300 to 600 hundred 
// both not included which are divisble by 5 and remainder 4
//and after divided by 9 remainder is 7 , add all such numbers

//          int i=300;
//          int sum=0;

//          while (i<600) {
//           if (i%5==4 && i%9==7) {
//             System.out.println(i + " ");
//           }else{
//             System.out.println(i +" ");
//             sum=sum+i;
//           }
//               i++;
//          }
//              System.out.println("the sum is:" + sum);


     // print even number from 1 to 100

  //    int i=1;
  //    while (i<=100) {
  //     if (i%2==1) {
  //        i++;
  //       continue;
        
  //     }
  //        System.out.println(i + " ");
  //        i++;
  // }

  //Find all factors of 120
    for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");

            }

        }for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");



  int i=1;
  int num =120;
while (i<=num) {
  if (num%1==0) {
    System.out.println(i+ " ");
  }
  i++;
}
     int i=1;







//       int num=87654;
//       int evencount=0;
//       int oddcount=0;
//       int i=num;
//       int x=i%10;
//       while (i!=0) {
//         if (x%2==0) {
//           evencount++;
//         }else{
//           oddcount++;
//         }
//         i/=10;

//       }
           
//            System.out.println("the even count is:"+ num +"is :"+ evencount);
//             System.out.println("the odd count is:" +num +"is:"+ oddcount);  
}
}

          