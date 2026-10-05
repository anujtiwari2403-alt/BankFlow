
public class method {

  // public static void printHelloword(){
  // System.out.println("hello world1");
  // }
  // public static void main(String[] args) {
  // printHelloword();

  // System.out.println("hello world2");

  // method with parameters

  // fist method
  // public static void printHelloword(){
  // System.out.println("hello world1");
  // }

  // public static void calculatesum() {

  // int a=5;
  // int b=7;
  // int sum=a+b;
  // System.out.println("the sum is:"+sum);
  // }
  // public static void main(String[] args) {
  // calculatesum();

  // second method
  // public static void printHelloword(){
  // System.out.println("hello world1");
  // }

  // public static void calculatesum(int a, int b) {
  // int sum=a+b;

  // System.out.println("the sum is:"+sum);
  // }
  // public static void main(String[] args) {
  // int a=7;
  // int b=9;
  // calculatesum(a,b);

  // third method
  // public static int printHelloword(){
  // System.out.println("hello world1");
  // System.out.println("hello world2");
  // System.out.println("hello world3");
  // return 3;
  // }
  // public static int calculatesum(int a, int b) {// ye jo hamne yha int a, b use
  // kiya
  // int sum=a+b;
  // return sum; // inhe parameters ya formal paramertes kahte hai inhe ham
  // pas defenations batane ke liye use karte hai
  // }
  // public static void main(String[] args) {
  // int a=7;
  // int b=9;
  // int sum= calculatesum(a,b);// inhe arguments ya actual arguments kahte hai
  // inhe methods call ke sath hi use karte hai
  // System.out.println("the sum is:"+sum);

  // square if a number by method: return type void; no parameters

  // public static void calculatesquare() {

  // int a=7;
  // int square=a*a;
  // System.out.println("the square is:"+square);

  // }
  // public static void main(String[] args) {

  // calculatesquare();

  // square if a number by method: return type void; 1 parameters

  // public static void calculatesquare(int a) {

  //
  // int square=a*a;
  // System.out.println("the square is:"+square);

  // }
  // public static void main(String[] args) {
  // int a=7;

  // calculatesquare(a);

  // square if a number by method: return type void; 2 parameters

  // public static void calculatesquare( int num, int square) {

  // square=num*num;
  // System.out.println("the square is:"+square);

  // }
  // public static void main(String[] args) {
  // int num=7;
  // int square=0;
  // calculatesquare(num , square );

  // square if a number by method: return type int; parameters

  // print largest b/w 4 number
  // public static int largest(int a, int b, int c, int d) {
  // int largest =(a>b)? (a>c)? ((a>d) ? a:d) : ((c>d)? c:d) :(b>c)?((b>d)? b:d) :
  // (c>d)? c:d;
  // return largest;
  // }
  // public static void main(String[] args) {
  // int a= 5;
  // int b=4;
  // int c=3;
  // int d=2;

  // int result= largest(a, b, c, d);

  // System.out.println("largest number is :"+result);
  // }

  // }
  // public class Main {

  // public static void armstrongNumber(int num, int count, int sum) {
  // while (num != 0) {
  // count++;
  // num /= 10;
  // }
  // while (num != 0) {
  // int lastDigit = num % 10;
  // sum += Math.pow(lastDigit, count);
  // num /= 10;
  // }
  // if (sum == num) {
  // System.out.println("Armstrong Number");
  // } else {
  // System.out.println("Not Armstrong Number");
  // }

  // }

  // public static void main(String[] args) {
  // int num = 153;
  // int count = 0;
  // int sum = 0;
  // armstrongNumber(num, count, sum);

  // }
  // }
  // }
  // correct code
  // public static void armstrongNumber(int num, int count, int sum ) {
  // int orignal=num;
  // int temp =num;
  // while (temp != 0) {
  // count++;
  // temp /= 10;

