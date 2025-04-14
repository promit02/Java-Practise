import java.util.*;
public class PrimeRange{
public static boolean isPrime(int n)
{   
    //corner case 
    if(n<=1){
        return false;
    }
	for(int i=2;i*i<=n;i++){
		if(n%i==0) return false;
	}
	return true;
	
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int min =sc.nextInt();
	int max= sc.nextInt();
	for(int i=min;i<=max;i++){
		if(isPrime(i)){
			System.out.print(i+" ");
		}
	}
	//else{
	   // for(int j=2;j<max;j++){
	        //if(isPrime(j)){
	            //System.out.print(j+" ");
	       // }
	    //}
	//}
}

}