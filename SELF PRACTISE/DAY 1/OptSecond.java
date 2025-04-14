import java.util.*;
import java.io.*;

class OptSecond {
    static private int secondSmallest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
            } else if (arr[i] < min2 && arr[i] != min) {
                 min2=arr[i];
            }
        }
        return min2;

    }

    static private int secondLargest(int[] arr, int n) {
        if (n < 2) {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                 max2=arr[i] ;
            }

        }
        return max2;
    }

    public static void main(String args[]) {
        int arr[] = { 12, 3, 4, 8, 1, 7 };
        int n = arr.length;
        int Smin = secondSmallest(arr, n);
        int Smax = secondLargest(arr, n);
        System.out.println("Second smallest element is" + Smin);
        System.out.println("Second largest element is " + Smax);
    }
}