//problem sum of N natural number
import java.util.*;
public class NaturalSum{
public static int Sum(int n){
int sum=0;
if(n>0){
for(int i =1;i<=n;i++){
	sum+=i;
}
}
return sum;
}
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt(); //input the last element upto which it will be sum
int x =Sum(n);
System.out.println(" The sum of "+ n +" natural no. is "+x);
}
}
