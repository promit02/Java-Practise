import java.util.*;

public class SumArray {
    public static int Sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int x = Sum(arr);
        System.out.println("The sum is "+ x);
    }
}