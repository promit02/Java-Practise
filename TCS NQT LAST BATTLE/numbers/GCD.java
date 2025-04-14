                                import java .util.*;
public class GCD{
public static int gcdofTwo(int n1,int n2){
int gcd=1;//gcd 1 for prime numbers
for(int i =1;i<=Math.min(n1,n2);i++){
	if(n1%i==0 && n2%i==0){
		gcd=i;
	}
}
return gcd;
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int x=gcdofTwo(n1,n2);
	System.out.println("The gcd of both the numbers "+ x);
}
}