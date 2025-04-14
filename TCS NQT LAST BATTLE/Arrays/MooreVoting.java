import java.util.*;
public class MooreVoting{
public static int MajorityEle(int arr[],int n){
	int candidate=-1;
	int count=0;
	for(int nums:arr){
		if(count==0){
			candidate=nums;
		}
		is(nums==candidate){
			count++; //current ele is equal to the candidate
		}
		else{
			count--; //decrease the count
		}
	}
	//verify if the candidate is actually the majority
	count =0;
	for(int nums:arr){
		if(nums==candidate){
			count++;
		}
	}
	if(count>2){
		return candidate;
	}
	else{
		return -1;
	}
}
 public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int arr[] = new int[n]; // Declaring array

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMajorityElement(arr, n);
        if (result == -1) {
            System.out.println("No Majority Element found");
        } else {
            System.out.println("The majority element is: " + result);
        }

        sc.close();
    }
}