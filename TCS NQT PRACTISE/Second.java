import java.util.*;

public class Second {

    public static void getElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            System.out.println(-1);
            System.out.println(" ");
            System.out.println(-1);
            System.out.println("\n");
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        int i;

        for (i = 0; i < n; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_largest && arr[i] != large) {
                second_largest = arr[i];
            }
        }
        System.out.println("Second smallest element is " + second_small);
        System.out.println("Second largest element is :" + second_largest);

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int n = arr.length;
        getElements(arr, n);
    }

}
