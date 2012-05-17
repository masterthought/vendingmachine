package net.masterthought.vendingex;

public class VendingMachine {

    private int stock = 0;
    private int insertedMoney = 0;

    public VendingMachine () {
      // This is a constructor and allows you to explain any special steps required in creating instances of this class.
      // You don't actually need the default one if it doesn't do anything
    }
    
    public void insert(int correctMoney) {
       insertedMoney+= correctMoney;
    }

    public String requestChocolate() {
      return "Chocolate";
    }

    public int requestCoinReturn() {
      int refundedMoney = insertedMoney;
      insertedMoney = 0;
      
      return refundedMoney;
    }

    public void stockUpWith(int numberOfChocolates) {
      stock = numberOfChocolates;
    }

    public int takeInventory() {
      return stock;
    }
}
