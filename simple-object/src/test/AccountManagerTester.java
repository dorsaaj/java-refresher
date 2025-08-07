package test;

import com.simple.account.AccountManager;
import com.simple.account.BankAccount;
import com.simple.account.BusinessAccount;
import com.simple.account.InsufficientFundsException;

public class AccountManagerTester {
    public static void main(String[] args){
        AccountManager manager = new AccountManager();
        BusinessAccount account = new BusinessAccount(1000f, 1, "SimpleCorp", "123 Fake Street");
        manager.setAccount(account);
        manager.deposit(400f);
        try {
            manager.withdraw(20f);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Managing " + manager.getAccount());


    }
}
