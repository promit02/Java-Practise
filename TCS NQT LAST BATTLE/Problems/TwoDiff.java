import java.util.*;
public class TwoDiff{
public static List<int[]> twodiff(int arr[],int target){
	List<int[]> p= new ArrayList<>();
	for(int i =0;i<arr.length;i++){
			for(int j =0;j< arr.length;j++){
				if(arr[i]-arr[j]==target){
					p.add(new int[]{arr[i],arr[j]});
				}
			}
		}
	return p;
	
	}




public static void main(String args[]){
Scanner sc = new Scanner(System.in);

        // Taking array input from the user
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking target input
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // Finding and printing the pairs
        List<int[]> r = twodiff(nums, target);
        System.out.println("Pairs with the given difference:");

        for (int[] pair : r) {
            System.out.println(Arrays.toString(pair));
        }

        sc.close();  // Close the scanner
}

}