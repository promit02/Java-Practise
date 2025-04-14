import java.util.Arrays;

public class LargestEle {
    public static int Largest(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                arr[i]=max;
            }
        }
        return max;

    }

    public static void main(String args[]) {
        int arr1[] = { 2, 5, 1, 3, 0 };
        System.out.println("the Largest element is :" + Largest(arr1));
        int arr2[] = { 8, 10, 5, 7, 9 };
        System.out.println("the Largest element is :" + Largest(arr2));
    }

}
