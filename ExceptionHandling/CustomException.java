package ExceptionHandling;

class InsufficientBalance extends  Exception {
    InsufficientBalance(String s) {
        super(s);
    }
}

class Bank {

    double balance = 1000;
    public double withdraw(double amount) throws InsufficientBalance {
        if(amount < this.balance) {
            this.balance = this.balance - amount;
            return amount;
        } else {
            throw new InsufficientBalance("Insufficient balance, "+amount+" cannot be dispensed");
        }
    }
}
public class CustomException {

    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.withdraw(90000);
        } catch (InsufficientBalance insufficientBalance) {
            System.out.println(insufficientBalance);
        }

    }

}
