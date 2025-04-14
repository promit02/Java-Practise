import java.util.*;
public class LeapYears{

public static boolean isLeapYear(int n){
	if(n%400==0 ||(n%4==0 &&n%100 !=0)) return true;
	return false;

}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int y1= sc.nextInt();
	int y2=sc.nextInt();
	for(int i =y1;i<=y2;i++){
		if(isLeapYear(i)){
			System.out.println("The years are : " + i);
		}
	} 
}
}