class account
{
  String name;
  long acc_no;
  int balance;
  String type;
  void deposit(int amount)
{
   balance+=amount;
}
void display()
{
 System.out.println("The balance is:Rs."+balance);
}
void withdr(int amount)
{
 balance-=amount;
}
}

class curr_acct extends account
{
int penalty;
void checkbook()
{
  System.out.println("Checkbook facility is available for current account:");
}
void withdr(int amt)
{
if(balance-amt<1000)
{
penalty=amt+100;
balance=balance-penalty;
System.out.println("Penalty amount is Rs." +penalty);
}
}
}
class Savn_Acct extends account{
	float interest;
	void intr(float r){
		float balAfterIntr = balance * (1+(r/100));
		System.out.println("The balance afer interest interest amount is: Rs."+ balAfterIntr);	
	}
}
class Bank{
	public static void main(String[] args){
		curr_acct c = new curr_acct();
		Savn_Acct s = new Savn_Acct();
		c.checkbook();
		c.deposit(6000);
		c.display();
		c.withdr(7000);
		c.display();
		s.deposit(52000);
		s.display();
		s.intr(3.5f);
	}
}


