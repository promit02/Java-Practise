import java.util.Arrays;

public class SmallestEle {
    public static int Smallest(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int a[] = { 2, 1, 3, 4, 8, 6 };
        System.out.println("Smallest element " + Smallest(a));
    }

}