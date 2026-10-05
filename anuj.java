public class anuj{
      public static void main(String[] args) {
          int n= 145;
      int temp=n;
      int sum=0;
      

      while (temp>0) {
      int lastdigit= temp%10;
      int fact=1;           
      for (int j = 1; j <=lastdigit; j++) {
      fact*=j;
      }
      sum+=fact;
      temp/=10;
      }


      if (sum==n) {
      System.out.println("it's a strong number");
      }else{
      System.out.println("not a strong number");
      }

      }
}



