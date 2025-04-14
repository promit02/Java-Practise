import java.util.Arrays;

public class RemoveDup {
    public static int RemoveDup(int arr[]) {
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];

            }
        }
        return i + 1;
    }

    public static void main(String args[]) {
        int arr[] = { 3, 5, 6, 8, 9, 0 };
        int k = RemoveDup(arr);
        System.out.print("The array after duplication ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]);
        }
    }

}
