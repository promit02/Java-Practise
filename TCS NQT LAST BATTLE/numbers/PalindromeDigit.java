// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class PalindromeDigit{
public static boolean isPalindrome(int n){
	int rev=0;
	int dup=n; //storing original number
	while(n>0){
		int ld=n%10;
		rev=(rev*10)+ld;
		n=n/10;
	}
	if(dup==rev){
		return true;
	}
	else{
		return false;
	}

}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);	
	String st=sc.nextLine();
	int num =Integer.parseInt(st);
	if(isPalindrome(num)){
		System.out.println("Palindrome number it is");
	}
	else{
		System.out.println("Not palindrome");
	}
}
}