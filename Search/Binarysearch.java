package Search;

import java.util.Arrays;

public class Binarysearch {

    public static int Bs(int nums[], int k) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == k) {
                return mid;// found
            }
            if (nums[mid] < k) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        int a[] = { 1, 4, 5, 4, 3, 2, 0 };
        Arrays.sort(a);
        int k = 5;
        System.out.println("index of key is :" + Bs(a, k));

    }
}
