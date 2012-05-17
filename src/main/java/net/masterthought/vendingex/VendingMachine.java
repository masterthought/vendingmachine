package net.masterthought.vendingex;

public class VendingMachine {

    private int stock = 0;

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
