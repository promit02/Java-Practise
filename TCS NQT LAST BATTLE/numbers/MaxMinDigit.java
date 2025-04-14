import java.util.*;
public class MaxMinDigit{
public static int[] MinMax(int n){
	int M=Integer.MIN_VALUE;
	int m=Integer.MAX_VALUE;
	int d;
	while(n!=0){
		d=n%10;
		m = Math.min(m,d);
		M =Math.max(M,d);
		n=n/10;
		
	}
	return new int[]{m,M};
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r[]=MinMax(n);
	System.out.println("Minimum digit is :" +r[0]);
	System.out.println("Maximum digit is: "+r[1]);
}
}