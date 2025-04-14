import java.util.Arrays;

public class Reverse {
    public static void PrintArray(int arr[], int n) {
        System.out.println("Reverse array is :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void ReverseArray(int arr[], int n) {
        int p1 = 0;
        int p2 = n - 1;
        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        PrintArray(arr, n);
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = { 2, 3, 4, 12, 6 };
        ReverseArray(arr, n);
    }

}