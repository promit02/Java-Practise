import java.util.*;
class Time
{
	int hour;
	int minute;
	int second;
	Time(int h, int m, int s)
	{
		hour=h;
		minute=m;
		second=s;
	}
	Time()
	{

	}
	Time addition(Time ob1, Time ob2)
	{
		Time ob3=new Time();
		ob3.hour=ob1.hour+ob2.hour;
		ob3.minute=ob1.minute+ob2.minute;
		ob3.second=ob1.second+ob2.second;
		if(ob3.second>60)
		{
			ob3.second=ob3.second-60;
			ob3.minute=ob3.minute+1;
		}
		if(ob3.minute>60)
		{
			ob3.minute=ob3.minute-60;
			ob3.hour=ob3.hour+1;
		}
		return ob3;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hours: ");
		int a=sc.nextInt();
		System.out.println("Enter the minutes: ");
		int b=sc.nextInt();
		System.out.println("Enter the seconds: ");
		int c=sc.nextInt();

		Time ob1=new Time(a,b,c);

		System.out.println("Enter the hours: ");
		int x=sc.nextInt();
		System.out.println("Enter the minutes: ");
		int y=sc.nextInt();
		System.out.println("Enter the seconds: ");
		int z=sc.nextInt();

		Time ob2=new Time(x,y,z);

		Time ob4=ob1.addition(ob1,ob2);
		System.out.println("The total time is: " +ob4.hour+ " hours " +ob4.minute+ " minutes " +ob4.second+ " seconds ");
		sc.close();
	}
}