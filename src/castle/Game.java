package castle;

import java.util.Scanner;

public class Game{
    private Room currentRoom;

    public Game(){
        createRooms();
    }

    private void createRooms() {
        Room outside, lobby, pub, study, bedroom;

        outside = new Room("out of castle");
        lobby = new Room("datang");
        pub = new Room("small drink pub");
        study = new Room("room for study");
        bedroom = new Room("room for sleep");
        Room babyroom = new Room("a room for baby");

        outside.setExit("east",lobby);
        outside.setExit("south",study);
        outside.setExit("west",pub);
        lobby.setExit("west",outside);
        pub.setExit("east",outside);
        study.setExit("north",outside);
        study.setExit("east",bedroom);
        bedroom.setExit("west",study);
        bedroom.setExit("up",babyroom);
        babyroom.setExit("down",bedroom);

        currentRoom = outside;
//
    }
    private void printWelcome(){
        System.out.println();
        System.out.println("Welcome to the castle.");
        System.out.println("This is a borring game!");
        System.out.println("If you need help, please input 'help'.");
        System.out.println();
        showPrompt();

    }
    private void showPrompt(){
        System.out.println("Now you are in "+currentRoom);
        System.out.println("The outdoor have:");
        System.out.println(currentRoom.getExitDesc());
    }

    private void printHelp(){
        System.out.println("Are you lost? Here are command you can do: go bye help");
        System.out.println("For example: \tgo east");
    }

    private void goRoom(String direction){
        Room nextRoom = null;
        nextRoom = currentRoom.catchRoom(direction);
        if (nextRoom == null){
            System.out.println("Nothing there.");
        }
        else {
            currentRoom = nextRoom;
            showPrompt();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game game = new Game();
        game.printWelcome();
        while (true){
            String line = in.nextLine();
            String[] words = line.split(" ");
            if (words[0].equals("help")){
                game.printHelp();
            }else if (words[0].equals("go")){
                game.goRoom(words[1]);
            }else if (words[0].equals("bye")){
                break;
            }

        }
        System.out.println("Thank you for your coming. Good Bye!");
        in.close();
    }
}