import java.util.HashMap;

public class Occuring {

    public static void Freq(int arr[]) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.get(arr[i]) + 1);
            } else {
                m.put(arr[i], 1);
            }

        }
        for (HashMap.Entry map : m.entrySet()) {
            // System.out.println(map.getKey() + " " + map.getValue());
            if ((Integer) map.getValue() > 1) {
                System.out.println(map.getKey());
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 2, 5, 7 };
        Freq(arr);
    }
}
