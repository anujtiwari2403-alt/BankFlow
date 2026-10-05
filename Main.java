public class Main {
    public static void main(String[] args) {
        int x=234;
        int p=x%10;
        x/=10;
        int q=x%10;
        x/=10;
        int r=x%10;
        
        System.out.println(p);
        System.out.println(p+q+r);
        

    }
}
