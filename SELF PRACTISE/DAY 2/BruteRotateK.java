import java.util.*;

public class BruteRotateK {
    public static void leftrotate(int arr[],int k,int n ){
        if(n==0){
            return;
        }
        k= k % n;//modulus function is used for rotation
        if(k==0){
            return;
        }

        //extra space which is O(k)
        int temp[] = new int[k];
        //creating temp array with copying first k elements
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i =k;i<n;i++){
            arr[i-k]=arr[i];
        }
        //place the last k elements in the original array 
        for(int i = n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
    }
        public static void main(String args[]){
            int arr[]={1,2,3,4,5,6,7};
            int n= arr.length;
            int k =3;
            System.out.println("Array before rotation:");
            for(int i =0;i< n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");
            
            leftrotate(arr,k,n);
            System.out.println("Array after rotation:");
            for(int i =0;i< n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");


    }
}