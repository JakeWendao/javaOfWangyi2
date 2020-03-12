package clock;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Database {
    private ArrayList<CD> cdlist = new ArrayList<CD>();

    public void add(CD cd){
        cdlist.add(cd);
    }
    public void list(){
        for (CD cd:cdlist){
            cd.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("Study","jake",20,150,"1;2;3;4;come"));
        db.add(new CD("nw","jake",20,150,"1;2;3;4;come"));
        db.list();

    }
}
