package vending;

public class Main {
    public static void main(String[] args) {
        Item coke = new Item("coke", 1.5, 10);
        coke.printInfo();

        VendingMachine vm = new VendingMachine(50);
        vm.restock(coke);
    }
}
