import java.util.*;
public class findRepeatingEle{
	public static void RepeatingEle(int arr[]){
		int c=0;
		int dup[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			for(int j =i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					dup[c++]=arr[i];
				}	
			}
	
		}
		System.out.println("The repeating elements are:");
		for(int i=0;i<c;i++){
			if(dup[i]!=dup[i+1]){
				System.out.print(dup[i]+" ");
			}
		}

	}
	public static void main(String args[]){
		int arr[]={1,2,4,6,1,6,6,2,5,3,3};
		RepeatingEle(arr);
	}


}