import java.util.*;

public class MapFreq {
    public static void frequency(int arr[], int n) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 5, 10, 5, 15 };
        int n = arr.length;
        frequency(arr, n);
    }
}
