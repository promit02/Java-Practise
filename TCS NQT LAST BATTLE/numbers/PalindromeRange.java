import java.util.*;
public class PalindromeRange{
public static boolean isPalindrome(int n){
	int dup=n;
	int rev=0;
	while(dup>0){
		int ld=dup%10;
		rev=(rev*10)+ld;
		dup=dup/10;
	}
	if(n==rev) return true;
	return false;
}



public static void main(String args[])
{	
	Scanner sc=new Scanner(System.in);
	int min= sc.nextInt();
	int max =sc.nextInt();
	for(int i =min;i<=max;i++){
		if(isPalindrome(i)){
			System.out.print(i+" ");
		}
	}
}

}