import java.util.*;
class Board
{
  int length,breadth;
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the length and breadth:");
 int length=sc.nextInt();
 int breadth=sc.nextInt();
Board obj=new Board();
obj.surface(length,breadth);
}
 public static void surface(int l,int b)
{
 System.out.println("Surface area of board is:"  +  l*b );
}
}