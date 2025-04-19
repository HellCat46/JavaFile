class Account {
    int amount = 0;

    Account(int baseBal){
        amount = baseBal;
        amount += 50; // Welcome Bonus
    }

    void deposit(int amt){
        amount += amt;
    }

    void withdraw(int amt){
        if(amt >= amount){
            System.out.println("Not Enough Balance");
            return;
        }
        amount -= amt;
    }
}

class HDFCBank extends Account{
    int minBal;

    HDFCBank(int baseBal, int mBal) {
        super(baseBal);
        minBal = mBal;
    }

    @Override
    void deposit(int amt) {
        super.deposit(amt);
    }

    @Override
    void withdraw(int amt) {
        if(amount-amt < minBal){
            System.out.println("Account Balance can't be less than "+minBal);
            return;
        }
        super.withdraw(amt);
    }
}

class Program4 {
    public static void main(String[] args){
        HDFCBank acc = new HDFCBank(500, 250);
        acc.withdraw(350);


        HDFCBank acc1 = new HDFCBank(500, -1);
        acc1.withdraw(551);
    }
}