import java.util.*;
public class FibonacciRecursion{
public static int fibonacci(int n){
	if(n<=1){
		return n;
	}
	else{
		int l= fibonacci(n-1);
		int sl= fibonacci(n-2);
		return l+sl;
	}
}
public static void main(String args[]){
Scanner sc= new Scanner(System.in);	
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("The numbers generated upto " + n );
for(int i=0;i<n;i++){
System.out.print( fibonacci(i));
}
System.out.println(" and their sum is :"+fibonacci(n));
}

}
