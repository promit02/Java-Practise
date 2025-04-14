import java.util.Arrays;

public class MAX {
    public static int MaxEle(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int A1[] = { 2, 3, 13, 9, 18, 0 };
        System.out.println("Largest Element in an array is " + MaxEle(A1));
    }
}