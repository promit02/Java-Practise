import java.util.*;

public class AveArray {
    public static double averageArray(int arr[]) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        if (arr.length == 0) {
            return 0; // Return 0 if array is empty
        }

        return sum / arr.length;

    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        double x = averageArray(arr);
        System.out.println("Average of Array element is : " + x);
    }
}