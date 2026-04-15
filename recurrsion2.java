// public class recurrsion2 {
//     //fibonacci series
//     static int fibo(int n){
//         if (n==0) 
//             return 0;
//         if(n==1)
//             return 1;
//         return fibo(n-1)+fibo(n-2);

//     }
//     public static void main(String[] args){
//          System.out.print(fibo(10));
//     }
// }



//substring using double recursion
// public class recurrsion2{
//     static void printSubString(String p,String up){
//         //base case
//         if(up.isEmpty()){
//             System.out.println(p);
//             return ;
//         }
//         char ch=up.charAt(0);
//         //include
//          printSubString(p+ch,up.substring(1));
//         //exclude
//         printSubString(p, up.substring(1));
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         printSubString("", str);
//     }
// }



//count the substring
// public class recurrsion2{
// static int count(String str){
//     if(str.isEmpty())
//         return 1;
//     return count(str.substring(1))+count(str.substring(1));
// }
// public static void main(String[] args){
//     String str="abc";
//     System.out.println(count(str));
// }
// }



//Binary String
// public class recurrsion2{
//     static void binary(String str,int n){
//         if(n==0)
//         {
//             System.out.println(str);
//             return;
//         }
//         binary(str + "0",n-1);
//         binary(str + "1",n-1);
//     }
//     public static void main(String[] args) {
//         int n=2;
//         binary("",n);
//     }
// }

//coin toss
public class recurrsion2{
    static void binary(String str,int n){
        if(n==0)
        {
            System.out.println(str);
            return;
        }
        binary(str + "H",n-1);
        binary(str + "T",n-1);
    }
    public static void main(String[] args) {
        int n=2;
        binary("",n);
    }
}
