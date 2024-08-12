package com.ais;

import java.util.HashMap;
import java.util.Map;

public class Question7 {
  
    public static class Account {
        private String accountNumber;
        private String accountHolderName;
        private double balance;

        
        public Account(String accountNumber, String accountHolderName, double initialBalance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = initialBalance;
        }

        
        public String getAccountNumber() {
            return accountNumber;
        }

        
        public String getAccountHolderName() {
            return accountHolderName;
        }

      
        public double getBalance() {
            return balance;
        }

        
        public void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        
        public void withdraw(double amount) {
            if (amount > 0) {
                if (amount <= balance) {
                    this.balance -= amount;
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }
    }

    
    private Map<String, Account> accounts = new HashMap<>();

   
    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    
    public void removeAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            accounts.remove(accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

   
    public void deposit(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw money from an account
    public void withdraw(String accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    
    public static void main(String[] args) {
        
        Question7 bank = new Question7();

       
        Account acc1 = new Account("1001", "Alice", 500.00);
        Account acc2 = new Account("1002", "Bob", 300.00);

      
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        
        System.out.println("Initial Balances:");
        System.out.println("Account 1001 Balance: $" + bank.getAccount("1001").getBalance());
        System.out.println("Account 1002 Balance: $" + bank.getAccount("1002").getBalance());

        
        bank.deposit("1001", 200.00);
        bank.withdraw("1002", 100.00);

        
        System.out.println("\nUpdated Balances:");
        System.out.println("Account 1001 Balance: $" + bank.getAccount("1001").getBalance());
        System.out.println("Account 1002 Balance: $" + bank.getAccount("1002").getBalance());

        
        bank.removeAccount("1001");
        System.out.println("\nAttempting to access removed account 1001:");
        System.out.println("Account 1001: " + bank.getAccount("1001")); // Should print null
    }
}
