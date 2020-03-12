package castle;

import java.util.HashMap;

public class Room{
    private String description;
    private HashMap<String,Room> exits = new HashMap<String, Room>();

    public Room(String description){
        this.description = description;
    }
    public void setExit(String string,Room room){
        exits.put(string,room);
    }

    @Override
    public String toString() {
        return description;
    }
    public String getExitDesc(){
        StringBuffer sb = new StringBuffer();
        for (String string : exits.keySet()){
            sb.append(string);
            sb.append(" ");
        }
        return sb.toString();
    }
    public Room catchRoom(String direction){
        Room room = exits.get(direction);
        return room;
    }
}