  // }
  // temp=orignal;
  // while (temp != 0) {
  // int lastDigit = temp % 10;
  // sum = sum + (int)Math.pow(lastDigit, count);
  // temp /= 10;

  // }
  // if (sum == orignal) {
  // System.out.println("Armstrong Number");
  // } else {
  // System.out.println("Not Armstrong Number");
  // }

  // }

  // second method of finding armstrong number

  // public static int armstrongNumber(int num, int count, int sum ) {
  // int temp=num;
  // while (temp != 0) {
  // count++;
  // temp /= 10;

  // }

  // while (temp != 0) {
  // int lastDigit = temp % 10;
  // sum = sum + (int)Math.pow(lastDigit, count);
  // temp /= 10;

  // } return sum;

  // }

  // public static void main(String[] args) {
  // int num = 370;
  // int count=0;
  // int sum=0;

  // int result= armstrongNumber(num , count , sum);
  // if (num ==result ) {
  // System.out.println("Armstrong Number");
  // } else {
  // System.out.println("Not Armstrong Number");
  // }

  // }

  // }

  // }
  // public static void main(String[] args) {
  // int n=155;
  // int count=0;
  // int sum=0;
  // Armstrong(n, sum, count);

  // }
  // }
  // find product of a & b using methods
  // public static int multiply(int a, int b ) {
  // int product=a*b;
  // return product;
  // }
  // public static void main(String[] args) {
  // int a=8;
  // int b=7;

  // int result =multiply(a, b );
  // System.out.println("the product of a*b is:"+result);

  // int res= multiply(30, 9);
  // System.out.println("the product of a*b is:"+res);
  // }
  // }

  // call method
  // public static void Change(int a , int b) {
  // a=b;
  // b=a;
  // }
  // public static void main(String[] args) {
  // int a=5;
  // int b=10;
  // Change(a, b);
  // System.out.println("a :"+a);
  // System.out.println("b :"+b);
  // }
  // }

  // public static void armstrongNumber(int num, int count, int sum ) {
  // int orignal=num;
  // int temp =num;
  // while (temp != 0) {
  // count++;
  // temp /= 10;

  // }
  // temp=orignal;
  // while (temp != 0) {
  // int lastDigit = temp % 10;
  // sum = sum + (int)Math.pow(lastDigit, count);
  // temp /= 10;

  // }
  // if (sum == orignal) {
  // System.out.println("Armstrong Number");
  // } else {
  // System.out.println("Not Armstrong Number");
  // }

  // }

  // public static void main(String[] args) {
  // int num = 379;
  // int count=0;
  // int sum=0;

  // armstrongNumber(num , count , sum);

  // }
  // }

  // public static int armstrongNumber(int num, int count, int sum) {
  // int temp = num;
  // while (temp != 0) {
  // count++;
  // temp /= 10;
  // }
  // temp = num;
  // while (temp != 0) {
  // int lastDigit = temp % 10;
  // sum += Math.pow(lastDigit, count);
  // temp /= 10;
  // }

  // return sum;

  // }

  // public static void main(String[] args) {
  // int num = 153;
  // int count = 0;
  // int sum = 0;
  // int result = armstrongNumber(num, count, sum);
  // if (result == num) {
  // System.out.println("Armstrong Number");
  // } else {
  // System.out.println("Not Armstrong Number");
  // }

  // }
  // }
  // print disarium number using method
  // public static int disarium(int n, int count, int sum) {
  // int temp = n;
  // while (temp != 0) {
  // count++;
  // temp /= 10;
  // }
  // temp = n;
  // while (temp != 0) {
  // int lastdigit = temp % 10;
  // sum += Math.pow(lastdigit, count);
  // count--;
  // temp /= 10;
  // }
  // return sum;

  // }

  // public static void main(String[] args) {
  // int n = 89;

  // int count = 0;
  // int sum = 0;

  // int result = disarium(n, count, sum);

  // if (result == n) {
  // System.out.println("disarium number");
  // } else {
  // System.out.println("not a disarium number");
  // }

