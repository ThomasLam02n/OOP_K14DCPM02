package buoi01.object_oriented;

import java.util.Scanner;

public class Account {
    int id = 12345;
    int account_balance;

    Account(){}

    public void deposit(int amount){
        account_balance += amount;
    }

    public void withdraw(int amount){
        account_balance -= amount;
    }

    public void show_Account(){
        System.out.println("Thông tin tài khoản: ");
        System.out.println("ID: "+id);
        System.out.println("Số dư tài khoản: "+account_balance);
    }
}
