import java.util.*;
class Lexo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of words:");
int n=sc.nextInt();

sc.nextLine();

String[] word=new String[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the words" + (i+1) + ":");
word[i]=sc.nextLine();
}
Arrays.sort(word);

System.out.println("Sorted words in lexographical order are:");
for(String wd:word)
{
System.out.println(wd);
}
sc.close();
}
}