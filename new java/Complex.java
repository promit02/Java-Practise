import java.util.*;
class Complex
{
  double real;
  double image;

Complex(double r,double i)
{
  real=r;
  image=i;
}
 Complex(){

}

Complex multiply(Complex obj1,Complex obj2)
{
Complex obj=new Complex();
obj.real=obj1.real*obj2.real;
obj.image=obj1.image*obj2.image;
return obj;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first numbers");
int n1=sc.nextInt();
int n2=sc.nextInt();
System.out.println("Enter the second numbers");
int m1=sc.nextInt();
int m2=sc.nextInt();
Complex obj1=new Complex(n1,n2);
Complex obj2=new Complex(m1,m2);
Complex obj=obj1.multiply(obj1,obj2);
System.out.println(obj.real + "+i" + obj.image);
}
}