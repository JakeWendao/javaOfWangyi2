package clock;

import java.util.HashMap;
import java.util.Scanner;

public class Coin {
    private HashMap<Integer,String> coinnames = new HashMap<Integer, String>();

    public Coin(){
        coinnames.put(1,"jakee");
        coinnames.put(5,"rosee");
        coinnames.put(10,"michaell");
        coinnames.put(25,"gii");
        System.out.println("---------------");
        for (Integer k : coinnames.keySet()){
            System.out.println(coinnames.get(k));
        }

    }
    public String getName(int i){
        if (coinnames.containsKey(i)){
            return coinnames.get(i);
        }
        else
            return "NOt FOUND";

    }

    public static void main(String[] args) {
        System.out.println("输入你想换算的数字");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        Coin coin = new Coin();
        System.out.println(coin.getName(amount));

    }
}
