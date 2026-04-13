import java.util.Scanner;
public class recurrsion {
    //x^n
    /*static int power(int x,int n){
        if(n==0)
            return 1;
        return x*power(x,n-1);

    }
    public static void main(String[] args) {
        System.out.println(power(2,5));
    }*/

    //reverse a no.
    /*static int reverse(int n,int rev){
        if(n==0)
            return rev;
        return reverse(n/10,rev*10+n%10); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n,0));

    }*/

    
    //sum of digit
    /*static int sum(int n,int s){
        if(n==0)
            return s;
        return sum(n/10,s+n%10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sum(num,0));
    }*/

    //count of digits
    static int counts(int n){
        if(n==0)
            return 0;
        return 1+ counts(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(counts(num));
    }
}



