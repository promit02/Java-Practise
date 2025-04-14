import java.util.*;	
class sort
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the length of the array");
 int n=sc.nextInt();
 int arr[]=new int[n];
 int temp,flag=1;
 for(int i=0;i<n;i++)
{
System.out.println("Enter the numbers");
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{

  for(int j=0;j<n-1-i;j++)
{
if(arr[j]>arr[j+1])
{
  temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
flag=0;
}
}
if(flag==1)
break;
}
for(int i=0;i<n;i++)
{
System.out.println("Sorted array is:" + arr[i] + " ");
}
}
}