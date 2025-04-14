import java.util.*;
public class SumPrime{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		int N= sc.nextInt();
		int x=SumPrimeuptoN(N);
		System.out.println("The sum is :" + x);
	}
	public static boolean isPrime(int n){
	    if(n<2) return false;
		for(int i =2;i*i<=n;i++){
			if(n%i==0) return false;
		}
		return true;
	}
	public static int SumPrimeuptoN(int n){
		int sum=0;
		for(int i =2;i<=n;i++){
			if(isPrime(i)){
				sum+=i;
			}
		}
		return sum;
	}
}