package myotherpackage;
import mypackage.Inter1;

public class Myclass
{
protected class MyInnerClass implements Inter1
{
void myMethod()
{
System.out.println("Implemented method in myInnerClass");
}
}
}