import java.util.Arrays;
public class OptMaxMin {
    public static void main(String args[])
    {
        int arr[]={5,7,2,3};
        //sort 2,3,5,7,
        Arrays.sort(arr);
        System.out.println("Min ele :"+ arr[0]);
        System.out.println("Max ele :"+ arr[arr.length-1]);
    }
}
