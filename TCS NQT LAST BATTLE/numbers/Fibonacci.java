import java.util.*;
public class Fibonacci{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int a=0;
int b=1;
int n=sc.nextInt();
System.out.print(a+" "+b+" ");
int c;
while(n>2){
	c=a+b;
	a=b;//updating value of a with its next element b
	b=c;//updating value of b with its next element c
	n--;//loop reaching to its ends
	System.out.print(c+" ");
}
}
}