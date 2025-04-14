import java.util.Stack;

public class ReverseStack {
    public static void Stackarray(int arr[]) {
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        while (!st.isEmpty()) {
            // st.pop();
            System.out.print(st.pop() + " ");
        }

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5 };
        Stackarray(arr);
    }
}