public class Reverse {
    /*
     * public static void swap(int a, int b) {
     * int temp = a;
     * a = b;
     * b = temp;
     * }
     */

    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int i = 0;
        int j = arr.length - 1;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // swap(arr[i], arr[j]);
            i++;
            j--;
        }
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x] + " ");
        }
    }

}
