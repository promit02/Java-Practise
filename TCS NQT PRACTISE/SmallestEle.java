import java.util.*;
import java.util.Arrays;

public class SmallestEle {

    public static int Smallest(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int arr1[] = { 2, 5, 1, 3, 0 };
        System.out.println("the smallest element is :" + Smallest(arr1));
        int arr2[] = { 8, 10, 5, 7, 9 };
        System.out.println("the smallest element is: " + Smallest(arr2));

    }
}
