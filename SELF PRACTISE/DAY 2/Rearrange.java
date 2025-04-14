import java.util.*;

public class Rearrange {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 4, 6, 0, 12 };
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = n - 1; i >= n / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}