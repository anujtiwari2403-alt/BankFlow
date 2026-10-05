public class recusion {
    // public static void printrecusion(int n, int i) {
    // if (i>n) {
    // return; // base class
    // }
    // System.out.print( i + " ");
    // printrecusion(n, i+1); // recursive case
    // }
    // public static void main(String[] args) {
    // int num=10;
    // int i=1;
    // printrecusion(num, i);

    // decreasing method

    // public static void printrecusion(int n, int i) {
    // if (i>n) {
    // return; // base class
    // }

    // printrecusion(n, i+1); // recursive case
    // System.out.print( i + " ");
    // }
    // public static void main(String[] args) {
    // int num=10;
    // int i=1;
    // printrecusion(num, i);
    // }
    // }

    // print 10 to 1

    // public static void printrecusion(int num) {
    // if (num==0) {
    // return; // base class
    // }

    // printrecusion(num-1); // recursive case
    // System.out.print( num + " ");
    // }
    // public static void main(String[] args) {
    // int num=10;

    // printrecusion(num);
    // }
    // }

    // print 10 to 1 without using any parameters

    // static int num=10;
    // public static void printrecusion() {

    // if (num==0) {
    // return; // base class
    // }
    // System.out.print( num + " ");
    // num--;
    // printrecusion(); // recursive case

    // }
    // public static void main(String[] args) {
    // int num=10;

    // printrecusion();
    // }

    // factorial of any number using recurion

    // public static int factorialrecurion( int num) {

    // if (num==0 || num==1) {
    // return 1; // base class
    // }else{
    // return num*factorialrecurion (num-1);
    // }
    // // recursive case

    // }
    // public static void main(String[] args) {
    // int num=5;

    // int result= factorialrecurion(num);
    // System.out.println("factorial of "+num +" is:"+result);
    // }

    // factorial of any number using recurion and using n+1
    // public static int factorialrecurion(int i, int num) {

    // if (i>num) {
    // return 1; // base class
    // }else{
    // return i*factorialrecurion (i+1, num);
    // }
    // // recursive case

    // }
    // public static void main(String[] args) {
    // int num=5;

    // int result= factorialrecurion(1,num);
    // System.out.println("factorial of "+num +" is:"+result);
    // }

    // second method

    // public static int factorialrecurion(int i, int num) {
    // if (i == num) {
    // return i; // base class
    // }
    // int result = i * factorialrecurion(i + 1, num);

    // // recursive case
    // return result;
    // }

    // public static void main(String[] args) {
    // int num = 5;

    // int result = factorialrecurion( 1, num);
    // System.out.println("factorial of " + num + " is:" + result);
    // }

    // topic. 'tail recurion'

    // public static int factorialrecurion(int i, int num, int ans) {
    // if (i > num) {
    // return ans; // base class
    // }
    // return factorialrecurion(i + 1, num, i * ans);

    // // recursive case

    // }

    // public static void main(String[] args) {
    // int num = 5;

    // int result = factorialrecurion(1, num, 1);
    // System.out.println("factorial of " + num + " is:" + result);
    // }

    // fibonacci number

    // public static int fibonacci(int f) {
    // if (f==0 || f==1) {
    // return f;
    // }
    // return fibonacci(f-1)+ fibonacci(f-2);
    // }
    // public static void main(String[] args) {
    // int f=8;

    // int result=fibonacci(f);
    // System.out.println("the fibonacci of" + f + "is:"+result);

    // }
    // }

    // count of any number
    // public static int count(int num) {
    // int lastdidgit = 0;
    // if (num == 0) {
    // return 0;
    // }

    // return 1 + count(num / 10);
    // }

    // public static void main(String[] args) {
    // int num = 5;

    // int result = count(num);
    // System.out.println(result);
    // }

    // count of any number using : tails recurion

    // public static int countDigits(int num , int count) {

    // if (num == 0) {
    // return count;
    // }
    // return countDigits(num / 10, count+1);

    // }
    // public static void main(String[] args) {
    // int num = 567;
    // int count=0;
    // int result = countDigits(num, count);
    // System.out.println(result);
    // }
    // }

    // print sum of the digit
    // public static int DigitSum(int num) {

    // if (num==0) {
    // return 0;
    // }
    // int lastdigit=num%10;

    // return lastdigit+DigitSum(num/10 );
    // }

    // public static void main(String[] args) {
    // int num=3456;

    // int result= DigitSum(num);
    // System.out.println(result);
    // }

    // }

    // print sum of the digits using: tail recurion

    // public static int DigitSum(int num, int sum) {

    // if (num==0) {
    // return sum;
    // }
    // int lastdigit=num%10;

    // return DigitSum(num/10,lastdigit+sum );
    // }

    // public static void main(String[] args) {
    // int num=3456;
    // int sum=0;

    // int result= DigitSum(num, sum);
    // System.out.println(result);
    // }

    // public static int DigitSum(int num) {

    // if (num == 0) {
    // return 0;
    // }
    // int lastdigit = num % 10;
    // if (lastdigit % 2 == 0) {
    // return lastdigit + DigitSum(num / 10);
    // } else {
    // return DigitSum(num / 10);
    // }

    // }

    // public static void main(String[] args) {
    // int num = 1234;

    // int result = DigitSum(num);
    // System.out.println(result);
    // }

    // using ternary operator

    // public static int DigitSum(int num) {

    // if (num == 0) {
    // return 0;
    // }
    // int lastdigit = num % 10;
    // // if (lastdigit % 2 == 0) {
    // // return lastdigit + DigitSum(num / 10);
    // // } else {
    // // return DigitSum(num / 10);
    // // }

    // = lastdidgit%10? lastdigit + DigitSum(num / 10): DigitSum(num / 10);

    // }

    // public static void main(String[] args) {
    // int num = 1234;

    // int result = DigitSum(num);
    // System.out.println(result);
    // }

    // reverse of a number
    // public static int Reversenumber(int num, int rev) {

    // if (num==0) {
    // return rev;
    // }
    // int lastdigit=num%10;

    // return Reversenumber(num/10,rev*10+lastdigit );
    // }

    // public static void main(String[] args) {
    // int num=3456;
    // int rev=0;

    // int result= Reversenumber(num, rev);
    // System.out.println(result);
    // }

    // print perfect number using recurion

    // public static int perfectnumber(int num, int i) {

    // if (i==num) {
    // return 0;
    // }
    // if (num%i==0) {
    // return i+perfectnumber(num, i+1);
    // }else{
    // return perfectnumber(num, i+1);
    // }

    // }

    // public static void main(String[] args) {
    // int num=28;

    // if( perfectnumber(num, 1)==num){
    // System.out.println("perfect number");
    // }else{
    // System.out.println("not a perfect number");
    // }

    // }

    // int n=1000;
    // int temp=n;
    // int sum=0;

    // while (temp>0) {
    // int lastdigit= temp%10;
    // int fact=1;
    // for (int i = 0; i <=lastdigit; i++) {
    // fact*=i;
    // }
    // sum+=fact;
    // temp/=10;
    // }
    // }
    // perfect number using recurion
    // public static int fact(int num) {
    // if (num == 0 || num == 1) {
    // return 1;
    // } else {
    // return num * fact(num - 1);
    // }
    // }

    // public static int sum(int num) {
    // if (num == 0) {
    // return 0;
    // }
    // int lastdigit = num % 10;

    // return fact(lastdigit) + sum(num / 10);

    // }

    // public static boolean isStrongnumber(int num) {
    // return sum(num) == num;
    // }

    // public static void main(String[] args) {
    // int num = 145;

    // if (isStrongnumber(num)) {
    // System.out.println("perfect number");
    // } else {
    // System.out.println("not a perfect number");
    // }

    // }

    // automorpic number using recurion

    // public static boolean isautomorpic(int num, int square) {

    // if (num == 0) {
    // return true;
    // }

    // if (num % 10 != square % 10) {
    // return false;

    // }
    // return isautomorpic(num / 10, square / 10);
    // }

    // public static void main(String[] args) {
    // int num = 25;
    // if (isautomorpic(num, num * num)) {
    // System.out.println("automorpic number");
    // } else {
    // System.out.println("not automorpic number");
    // }
    // }

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

    // find harshad number usin

    // public static int sumofdgits(int num, int sum) {
    //     if (num == 0) {
    //         return sum;
    //     }
    //     int lastDigit = num % 10;
    //     return sumofdgits(num / 10,sum+lastDigit);
    // }

    // public static boolean isharshad(int num,int sum) {
    //     return num % sumofdgits(num,sum) == 0;
    // }

    // public static void main(String[] args) {
    //     int num = 18;
    //     int sum = 0;
    //     if (isharshad(num, sum)) {
    //         System.out.println("harshad number");
    //     } else {
    //         System.out.println("not a harshad number");
    //     }

    // }
      

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

// spy number
public static int sumofdgits(int num, int sum) {
        if (num == 0) {
            return sum;
        }
        int lastDigit = num % 10;
        return sumofdgits(num / 10,sum+lastDigit);
    }
public static int product(int num, int product) {
    if (num==0) {
        return 0;
    }
    return product(num/10, product*(num%10));
}
public static void main(String[] args) {
    int num=123;
    int sum=0;
    int result=product(num, 1);
    if (sum==result) {
        System.out.println("Spy number");
    }else{
        System.out.println("Not a Spy number");
    }
}
}