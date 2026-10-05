import java.util.Scanner;
public class EVM {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
int a = 0, b = 0, c = 0;
int choice;
do {
System.out.println("/n================================== ");
System.err.println(" ELECTRONIC VOTING MACHINE");
System.out.println("/n====================================");
System.out.println("1. candidate A (bjp). 'shree narendra modi'");
System.out.println("2. candidate B (inc). abhisek ghandi");
System.out.println("3. candidate C (AAP). kejriwal");
System.out.println("4. result");
System.out.println("5. exit");
System.out.println("please enter your choice");
choice = sc.nextInt();

switch (choice) {
case 1:
a++;
System.out.println("your vote given to the candidate A. (modi jii)");
break;

case 2:
b++;
System.out.println("your vote given to the candidate B. (modi jii)");
break;

case 3:
c++;
System.out.println("your vote given to the candidate C. (modi jii)");
break;
case 4:
System.out.print("Password de gawaar: ");
String pass = sc.next();

if (pass.equals("1234")) {
System.out.println("Access Granted");
System.err.println("/n=====result=====");
System.out.println("candidate A (bjp):" + a);
System.out.println("candidate B (bjp):" + b);
System.out.println("candidate C (bjp):" + c);
if (a > b && a > c) {
   System.out.println("Winner is candidate A (bJp)");
} else {
   if (b>a && b>c) {
    System.out.println("Winer is candidate A (bjp)");
   }else{
    if (c>a && c>b) {
        System.out.println("Winer is candidate A (bjp)");
    }else{
        System.out.println("tie");
    }
   }
}
}else{
    System.out.println("sahi password de gawaar");
}

break;

case 5:
System.out.println("thankyou for voting modi jii!");
break;

default:
System.out.println("invaild choice");
break;
}

} while (choice != 5);
sc.close();

}
}




