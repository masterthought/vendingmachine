package net.masterthought.vendingex;

public class VendingMachine {

    private int stock = 0;

    public VendingMachine () {
      // This is a constructor and allows you to explain any special steps required in creating instances of this class.
      // You don't actually need the default one if it doesn't do anything
    }
    
    public void insert(int correctMoney) {
    }

    public void requestChocolate() {
      
    }

    public int requestCoinReturn() {
      return 0;
    }

    public void stockUpWith(int numberOfChocolates) {
      stock = numberOfChocolates;
    }

    public int takeInventory() {
      return stock;
    }
}
