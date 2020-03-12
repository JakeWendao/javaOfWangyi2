package clock;

import java.util.ArrayList;
import java.util.HashSet;

public class Notebook {
    private ArrayList<String> arr = new ArrayList<String>();
    public void add(String str){
        arr.add(str);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("first");
        set.add("1");
        set.add("first");
        for (String s: set){
            System.out.println(s);
        }

    }
}
