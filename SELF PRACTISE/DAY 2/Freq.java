import java.util.Arrays;

public class Freq {
    public static void countFreq(int arr[], int n) {
    
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }

    }

    public static void main(String args[]) {
        int arr[] = { 9, 2, 1, 9, 0, 0, 2, 9 };
        int n = arr.length;
        countFreq(arr, n);
    }

}