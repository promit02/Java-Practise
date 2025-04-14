class Parent
{
static
{
System.out.println("I am the father!");
}
}
class Child extends Parent
{
static 
{
System.out.println("I am the beta!");
}
}
class Main
{
public static void main(String args[])
{
Child obj=new Child();
}
}