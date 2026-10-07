public class Main {
    public static void main(String[]args){
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(300);
        System.out.println("Balance: " + account.getBalance());
    }
}
