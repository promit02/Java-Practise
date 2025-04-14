import java.util.ArrayList;
public class Maxtcs {
    public static int Maxi(int[] a,int start, int end) {
        // int arr[] = new int[];
        int maxi = a[start];
        for (int i = start + 1; i <=end; i++) {
            if (a[i] > maxi) {
                maxi = a[i];
            }

        }
        return maxi;

    }
    public static ArrayList<Integer> Subarray(int arr[],int k)
    {
        ArrayList<Integer> list= new ArrayList<>();
        int n= list.size();
        for(int i=0;i<=n-k;i++)
        {
            int x = Maxi(arr, i,i+k-1);
            list.add(x);
        }
        return list;
    }
    public static void main(String args[])
    {   
        //int[] arr={2,4,7,1,6,3};
        //int k =3;
        ArrayList<Integer> l1= new ArrayList<>();
        l1.add(2);
        l1.add(4);
        l1.add(7);
        l1.add(1);
        l1.add(6);
        l1.add(3);

        int k =3;
        ArrayList<Integer> list= Subarray(l1, k);
    }
}
