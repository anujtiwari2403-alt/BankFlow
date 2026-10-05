
// int y = 98; // Instance variable
// boolean bo = false;
// static String str = " Anuj"; // static variable

// public static void main(String[] args) {
// OOP obj = new OOP(); // object creation
// int i = 67; // Locale variable
// System.out.println(i);
// System.out.println(obj.y);
// System.out.println(str);
// System.out.println(obj.bo);
// }

// byte b;
// short s;
// long l;
// int i;
// float f;
// double d;
// char ch;
// boolean bo;
// Integer i1;
// Character ch1;
// String str;

// public static void main(String[] args) {
// OOP obj = new OOP();

// System.out.println("Default value is :" + obj.b);
// System.out.println("Default value is :" + obj.s);
// System.out.println("Default value is :" + obj.i);
// System.out.println("Default value is :" + obj.l);
// System.out.println("Default value is :" + obj.f);
// System.out.println("Default value is :" + obj.d);
// System.out.println("Default value is :" + obj.ch);
// System.out.println("Default value is :" + obj.i1);
// System.out.println("Default value is :" + obj.ch1);
// System.out.println("Default value is :"+ obj.str);
// System.out.println("Default value is :"+ obj.bo);

// }

// byte b= 78;
// short s= 87;
// long l= 56;
// int i=678;
// float f= 78.9f;
// double d=6787.09;
// char ch= 'A';
// boolean bo= true;
// Integer i1=89;
// Character ch1= 'S';
// String str = " Anuj";

// public static void main(String[] args) {
// OOP obj = new OOP();

// System.out.println("Default value is :" + obj.b);
// System.out.println("Default value is :" + obj.s);
// System.out.println("Default value is :" + obj.i);
// System.out.println("Default value is :" + obj.l);
// System.out.println("Default value is :" + obj.f);
// System.out.println("Default value is :" + obj.d);
// System.out.println("Default value is :" + obj.ch);
// System.out.println("Default value is :" + obj.i1);
// System.out.println("Default value is :" + obj.ch1);
// System.out.println("Default value is :"+ obj.str);
// System.out.println("Default value is :"+ obj.bo);

// print area of rectangle // bekar tarika

// int length=89;
// int breadth=90;

// public int areaRectangle() {
// int area = length * breadth;
// return area;
// }

// public static void main(String[] args) {
// OOP obj= new OOP();
// int result= obj.areaRectangle();
// System.out.println(result);
// }

// area of rectangle : passing through reference (accha tarika)

// int length;
// int breadth;

// public int areaRectangle() {
// int area = length * breadth;
// return area;
// }

// public static void main(String[] args) {
// OOP obj = new OOP();
// obj.length = 89;
// obj.breadth = 100;
// int result = obj.areaRectangle();
// System.out.println(result);
// }

// area of rectangle : passing through method (bekaar tarika)

// public int areaRectangle(int length, int breadth) {
// int area = length * breadth;
// return area;
// }

// public static void main(String[] args) {
// OOP obj = new OOP();
// int length = 89;
// int breadth = 100;
// int result = obj.areaRectangle(length, breadth);
// System.out.println(result);
// }

// area of rectangle : passing through method
// int length;
// int breadth;
// public void initilization(int length1 , int breadth1) {
// length=length1;
// breadth=breadth1;
// }
// public int areaRectangle(int length, int breadth) {
// int area = length * breadth;
// return area;
// }
// public void display() {
// int result = areaRectangle(length , breadth);
// System.out.println("the area of Rectangle is:"+result);
// }
// public static void main(String[] args) {
// OOP obj = new OOP();
// int length = 89;
// int breadth = 100;
// obj.initilization(length, breadth);
// obj.display();
// }

// using "this" keyword

// int length;
// int breadth;

// public void initilization(int length, int breadth) {
// this.length = length;
// this.breadth = breadth;
// }

// public int areaRectangle(int length, int breadth) {
// int area = length * breadth;
// return area;
// }

// public void display() {
// int result = areaRectangle(length, breadth);
// System.out.println("the area of Rectangle is:" + result);
// }

// public static void main(String[] args) {
// OOP obj = new OOP();
// int length = 89;
// int breadth = 100;
// obj.initilization(length, breadth);
// obj.display();
// }
// defalut constructor
// int roll;

// public static void main(String[] args) {
// OOP obj = new OOP();
// System.out.println(obj.roll);

// }

// No arrugement constructor

// int roll;

// OOP() {
// System.out.println("Constructor got called");
// roll = 89;

// }

// public static void main(String[] args) {
// OOP obj = new OOP();
// System.out.println(obj.roll);

// }

// parametried constructor
// int length;
// int breadth;
// int hieght;

// OOP(int length, int breadth, int hieght) {
// this.length = length;
// this.breadth = breadth;
// this.hieght = hieght;
// }

// public void Area() {
// int area = length * breadth;
// System.out.println("Area is:" + area);
// }

