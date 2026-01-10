import java.util.*;
public class Nqueen{
    static void draw(int N){
        char arr[][]=new char[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                arr[i][j]='.';
            }
        }
        solve(arr,0,N);
    }
    static void solve(char[][] arr,int row,int N){
       if(row==N){
        print(arr);
        System.out.println();
        return;
       }
       for(int col=0;col<N;col++){
        if(isSafe(arr,row,col)){
            arr[row][col]='Q';
            solve(arr,row+1,N);
            arr[row][col]='.';
        }
       }
    }
    static boolean isSafe(char[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            if(arr[i][col]=='Q') 
                return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q') return false;
        }
            for(int i=row-1,j=col+1;i>=0 && j< arr.length;i--,j++){
                if(arr[i][j]=='Q') return false;
            }
            return true;
        }
        static void print(char[][] arr){
            for(char[] row : arr){
                for(char c : row){
                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args){
            int N=4;
            draw(N);
        }
    }

