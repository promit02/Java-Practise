import java.util.*;
public class Workout{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		float average;
		//int t = sc.nextInt();
		for(int i=1 ;i<=7;i++){
		    //int t = sc.nextInt();
			System.out.print(" Day "+i+" Monday: " );
			int t = sc.nextInt();
			sum=sum+t;
			
		}
		average=sum/7;
		System.out.println("Sum of workout time: "+ sum );
		System.out.println("Average workout time: "+ average );	
	}
}