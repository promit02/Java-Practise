import java.util.*;

public class RemoveDuplicatesUnsorted {
    public static void main(String args[]) {
        int arr[] = { 5, 3, 4, 5, 5, 4, 9, 7, 6, 9 };
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]); // stores unique element
        }
        Integer b[] = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(b));
    }
}