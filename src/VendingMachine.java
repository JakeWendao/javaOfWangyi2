import java.util.Scanner;

public class VendingMachine{
    int price;
    int balance;
    int total;

    void showPrompt(){
        System.out.println("Welcome!");
    }
    void insertMoney(int amount){
        balance = balance + amount;
    }
    void showBalance(){
        System.out.println(balance);
    }
    void getFood(){
        if (balance >= price){
            System.out.println("Here you are.");
            balance = balance - price;
            total = total + price;
        }
    }
    public static void main(String[] args) {
        VendingMachine v = new VendingMachine();
        v.showBalance();
        v.showPrompt();
        v.insertMoney(250);
        v.getFood();

    }
}




