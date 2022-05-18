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
public class Transaction {
    private String type;
    private double amount;

    public Transaction() {
        this.type = "";
        this.amount = 0.00;
    }
    
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString(){
        double amountRounded = Math.round(this.amount*100.00)/100.00;
      return "" + this.type + ": " + "$" + amountRounded;  
    }
}
