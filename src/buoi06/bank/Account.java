package buoi06.bank;

public class Account {
    private long accountNumber;
    private String accountName;
    private double accountBalance;
    final double interestRate = 0.035; // lãi suất
    Account(){

    }

    Account(long accountNumber, String accountName, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    Account(long accountNumber, String accountName){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        System.out.println("Name: "+accountName);
        return accountName;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        System.out.println("Number: "+accountNumber);
        return accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        System.out.println("Balance: "+accountBalance);
        return accountBalance;
    }

    public String toString(){
        String stc = "So TK: " +this.getAccountNumber() + "Ten TK: " +this.getAccountName();
        stc += "So du TK: " +this.getAccountBalance();
        return stc;
    }

    public void deposit(int amount){
        if(amount < 0){
            System.out.println("Nap tien that bai !");
        }
        accountBalance += amount;
    }

    public void withdraw(int amount){
        if(amount > accountBalance){
            System.out.println("Tai khoan khong du de rut tien");
        }
        accountBalance -= amount;
    }

    public void expire(){ //Phương thức đáo hạn
        accountBalance = accountBalance + (accountBalance * interestRate);
    }

    public void transfer(){
        
    }
}