  // }
  // }
  // first method
  // print strong number

  // public static int fact(int n ) {
  // int temp=n;
  // int lastdigit = temp % 10;
  // int fact = 1;
  // for (int j = 1; j <= lastdigit; j++) {
  // fact *= j;

  // }
  // return fact;
  // }
  // public static int Strong(int n, int sum) {

  // while (n > 0) {
  // int fact=fact ( n);
  // sum += fact;
  // n /= 10;
  // }

  // return sum;

  // }

  // public static void main(String[] args) {
  // int n = 145;

  // int sum = 0;

  // int result = Strong(n, sum);
  // if (n == result) {
  // System.out.println("it's a strong number");
  // } else {
  // System.out.println("not a strong number");
  // }

  // }
  // }

  // third method

  // public static int fact(int n ) {
  // int temp=n;
  // int lastdigit = temp % 10;
  // int fact = 1;
  // for (int j = 1; j <= lastdigit; j++) {
  // fact *= j;

  // }
  // return fact;
  // }
  // public static int Strong(int n, int sum) {

  // while (n > 0) {
  // int fact=fact ( n);
  // sum += fact;
  // n /= 10;
  // }

  // return sum;

  // }

  // public static boolean isStrong(int n, int sum) {
  // int result=Strong(n, sum);

  // if (n == result) {
  // return true;
  // } else {
  // return false;
  // }
  // }

  // public static void main(String[] args) {
  // int n = 149;

  // int sum = 0;

  // int result = Strong(n, sum);
  // if (isStrong(n, sum)) {
  // System.out.println("strong number");
  // }else{
  // System.err.println("not a strong number");
  // }
  // }
  // }

  // forth method (standerd from)
  // public static int fact(int n ) {
  // int temp=n;
  // int lastdigit = temp % 10;
  // int fact = 1;
  // for (int j = 1; j <= lastdigit; j++) {
  // fact *= j;

  // }
  // return fact;
  // }
  // public static int Strong(int n, int sum) {

  // while (n > 0) {
  // int fact=fact ( n);
  // sum += fact;
  // n /= 10;
  // }

  // return sum;

  // }

  // public static boolean isStrong(int n, int sum) {
  // int result=Strong(n, sum);

  // boolean check=(n==result)? true:false;
  // return check;

  // }

  // public static void main(String[] args) {
  // int n = 145;

  // int sum = 0;

  // int result = Strong(n, sum);
  // if (isStrong(n, sum)) {
  // System.out.println("strong number");
  // }else{
  // System.err.println("not a strong number");
  // }
  // }
  // }

  // check if any number is harshad or not using method
  // public static int Harshadnumber(int num, int sum) {
  // int temp=num;
  // while (temp>0) {
  // int digit= temp%10;
  // sum+=digit;
  // temp/=10;
  // }
  // return sum;
  // }
  // public static void main(String[] args) {

  // int num=150;

  // int sum=0;

  // int result = Harshadnumber(num, sum);

  // if (num%result==0) {
  // System.out.println("harshad number");
  // }else{
  // System.out.println("not a harshad number");
  // }
  // }
  // }

  // second method

  // public static int Harshadnumber(int num, int sum) {
  // int temp = num;
  // while (temp > 0) {
  // int digit = temp % 10;
  // sum += digit;
  // temp /= 10;
  // }
  // return sum;
  // }

  // public static boolean isHarshad(int num, int sum) {
  // int result = Harshadnumber(num, sum);
  // boolean check = (num % result == 0) ? true : false;
  // return check;
  // }

  // public static void main(String[] args) {

  // int num = 1729;

  // int sum = 0;

  // int result = Harshadnumber(num, sum);
  // if (isHarshad(num, sum)) {
  // System.out.println("harshad number");
  // } else {
  // System.out.println("not a harshad number");
  // }

  // }
  // }

