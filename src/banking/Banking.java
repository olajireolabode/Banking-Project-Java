/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;


/**
 *
 * @author 2135504
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bank td = new Bank();
        //Setup.run(td);
        System.out.println(Colors.ANSI_GREEN +"Welcome To TD Bank" + Colors.ANSI_RESET);
        int option;
        
        do{
            option = UserInputManager.retrieveUserOption();
            switch(option){
                case 1:
                    addNewClient(td);
                    break;
                case 2:
                    addNewAccount(td);
                    break;
                case 3:
                    executeTransaction(td, option);
                    break;
                case 4:
                    executeTransaction(td, option);
                    break;
                case 5:
                    int c = UserInputManager.retrieveClientId();
                    int accNum = UserInputManager.retrieveAccountNumber();
                    Account acc = td.getClientAccount(c, accNum);
                    acc.displayAllTransactions();                    
                    break;
                case 6:
                    td.displayClientList();
                    break;
                case 7:
                    int cId = UserInputManager.retrieveClientId();
                    td.displayClientAccounts(cId);
                    break;
            }
        }
        while(option != 0);
        
    }
    
    private static void addNewClient(Bank bnk){
        Client c = UserInputManager.retrieveClientInfo();
        bnk.addClient(c);
        System.out.println(Colors.ANSI_GREEN +c+Colors.ANSI_RESET);
    }
    
    private static void addNewAccount(Bank bnk){
        int cId = UserInputManager.retrieveClientId();
        Client c = bnk.getClient(cId);
        if(c == null){
            System.out.println("Client does not exist");
            return;
        }
        else{
            Account acc = UserInputManager.retrieveAccountType();
            c.addAccount(acc);
        }
    }
    
    private static void executeTransaction(Bank bnk,int userOption){
        int cId = UserInputManager.retrieveClientId();
        int accNumber = UserInputManager.retrieveAccountNumber();
       
        Account a = bnk.getClientAccount(cId, accNumber);
        
        double amount = UserInputManager.retrieveTransactionAmount();
        if(userOption == 3){
            a.deposit(amount);
        }
        else if(userOption == 4){
            a.withdraw(amount);
        }
        
    }
}
