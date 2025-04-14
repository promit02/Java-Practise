import java.util.*;

public class PalindromeCheck {
    public static void main(String args[]) {
        String s1 = "madam";
        String rev = "";
        for (int i = 0; i < s1.length(); i++) {
            rev = s1.charAt(i) + rev;

        }
        if (s1.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Non Palindrome");
        }
    }
}
