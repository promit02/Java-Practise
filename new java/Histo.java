import java.util.*;
class Histo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string\n");
String str=sc.nextLine();

HashMap<Character,Integer>hs=new HashMap<>();

for(char ch:str.toCharArray())
{
if(Character.isLetter(ch))
{
hs.put(ch,hs.getOrDefault(ch,0)+1);
}
}
System.out.println("Histogram of Characters:\n");
for(Map.Entry<Character,Integer>entry :hs.entrySet())
{
System.out.println(entry.getKey() + ":");
for(int i=0;i<entry.getValue();i++)
{
System.out.print("||");
}
System.out.println();
}
sc.close();
}
}