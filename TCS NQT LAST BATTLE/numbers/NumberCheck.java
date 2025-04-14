import java.util.*;
public class NumberCheck{
//public static boolean isNum(String n){
//if(Character.isDigit(n.charAt(0)))return true;
//return false;
//}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String st=sc.nextLine();
//if(isNum(st)){
	if(Character.isDigit(st.charAt(0))){
		System.out.println(" positive number");
	}
	else if(Character.isLetter(st.charAt(0))){
	    System.out.println("mix Text");
	}
	else{
		System.out.println("negative number");
	}
	

}
}