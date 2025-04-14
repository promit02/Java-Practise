class Static
{
static
{
System.out.println("Hum first!");

}
Static()
{
System.out.println("Constructor is called:");
}
public static void main(String args[])
{
System.out.println("Main method is called:");
Static obj=new Static();
}
}