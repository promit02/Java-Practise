import java.util.*;

public class RepeatingEleOptimized {
    public static void findRepeatingEle(int arr[]) {
        Arrays.sort(arr);
        System.out.println("The repeating elements:");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = {1,1,2,3,4,4,5,2};
        findRepeatingEle(arr);
    }
}