import java.util.Scanner;

public class Majority {
    
    // Brute force method to find the majority element
    public static int findMajorityElement(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;  // Track the occurrence of arr[i]

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Check if this element is the majority element
            if (count > n / 2) {
                return arr[i];  
            }
        }
        return -1;  // No majority element found
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMajorityElement(arr, n);
        if (result == -1) {
            System.out.println("No Majority Element found");
        } else {
            System.out.println("The majority element is: " + result);
        }

        sc.close();
    }
}
