public class Subarray {
    public static void Arr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                int start = i;
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        int[] a = { 2, 3, 4, 5, 6 };
        Arr(a);
    }
}
