import java.util.*;

public class OptRotateK {
    public static void Reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void leftrotate(int arr[], int n, int k) {
        if (n == 0) {
            return;
        }
        k = k % n;
        Reverse(arr, 0, k - 1);
        Reverse(arr, k, n - 1);
        Reverse(arr, 0, n - 1);
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n= arr.length;
        int k =3;
        System.out.println("Array berfore rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

    leftrotate(arr,n,k);
    System.out.println("Array after rotation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
}