import java.util.*;

public class Vowels {
    public static void main(String args[]) {
        String str1 = "I enjoy eating sphagetti and meatballs";
        String st[] = str1.split(" ");
        int c = 0;
        for (String items : st) {
            for (int i = 1; i < items.length(); i++) {
                if (items.length() < 2) {
                    continue;
                } else if ((items.charAt(i - 1) == 'a' || items.charAt(i - 1) == 'e' || items.charAt(i - 1) == 'i'
                        || items.charAt(i - 1) == 'o' || items.charAt(i - 1) == 'u') && (items.charAt(i) == 'a'
                        || items.charAt(i) == 'e' || items.charAt(i) == 'i' || items.charAt(i) == 'o'
                        || items.charAt(i) == 'u')) {
                    c++;
                    break;
                }
            }
        }
        System.out.println(c);
    }
}