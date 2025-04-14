import java.util.*;
public class GPSum{
public static double Sum(float a, int n,float r){
double p= Math.pow(r,n);
double s = a*(p-1)/(r-1);
return s;

}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	float a=sc.nextFloat();
	int n=sc.nextInt();
	float r= sc.nextFloat();
	double s= Sum(a,n,r);
	System.out.println("The sum is : "+ s);
	
	
}

}