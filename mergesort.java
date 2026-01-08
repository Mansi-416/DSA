import java.util.*;
public class mergesort{
    static void mergeSort(int[] arr,int l,int r){
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void merge(int[] arr,int l,int mid,int r){
        ArrayList<Integer> temp=new ArrayList<>();
        int i=l;
        int j=mid+1;
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=r){
            temp.add(arr[j]);
            j++;
        }
        for(int k=0;k<temp.size();k++){
            arr[l+k]=temp.get(k);
        }
    }

        public static void main(String[] args){
        int arr[]={4,5,3,6,7};
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}