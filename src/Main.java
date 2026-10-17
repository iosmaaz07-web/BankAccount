public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        try {
            account.withdraw(1502);
        } catch (InsufficientBalanceException e) {
            System.out.println("error:" + e.getMessage());

        }
        SavingsAccount savings = new SavingsAccount(1000,5);
        savings.addInterest();
        System.out.println("savings balance:" + savings.getBalance());

        Account acc = new SavingsAccount(2000,5);
        acc.deposit(500);
        System.out.println("account balance: " + acc.getBalance());
    }
}
