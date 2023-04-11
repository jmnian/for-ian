package vending;

import java.util.List;

public class VendingMachine {
    private double money;
    private List<Item> storage;

    public VendingMachine(double money) {
        this.money = money;
        System.out.println("You just created a VendingMachine");
    }




    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
