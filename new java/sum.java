import java.util.*;
public class sum
{
  public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the range of the series:");
   int n=sc.nextInt();
   System.out.println("Enter the number:");
   int x=sc.nextInt();
    int total=0;
    for(int i=0;i<n;i++)
{
  total+=(x^i);
}
System.out.println("The sum of the series is:" + total);
}
}