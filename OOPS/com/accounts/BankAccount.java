package com.accounts;

public abstract class BankAccount {
    private static String bankCode;
    private String accountNumber;
    private String accountHolderName;
    private Double balance;

    static {
        bankCode = "MYBANK123";
    }

    BankAccount(String accountNumber, String accountHolderName, Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    String getBanckCode() {
        return bankCode;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;
        else 
            System.out.println("Transiciton failed, Invalid amount enterd");
    }
    public void deposit(double amount, String mode){
        System.out.println("Depositing "+amount +" via , "+mode);
        deposit(amount);
    }

    public abstract void withdraw(double amount);
    public abstract double calculateIntrest();
}
