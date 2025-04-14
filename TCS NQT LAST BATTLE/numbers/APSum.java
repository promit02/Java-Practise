import java.util.*;
public class APSum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a= sc.nextInt();
int n=sc.nextInt();
int d=sc.nextInt();
float s = (n / 2) * (2 * a + (n - 1) * d);
System.out.println("The sum is: "+s);
}

}