public class recursion {
    /*static void printsum(int n){
        if(n<1){
        return;
    }
    System.out.println(n);
    printsum(n-1);
}
    public static void main(String[] args) {
        printsum(10);
    }
}*/


//factorial
static int fact(int n){
    if(n==0){
        return 1;
    }
    return n*fact(n-1);
}
public static void main(String[] args) {
    System.out.println(fact(5));
}
}



//reverse a string
static void reverse(String str,int i){
    if(i<0){
        return;
    }
    System.out.println(str.charAt(i));
    reverse(str,i-1);
}
public static void main(String[] args) {
    String str="hello";
    reverse(str,str.length()-1);
}