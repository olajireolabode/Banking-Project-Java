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
public class Bank {
    private String bankNumber;
    private String address;
    private ArrayList <Client> clientList;
    
    public Bank(){
        this.bankNumber = "";
        this.address = "";
        this.clientList = new ArrayList<Client>();
    }

    //getters and setters
    public String getBankNumber() {
        return this.bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Client> getClientList() {
        return this.clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    
    
    //methods
    public void addClient(Client c){
        this.clientList.add(c);
    }
    
    public void displayClientAccounts(int iD){
        for (Client client : clientList) {
            if(client.getClientId() == iD){
                client.displayAccounts();
            }  
        }
    }
    
    public Client getClient(int iD){
        for (Client client : clientList) {
            if (client.getClientId() == iD) {
                return client;
            }
        }
        
        return null;
        
    }
    
    public Account getClientAccount(int cId, int accNumber){
        for (Client client : clientList) {
            if(client.getClientId() == cId){
                Account acc = client.getAccount(accNumber);
                return acc;
            }
        }
        return null;
        
    }
    
    public void displayClientList(){
        for (Client client : clientList) {
            System.out.println(client);
        }
    }
    
    public void displayAllAccounts(){
        for (Client client : clientList) {
            client.displayAccounts();
        }
    }
    
    public void displayAllTransactions(){
        for (Client client : clientList) {
            client.displayAllTransactions();
        }
    }

    
}
