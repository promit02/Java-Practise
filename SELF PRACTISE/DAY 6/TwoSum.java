import java.util.*;
public class TwoSum{
public static int[] twosum(int target,int arr[]){
	int res[]=new int[2];
	for(int i=0;i<arr.length;i++){
		for(int j = i+1;j<arr.length;j++){
			if(arr[i]+arr[j]==target){
				res[0]=i;
				res[1]=j;
				return res;
			}
		}
	}
	return new int[]{-1,-1};
	
	 

}
public static void main(String args[]){
	int arr[]={2,7,11,5};
	int target=7;
	int x[]= twosum(target,arr);
	System.out.println("Two sum is :"+x[0]+","+x[1]);	
}

}