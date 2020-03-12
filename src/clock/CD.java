package clock;

public class CD {
    private String title;
    private String artist;
    private int numofTracks;
    private int playingTime;
    private boolean gotIt;
    private String comment;

    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        this.title = title;
        this.artist = artist;
        this.numofTracks = numofTracks;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public static void main(String[] args) {

    }

    public void print() {
        System.out.println(title+":"+artist);
    }
}
