/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Random;

/**
 *
 * @author 2135504
 */
public class Setup {
    
    
    public static void run(Bank b) {
        setUpClients(b);
        
        
                
    }
    
    private static void setUpClients(Bank b){
        Client c = new Client("Ronald", "Raphael");
        c.setClientId(1);
        b.addClient(c);
        setupAccounts(c);

        c = new Client("Olajire", "Olabode");
        c.setClientId(2);
        b.addClient(c);
        setupAccounts(c);
        
        c = new Client("Olajare", "Olabode");
        c.setClientId(3);
        b.addClient(c);
        setupAccounts(c);
        
        c = new Client("Olajumobi", "Olabode");
        c.setClientId(4);
        b.addClient(c);
        setupAccounts(c);
        
        c = new Client("Mary", "Olabode");
        c.setClientId(5);
        b.addClient(c);
        setupAccounts(c);
    }
    
    
    private static void setupAccounts(Client c){
        Account a = new SavingsAccount();
        c.addAccount(a);
        setupTransactions(a);
        
        a = new CheckingAccount();
        c.addAccount(a);
        setupTransactions(a);
    }
    
    private static void setupTransactions(Account a){
        Random rand = new Random();
        double amount = 1000 * rand.nextDouble();
        Transaction t = new Transaction("Deposit", amount);
        a.setBalance(a.getBalance() + t.getAmount());
        a.addTransaction(t);
        
        amount = 100 * rand.nextDouble();
        t = new Transaction("Withdrawal", amount);
        a.setBalance(a.getBalance() - t.getAmount());
        a.addTransaction(t);
        
        amount = 1000 * rand.nextDouble();
        t = new Transaction("Deposit", amount);
        a.setBalance(a.getBalance() + t.getAmount());
        a.addTransaction(t);
        
    }
}
