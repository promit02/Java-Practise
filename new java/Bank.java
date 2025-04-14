import java.util.*;

class Account {
    String name;
    long acc_no;
    String type;
    int balance;

    void deposit(int amt) {
        balance += amt;
    }

    void display1() {
        System.out.println("The balance of the current account is Rs:" + balance);
    }

    void display2() {
        System.out.println("The balance of the savings account is Rs:" + balance);
    }

    void withdraw(int amt1) {
        balance -= amt1;
    }

    class Curr_Acc extends Account {
        int penalty;

        void checkbook() {
            System.out.println("Checkbook facility is available for current account holders");
        }

        @Override
        void withdraw(int amt1) {
            if ((balance - amt1) > 1000) {
                penalty = amt1 + 100;
                balance = balance - penalty;
                System.out.println("The penalty amount is: Rs" + penalty);
            }
        }
    }

    class Savn_acct extends Account {
        float interest;

        void inter(float rate) {
            float after_balance = balance * (1 + (rate / 100));
            System.out.println("The balance after interest amount is Rs:" + after_balance);
        }
    }

    public static void main(String args[]) {
        Account account = new Account();
        Account.Curr_Acc c = account.new Curr_Acc();
        Account.Savn_acct s = account.new Savn_acct();

        c.checkbook();
        c.deposit(50000);
        c.display1();
        c.withdraw(20000);
        c.display1();

        s.deposit(60000);
        s.display2();
        s.inter(5f);
    }
}
