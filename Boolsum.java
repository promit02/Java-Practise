public class Boolsum {
    public static boolean Sum(int a[], int target) {
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] + a[i] + a[i + 1] == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // int arr[] = { 2, 7, 11, 15 };
        int arr[] = { 3, 2, 4 };
        System.out.println(Sum(arr, 9));
    }
}
