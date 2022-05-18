/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.ArrayList;

/**
 *
 * @author 2135504
 */
public class Account {
    private static int counter;
    protected int accountNumber ;
    protected double balance;
    protected Client owner;
    protected ArrayList<Transaction> transactions; 
    protected String type;
    
    public Account(){
        
    }
    
    public Account(String s){
        this.counter ++;
        this.accountNumber = counter;
        this.balance = 0.00;
        this.owner = new Client();
        this.transactions = new ArrayList<Transaction>();
        this.type = s;
    }

    
    // getters and setters
    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return this.owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
  
    //methods
    public double deposit(double amount){
        Transaction deposit = new Transaction();
        deposit.setAmount(amount);
        deposit.setType("Deposit");
        this.transactions.add(deposit);
        
        return this.balance += amount;
        
    }
    
    public double withdraw(double amount){
        Transaction withdraw = new Transaction();
        withdraw.setAmount(amount);
        withdraw.setType("Withdraw");
        this.transactions.add(withdraw);
        if(amount > this.balance){
            System.err.println("Insufficient funds");
        }
        return this.balance -= amount;
        
    }
    
    public void addTransaction(Transaction t){
        this.transactions.add(t);
    }
    
    public void displayAllTransactions(){
        for (Transaction transaction : transactions) {
            System.out.println(transaction); 
        }
    }
    
    @Override
    public String toString(){
        double balanceRounded = Math.round(this.balance*100.00)/100.00;
        return "" + this.accountNumber + "." + this.type + " = " + "$"+balanceRounded ;
    }
    
}
