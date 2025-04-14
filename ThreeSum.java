public class ThreeSum {
    public static boolean TSum(int a[], int target) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j < a.length - 1; j++) {
                for (int k = j; k < a.length - 2; k++) {
                    if (a[i] + a[j] + a[k] == target) {
                        return true;
                    }
                }
            }

        }
        return false;

    }

    public static void main(String args[]) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(TSum(arr, 0));
    }
}
