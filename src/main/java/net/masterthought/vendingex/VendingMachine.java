package net.masterthought.vendingex;

public class VendingMachine {

    private int stock = 0;
    private int insertedMoney = 0;

    public void insert(int correctMoney) {
       insertedMoney+= correctMoney;
    }

    public void requestChocolate() {
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
