import java.util.*;

public class RotateOne {
    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The Array is" + arr[i]);
        }
    }

    public static void Rotate(int arr[]) {
        int n  = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        PrintArray(arr);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("The Rotated array is:");
        Rotate(arr);
    }
}