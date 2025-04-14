import java.util.*;
class DeleteEl
{
StringBuffer modString(StringBuffer str,int m)
{
str.delete(m,m+1);
return str;
}
public static void main(String args[])
{
StringBuffer sb=new StringBuffer();
DeleteEl obj=new DeleteEl();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string\n");
String s=sc.next();
sb.append(s);
System.out.println("Enter the index of the character which you want to delete:");
int m=sc.nextInt();
StringBuffer s1=obj.modString(sb,m);
System.out.println("The modified string is:"+s1);
}
}