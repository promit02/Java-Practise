import java.util.Stack;

public class ReverseString {
    public  static void Reverse(String str){
        Stack <Character> st= new Stack<Character>();
        for(int i =0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        String st1="";
        while(!st.isEmpty()){
           st1 += st.pop();
        }
        System.out.print(st1);

    }

    public static void main(String args[]) {

        String str = "Promit";
        Reverse(str);
    }
}
