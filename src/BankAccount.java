public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
        }
    }
    public void withdraw(double amount)throws InsufficientBalanceException{
        if(amount>0 && amount<=balance){
            balance -= amount;
        }
        else{
            throw new InsufficientBalanceException("not enough money");
        }
    }
    public double getBalance(){
        return balance;
    }
}
