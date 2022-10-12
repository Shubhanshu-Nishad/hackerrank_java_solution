import java.util.Scanner;

public class Bubblesort {
    static void bubble(int[] arr){
        int temp=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j =0;j<n-i-1;j++){
                if(arr[j-1]>arr[j]) {
                    temp = arr[j+1];
                    arr[j-1] = arr[j];
                    arr[j] =temp;
                }
            }
        }

    }


    public static void main(String[] args) {
    int[] arr = {1,5,4,8,7,9};
    for( int i=0;i<arr.length;i++){
        System.out.println(arr[i]+"");
    }

        System.out.println();
    bubble(arr);
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
    }
}