  // more shortest method
  // public static int Harshadnumber(int num, int sum) {
  // int temp = num;
  // while (temp > 0) {
  // int digit = temp % 10;
  // sum += digit;
  // temp /= 10;
  // }
  // return sum;
  // }

  // public static boolean isHarshad(int num, int sum) {
  // int result = Harshadnumber(num, sum);

  // return num%result==0;
  // }

  // public static void main(String[] args) {

  // int num = 1724;

  // int sum = 0;

  // int result = Harshadnumber(num, sum);
  // if (isHarshad(num, sum)) {
  // System.out.println("harshad number");
  // } else {
  // System.out.println("not a harshad number");
  // }

  // }
  // }

  // Automorpic number

  // public static boolean Automorpic(int num, int square) {

  // boolean isAutomorpic=true;
  // while (num>0) {
  // if (num%10!=square%10) { //
  // isAutomorpic=false;

  // }
  // num/=10;
  // square/=10;

  // }
  // return true;
  // }
  // public static void main(String[] args) {
  // int num=90;
  // int square=num*num;//625
  // boolean result=Automorpic(num, square);
  // if (result) {
  // System.out.println(" automorpic number");
  // }else{
  // System.out.println(" not a automorpic number");
  // }
  // }

  // neon number
  // public static int neonnumber(int num, int sum, int square) {
  // int temp=num;
  // while (square!=0) {
  // int lastdigit=square%10;//81%10=1
  // sum+=lastdigit;
  // square/=10;
  // }
  // return sum;
  // }
  // public static void main(String[] args) {
  // int num=8; // 9
  // //9
  // int square=num*num;// 81
  // int sum=0;

  // int result= neonnumber(num, sum, square);

  // if (num==result) {
  // System.out.println("it is a neon number");
  // }else {
  // System.out.println("not a neon number ");
  // }
  // }
  // }
  // spy number using 4 methods

  // public static int getsum(int num) {
  // int sum = 0;
  // while (num != 0) {
  // int rem = num % 10;
  // sum = sum + rem;

  // num /= 10;
  // }
  // return sum;
  // }

  // public static int product(int num) {
  // int product = 1;
  // while (num != 0) {

  // product *= num % 10;
  // num /= 10;
  // }
  // return product;
  // }

  // public static boolean isSpy(int num) {
  // int sum = getsum(num);
  // int product = product(num);
  // return sum == product;
  // }

  // public static void main(String[] args) {
  // int num = 123;
  // if (isSpy(num)) {
  // System.out.println("spy number");
  // } else {
  // System.out.println("not a spy number");
  // }

  // }
  // }

  public static int Harshadnumber(int num, int sum) {
  int temp = num;
  while (temp > 0) {
  int digit = temp % 10;
  sum += digit;
  temp /= 10;
  }
  return sum;
  }

  public static boolean isHarshad(int num, int sum) {
  int result = Harshadnumber(num, sum);
  boolean check = (num % result == 0) ? true : false;
  return check;
  }

  public static void main(String[] args) {

  int num = 18;

  int sum = 0;

  boolean result=isHarshad(num, sum);
  if (result) {
  System.out.println("harshad number");
  } else {
  System.out.println("not a harshad number");
  }

  }
}

//   public static int getsum(int num) {
//     int sum = 0;
//     while (num != 0) {
//       int rem = num % 10;
//       sum = sum + rem;

//       num /= 10;
//     }
//     return sum;
//   }

//   public static int product(int num) {
//     int product = 1;
//     while (num != 0) {

//       product *= num % 10;
//       num /= 10;
//     }
//     return product;
//   }

//   public static boolean isSpy(int num) {
//     int sum = getsum(num);
//     int product = product(num);
//     return sum == product;
//   }

//   public static void main(String[] args) {
//     int num = 123;
//     if (isSpy(num)) {
//       System.out.println("spy number");
//     } else {
//       System.out.println("not a spy number");
//     }

//   }
// }


