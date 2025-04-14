import java.util.*;

public class ReverseString {
    public static void main(String args[]) {
        String s1 = "Hello";
        String rev = " ";
        for (int i = 0; i < s1.length(); i++) {
            rev = s1.charAt(i) + rev;
        }
        System.out.println(rev);
    }
}
