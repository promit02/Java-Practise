public class ReverseNum {

    public static void Reverse(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {

            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        System.out.println(rev);
    }

    public static void main(String args[]) {
        Reverse(321);
    }
}
