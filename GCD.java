// public class GCD {
//     static int gcd(int n1,int n2){
//         if(n2==0)
//             return n1;
//         return gcd(n2,n1%n2);     //if second no. is zero then the first no. is the gcd
//     }
//     public static void main(String[] args) {
//         System.out.println(gcd(12,18));
//     }
// }



//count the no. of 0's in a digit
public class GCD{
    static int count(long n){
        if(n==0)
            return 0;
        if(n%10==0){
            return 1+count(n/10);
        }
        else
            return count(n/10);
     }
    public static void main(String[] args) {
        int n=1200004456;
        System.out.println(count(n));
    }
}