public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        try {
            account.withdraw(1502);
        } catch (InsufficientBalanceException e) {
            System.out.println("error:" + e.getMessage());

        }
    }
}