// public void parameter() {
// int parimeter = 2 * (length + breadth);
// System.out.println("parameter is :" + parimeter);
// }

// public void volume() {
// int volume = length * breadth * hieght;
// System.out.println("volume is :" + volume);
// }

// public static void main(String[] args) {
// OOP obj = new OOP(67, 56, 78);
// obj.Area();
// obj.parameter();
// obj.volume();
// }

// topic.... name
// Constructor overloading

// int rollNo;
// String name;

// OOP() {
// rollNo = 0;
// name = "Unknown";

// }

// OOP(int rollNo) {
// this.rollNo = rollNo;
// name = "anuj";

// }

// OOP(String name) {
// this.name = name;
// rollNo = 7;

// }

// OOP(int rollNO, String name) {
// this.rollNo = rollNO;
// this.name = name;

// }

// OOP(String name, int rollNo) {
// this.name = name;
// this.rollNo = rollNo;

// }

// public void display() {
// System.out.println("Roll no is :" + rollNo);
// System.out.println("Name is :" + name);
// }

// public static void main(String[] args) {
// OOP obj = new OOP();
// obj.display();

// OOP obj1 = new OOP(21);
// obj1.display();

// OOP obj2 = new OOP("dhoni");
// obj2.display();

// OOP obj3 = new OOP(18, "virat");
// obj3.display();

// OOP obj4 = new OOP("rohit", 45);
// obj4.display();

// }

// copy constructor

// int rollNo;
// String name;

// OOP(int rollNo, String name) {
// this.rollNo = rollNo;
// this.name = name;

// }

// OOP(OOP original) {
// this.rollNo = original.rollNo;
// this.name = original.name;

// }

// public void display() {
// System.out.println("Roll No is : " + rollNo);
// System.out.println("Name is : " + name);
// }

// public static void main(String[] args) {
// OOP obj = new OOP(10, "Sangita");
// obj.display();

// OOP obj1 = new OOP(obj);
// obj1.display();

// }

// constructor vs Static

// int rollNo;
// String name;

// OOP() {
// System.out.println("the constructor got called");
// }

// static {
// System.out.println("this runs at very first and run only once ");
// }

// public static void main(String[] args) {
// OOP obj = new OOP();
// OOP obj1 = new OOP();
// OOP obj2 = new OOP();
// OOP obj3 = new OOP();
// OOP obj4 = new OOP();
// OOP obj5 = new OOP();

// }

// static keyword

// int count = 0;

// OOP() {
// count++;
// System.out.println(count);
// }

// public static void main(String[] args) {
// OOP obj = new OOP();
// OOP obj1 = new OOP();
// OOP obj2 = new OOP();
// OOP obj3 = new OOP();
// OOP obj4 = new OOP();
// }

// using static.....

// static int count = 0;

// OOP() {
// count++;
// System.out.println(count);
// }

// public static void main(String[] args) {
// OOP obj = new OOP();
// OOP obj1 = new OOP();
// OOP obj2 = new OOP();
// OOP obj3 = new OOP();
// OOP obj4 = new OOP();
// }
//date 1/08/26
// Single inheritance
// parent class
//  date ... 05/08/26
// abstract and concrete class
// abstract class Animal {

//     abstract void sound();// abstract method

//     private void breathe() { // concrete method 
//         System.out.println("Breathing");
//     }

//     public void callBreathe() {
//         breathe();
//     }
// }

// class dog extends Animal {
//     void sound() {
//         System.out.println("BHow BHow");
//     }

//     void eatFunction() {
//         System.out.println("Eating");
//     }
// }

// public class OOP {
//     public static void main(String[] args) {
//         dog d = new dog();
//         d.sound();
//         d.callBreathe();
//     }
// }

// topic....." Interface"

/**
 * OOP
 */
// interface OOP {
//     public final static int MAX_SPEED = 100;

//     void fly();
// }

// class Drone implements OOP {
//     public void fly() {
//         System.out.println("Flying");
//     }
// }

// public class InnerOOP {
//     public static void main(String[] args) {
//         Drone d = new Drone();
//         d.fly();
//     }
// }

interface OOP {

   public final static int MAX_SPEED=100;
   //MAX_SPEED=89;//it is final you can not change the value
    void fly();

    
}
class Drone implements OOP{
    public void fly(){
        System.out.println("Flying");
    }

}

interface Vehicle{
    //default Method (it can be Overridden)
    default void start(){
        System.out.println("Car Starting ");
        interior();
    }
    //static method (belongs to the interface)
    static void stop(){
        System.out.println("Vehicle Stopping ");
    }
    //private Method:can be accessed within the interface
    private void interior(){
        System.out.println("Interior is White Color");

    }

}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car Starting ");
    }
}

public class InnerOOP {
    public static void main(String[] args) {
        Drone d=new Drone();
        d.fly();

        Car c= new Car();
        c.start();

        Vehicle.stop();
         
        
    }

        
}
