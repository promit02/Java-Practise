import java.util.*;
public class Rearrange {
    public static void Order(int arr[])
    {   
        int n= arr.length;
        Arrays.sort(arr);
        for(int i=0 ;i<n/2;i++)
        {
            System.out.print(arr[i]);
        }
        for(int i =n-1;i>=n/2;i--)
        {
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]= {6,7,3,2,4,5};
        Order(arr);
    }
}
