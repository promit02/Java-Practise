import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void Arr(int arr[]) {
        // int arr[] = new int[];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print((arr[i]) + " ");

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arr(a);
    }
}
