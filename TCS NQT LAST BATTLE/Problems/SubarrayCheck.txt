import java.util.*;

public class SubarrayCheck {

    public static boolean breakableSubarray(int arr[]) {
        int totalSum = 0;
        int n = arr.length;

        for (int num : arr) {
            totalSum += num;
        }

        // Try all possible number of subarrays
        for (int numSubarrays = 1; numSubarrays <= n; numSubarrays++) {
            if (totalSum % numSubarrays != 0) {
                continue; // The sum must be divisible by numSubarrays
            }

            int requiredSum = totalSum / numSubarrays; // Each subarray must sum to this
            int currentSum = 0, count = 0;

            // Brute-force: Try forming valid subarrays
            for (int i = 0; i < n; i++) {
                currentSum += arr[i];

                if (currentSum == requiredSum) {
                    count++;  // Found a valid subarray
                    currentSum = 0;  // Reset sum for next subarray
                }
            }

            if (count == numSubarrays) {
                return true; // Found a valid partition
            }
        }

        return false; // No valid partition found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array elements separated by commas:");
        String ip = sc.nextLine();

        // Convert input to integer array
        String s[] = ip.split(",");
        int arr[] = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i].trim());
        }

        boolean result = breakableSubarray(arr);
        System.out.println(result);

        sc.close();
    }
}

