import java.util.*;

public class OccurenceString {
    public static void main(String args[]) {
        String s1 = "Hello";
        int count = 0;
        char target = 'l';
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == target) {
                count++;
            }
        }
        System.out.println(count);
    }

}
