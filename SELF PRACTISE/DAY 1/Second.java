import java.util.Arrays;

public class Second {
    public static void                                                        getEle(int arr[ ],int n)
    {
        if(n==0 || n==1)
        {
            System.out.println(-1);
        }
        int min = Integer.MAX_VALUE;
        int min_sec = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int max_sec =Integer.MIN_VALUE;

        for(int i =0 ;i< n; i++)
        {
            min = Math.min(min,arr[i]);
            max= Math.max(max,arr[i]);
        }
        for(int i =0 ;i< n;i++ )
        {
            if(arr[i]< min_sec && arr[i]!=min)
            {
                arr[i]=min_sec;
            }
            if(arr[i]> max_sec && arr[i]!=max)
            {
                arr[i] =max_sec;
            }
        }
        System.out.println("Second Smallest element "+ min_sec);
        System.out.println("Second Largest element "+ max_sec);
    }

    public static void main(String args[]) {
        int arr[] = { 12, 3, 45, 2, 0, 1, 7, 7, 8 };
        int n = arr.length;
        getEle(arr, n);
    }
}