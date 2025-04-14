public class Reverse {
    static void printArray(int arr[], int n) {
        System.out.println("Reverse array is : \n");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    static void reverseArray(int arr[], int n) {
        int p1 = 0;
        int p2 = n - 1;
        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        printArray(arr, n);
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1 };
        reverseArray(arr, n);
    }
}
