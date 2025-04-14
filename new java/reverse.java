import java.util.*;
class reverse
{
public static void main(String args[])
{
int rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();
while(num!=0)
{
int r=num%10;
if(r==0 && rev==0)
{
 System.out.println("0");
}
rev=rev*10+r;
num=num/10;
}
System.out.println("Reverse of a number is:" + rev);
}
}