import java.util.*;
public class Armstrong{
public static boolean isArmstrong(int n){
	int c=0;
	int i =n ;//storing the number for count operation
	while(i>0)
	{
		i=i/10;
		c++;
	}
	int sum=0;
	int j=n;//storing the number for armstrong operation
	while(n>0){
		int ld=n%10;
		n=n/10;
		sum+= (int)Math.pow(ld,c);
	}
	if(sum==j) return true;
	return false; 


}



public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	if(isArmstrong(n)){
		System.out.println(n+"is the Armstrong no.");
	}
	else{
		System.out.println(n+"is the non Armstrong no.");
	} 


}

}