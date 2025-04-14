import java.util.*;

public class InsertElement {
    public static void insertFirst(int a[], int n, int val) {
        for (int i = n - 1; i >= 0; i--) {
            a[i + 1] = a[i]; // right shift
        }
        a[0] = val;
    }

    public static void insertEnd(int a[], int n, int val1) {
        a[n] = val1;
    }

    public static void insertPosi(int a[], int n, int pos, int val2) {
        for (int i = n; i >= pos; i--) {
            a[i] = a[i - 1]; // right shift
        }
        a[pos - 1] = val2;
    }

    public static void main(String args[]) {
        int arr[] = {10, 9, 14, 8, 20, 48, 16, 9, 0, 0, 0}; // Extra space for insertions
        int n = 8; // Current elements in array (excluding extra space)
        int val = 12;
        int val1 = 3;
        int val2 = 40;

        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        insertFirst(arr, n, val);
        n++; // Increment array length after insertion
        System.out.println("New array after inserting at first: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        insertEnd(arr, n, val1);
        n++; // Increment array length after insertion
        System.out.println("New array after inserting at end: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        int pos = 2;
        insertPosi(arr, n, pos, val2);
        n++; // Increment array length after insertion
        System.out.println("New array after inserting at position " + pos + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
}
