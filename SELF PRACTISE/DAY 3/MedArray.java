import java.util.*;

public class MedArray {
    public static double median(int arr[]) {
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            int idx = arr.length / 2;
            return arr[idx];
        } else {
            int idx = arr.length / 2;// 2,3,4,5 -> median 3+4/2 =3.5;
            double md = (double) (arr[idx] + arr[idx - 1]) / 2;
            return md;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 5,4};
        double x = median(arr);
        System.out.println(" The median of the given array is:" + x);
    }
}