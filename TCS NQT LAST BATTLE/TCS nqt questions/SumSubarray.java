import java.util.*;
public class SumSubarray{
	public void sumArray(int arr[],int N, int S){
		int curSum=0;
		for(int i =0;i<N;i++){
			curSum=arr[i];
			for(int j=i+1;j<=N;j++){
				if(curSum==S)
				{
					System.out.println(""+i+1,j); //indexes
				}
				if(curSum>S){
					break;
				}
				curSum+=arr[j];
				else{
					System.out.println("-1");
				}
			}
		}
		
		
	}
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	
	int T=sc.nextInt();
	for(int i =0;i<T;i++){
		int N=sc.nextInt();
		int S=sc.nextInt();
	}
	int arr[]=new int[N];
	for(int j =0;j<N;j++){
		int arr[j]=sc.nextInt();	
	}
	SumArray(arr,N,S);
	
	}
}