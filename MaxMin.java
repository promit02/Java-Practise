import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static int Max(int[] a) {
        // int arr[] = new int[];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;

    }

    public static int Min(int[] b) {
        int min = b[0];
        for (int i = 0; i < b.length; i++) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int arr[] = { 5, 7, 2, 3 };
        System.out.println(Max(arr));
        System.out.println(Min(arr));
    }
}
