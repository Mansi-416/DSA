public class array_recursion {
    // static int sum(int a[],int n){
    //     if(n==0)
    //         return 0;
    //     return a[n-1]+sum(a,n-1);
    // }
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5};
    //     int n=arr.length;
    //     System.out.println(sum(arr,n));
    
    // }


    
    //max element
    // static int max(int arr[],int i){
    // if (i == arr.length - 1)
    //     return arr[i];

    // int max = max(arr, i + 1);

    // if (arr[i] > max)
    //     return arr[i];
    // else
    //     return max;

    // }
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5,6};
    //     int i=arr.length-1;
    //     System.out.println(max(arr,i));
    // }


    //count the number of times in a given array occur
    // static int occur(int[] arr,int i,int key){
    //     if(i==arr.length)return 0;
    //     int count=(arr[i]==key)?1:0;
    //     return count+occur(arr,i+1,key);
    // }
    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,5,6,7};
    //     int key=2;
    //     int i=0;
    //     System.out.println(occur(arr,i,key));
    // }

    //return true false
    //   static boolean occur(int[] arr,int i,int key){
    //     if(i==arr.length)return false;
    //     if(arr[i]==key) return true;
    //     return occur(arr,i+1,key);
    // }
    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,5,6,7};
    //     int key=2;
    //     int i=0;
    //     System.out.println(occur(arr,i,key));
    // }
    

    //sum of even nos. in array
    // static int evenSum(int arr[],int i){
    //     if(i==arr.length) return 0;
    //     int val=(arr[i]%2==0)?arr[i]:0;
    //     return val+evenSum(arr,i+1);

    // }
    // public static void main(String[] args) {
    //     int[] arr={1,2,4,3,5,6,7};
    //     int i=0;
    //     System.out.println(evenSum(arr,i));
    // }



    //replace 2 with 5
    // static void replace(int arr[],int i){
    //     if(i==arr.length)return;
    //     if(arr[i]==2){
    //         arr[i]=5;
    //     }
    //     replace(arr,i+1);
    // }
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,22,5,12,7};
    //     int i=0;
    //     replace(arr,i);
    //     for(int j=0;j<arr.length;j++){
    //     System.out.println(arr[j]+" ");
    //     }
    // }


    //+ or -
    static boolean positive(int[] arr,int i){
        if(i==arr.length)return true;
        if(arr[i]<0)return false;
        return positive(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,22,5,12,7};
        int i=0;
        System.out.println(positive(arr,i));
    }
}
