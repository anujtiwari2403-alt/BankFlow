public class codingthinker {
    public static void main(String[] args) {
        // arithmatic opreator
        int x = 10;
        int y = 3;
        int z = 10;
        System.out.println("Addition is : " + (x + y));
        System.out.println("Substraction is : " + (x - y));
        System.out.println("Multiplication is : " + (x * y));
        System.out.println("Division is : " + (x / y));
        System.out.println("Modulo is : " + (x % y));

        // Relational opreator
        System.out.println("Is x and y ? (x==y)" + (x == y));
        System.out.println("Is x and y ? (x!=y)" + (x != y));
        System.out.println("Is x and y ? (x>=y)" + (x >= y));
        System.out.println("Is x and y ? (x<=y)" + (x <= y));
        System.out.println("Is x and y ? (x>y)" + (x > y));
        System.out.println("Is x and y ? (x<y)" + (x > y));
        System.out.println("Is x and z ? (x==y)" + (x == y));
        System.out.println("Is x and z ? (x!=y)" + (x != y));
        System.out.println("Is x and z ? (x<=y)" + (x <= y));
        System.out.println("Is x and z ? (x>=y)" + (x >= y));
        System.out.println("Is x and z ? (x<y)" + (x < y));
        System.out.println("Is x and z ? (x>y)" + (x > y));

        // logical opreator

        boolean p = true;
        boolean q = false;
        boolean r = true;
        System.out.println("logical && between p and q (p&&q):" + (p && q));
        System.out.println("logical && between p and r (p&&r):" + (p && r));
        System.out.println("logical && between p and q (p||q):" + (p || q));
        System.out.println("logical && between p and r (p||r):" + (p || r));
        System.out.println("logical &  (!p)" + (!p));
        System.out.println("logical & (!!!!!!!!!!!p):" + (!!!!!!!!!!!!p));
        System.out.println("logical & (!!!!!!!!!!!q):" + (!!!!!!!!!!!q));
        System.out.println("logical && between p and q !(!!!!!!!p&& !q):" + !(!!!!!!!p && !q));
        System.out.println("logical && between p and q !(!!!!!!!p && !!!!!!!!!!q):" + !(!!!!!!!p && !!!!!!!!!!q));
        System.out.println("logical && between p and q !!!(!!!!!!!p || !!!!!!!!!!q):" + !!!(!!!!!!!p || !!!!!!!!!!q));
        System.out.println(
                "logical && between p and q !!!(!!!!!!!p || !!!!!!!!!!q && !q):" + !!!(!!!!!!!p || !!!!!!!!!q && !q));

        // unary oprator
        System.out.println("Unary Operator: ");
        int x6 = 7;
        System.out.println(x6);// 7
        System.out.println(x6++);// 7
        System.out.println(x6);// 8
        System.out.println(++x6);// 9
        System.out.println(x6);// 9
        System.out.println(x6--);// 9
        System.out.println(x6);// 8
        System.out.println(--x6);// 7
        System.out.println(x6);// 7

        int x7 = 10;
        int y7 = 20;
        System.out.println(x7++ + x7++); //21 x=12
        System.out.println(++x7 + x7++); //26 x=14,y=20
        System.out.println(y7++ + --x7);  //33 x=13,y=21
        System.out.println(x7++ + --x7);  //26 x=13,y=21
        System.out.println(y7++ + y7++);  //43 x=13,y=23
        System.out.println(--x7 + x7++ + x7--);//37 x=12,y=23
        System.out.println(++x7 + x7-- + y7++); //49 x=12,y=24
        System.out.println(x7++ + x7++); //25 x=14,y=24
        System.out.println(y7++ + y7++); //49 x=14; y=26
        System.out.println(x7);
        System.out.println(y7);
        // type casting
        // implicit typecasting
        byte b = 65;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);



        //explicit type casting
    double d9= 130.87645678956789;
        float f1=(float)d9;
        long l1= (long)f1;
        int i1= (int)l1;
        short s1=(short)i1;
        char c1=(char)s1;
        byte b1=(byte)c1;
System.out.println("double is:"+d9);
System.out.println("float f1=(float)d9:"+ f1);
System.out.println("long l1=(long)f1:"+l1);
System.out.println("int i1=(int)l1:"+i1);
System.out.println("short s1=(short)i1:"+s1);
System.out.println("char c1=(char)s1:"+c1);
System.out.println("byte b1= (byte)c1"+b1);

        //optical number question

int m= 67;
System.out.println(m);
        int m1 = 067777777;
        System.out.println(m1);

// question
        int x9=10;   //x+1 can be oprate
        x=35;
        System.out.println(x+1);
        System.out.println(x); 

        //number system
        int x8=2_345_67_568;
        System.out.println(x8);

        // x=x+1 can be tested

        System.out.println(x=x+1);
        System.out.println(x);

        byte x0=10;
        x= 35;
        x+=1;
       // x= (byte) (x+1);
        System.out.println( (x+=1));
         
        float f0= 80;
        f= 60;
        f+=1;//61
        f= f+1;//62
        System.out.println(f+1);//63         //x+1
                                             //x=x+1
                                             //x+=1
                                             //x++   (no replacement)
        System.err.println(f+=1);//63





        short l9=788;
        l= 999;
        l= l+1;
        System.out.println(l=l+1);    


        long l0=6777;
        l= 7999;
        l=l+1;//8000
        l++;  //8001
        l+=1;  //8002
System.out.println(l+1);//8003
System.out.println(l=l+1);//8003
System.out.println(l++);  //8003 kyu ki princriment lga hai isliye value baad me 8004 ho jayegi
System.out.println(l+=1);//8005 kyu ki 8004+1=8005


double d0=1374.34567;
d=2345.34; 
d=d+1;     //2346.34
d++;       //2347.34
d+=1;      //2348.34
System.out.println(d+1); //2349.34
System.out.println(d=d+1);//2349.34
System.out.println(d++);  //2349.34
System.out.println(d+=1);  //2351.34



    }

}
