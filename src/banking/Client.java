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
public class Client {
    private static int counter;
    private int clientId;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accountList;
    
    public Client(){
        this.counter++;
        this.clientId = counter;
        this.firstName = "";
        this.lastName = "";
        this.accountList  = new ArrayList<Account>();
    }
    
    public Client(String fname, String lname){
        this.counter++;
        this.clientId = counter;
        this.firstName = fname;
        this.lastName = lname;
        this.accountList = new ArrayList<Account>();
    }
    
    //getters and setters
    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getClientId() {
        return this.clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Account> getAccountList() {
        return this.accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }


    //methods
    public void addAccount(Account a){
        this.accountList.add(a);
    }
    
    public Account getAccount(int accNumber){
        for (Account account : accountList) {
            if (account.getAccountNumber() == accNumber) {
                return account;
            }
        }
        return null;
        
    }
    
    public void displayAccounts(){
        for (Account account : accountList) {
            System.out.println(account);
        }
        
    }
    
    public void displayAllTransactions(){
        for (Account account : accountList) {
            account.displayAllTransactions();
        }
    }
    
    @Override
    public String toString(){
        return ""+ this.clientId + "." +  this.firstName + " " + this.lastName;
    }
    
    
}
