package buoi06.bank;

public class AccountTestDrive {
    public static void main(String[] args) {

        Account account = new Account();
        account.setAccountNumber(123456789);
        account.setAccountName("Lam Vu Thanh Tai");
        account.setAccountBalance(50000);
        account.toString();

        account.deposit(500000);
        account.withdraw(300000);
        account.expire();
        account.toString();

    }
}
