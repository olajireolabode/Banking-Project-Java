/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;

/**
 *
 * @author 2135504
 */
public class UserInputManager {
    
    
    
    public static int retrieveAccountNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Account Number: ");
        
        return sc.nextInt();
        
    }
    
    public static Account retrieveAccountType(){
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the number associated with your desired Account Type : \n [1] Savings \n [2] Checking");
        int accountType = sc.nextInt();
        if (accountType == 1) {
            return new SavingsAccount();
        }
        else if (accountType == 2) {
            return new CheckingAccount();
        }
        return retrieveAccountType();
        
    }
    
    public static int retrieveClientId(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your Client ID: ");
        
        return sc.nextInt();
        
    }
    
    public static Client retrieveClientInfo(){
        Client client = new Client();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your first name: ");
        String firstName = sc.nextLine();
        client.setFirstName(firstName);
        
        System.out.print("Please enter your last name: ");
        String lastName = sc.nextLine();
        client.setLastName(lastName);
        
        return client;
        
    }
    
    public static double retrieveTransactionAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Amount of Transaction: ");
        
        return sc.nextDouble();
        
    }
    
    public static int retrieveUserOption(){       
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number associated with your desired operation: \n 1) Add a new Client \n 2) Create a new Account \n 3) Make a deposit \n 4) Make a withdrawal \n 5) List Account Transactions \n 6) List Clients \n 7) List Client Accounts \n 0) Exit the application");
        
        return sc.nextInt();
        
    }
  
    
}


