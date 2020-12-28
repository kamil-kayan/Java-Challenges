
//  12/23/2020 Kamil:

import java.util.LinkedList;

public class Song {
    private String title;
    private double duration;
    private final LinkedList<String> playList;

    public Song(String title) {
        this("", 2.2);
    }

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
        this.playList = new LinkedList<>();
    }

    //Quick way to output the content of an actual Object;
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }

    //Method to add Songs; This means They Don't belong to any Album, yet.
 /*   public boolean addSong(String name) {
        String song = findSong(name);
        if (song == null){
            playList.add(name);
            return true;
        }
        return false;
    }*/


        //A method that check id a song is in the List, returns null if not.
    public String findSong (String song){
        for (String found: playList){
            if (found.contains(song)){
                return found;
            }
        }
        return null;

    }

    public String getTitle() {
        return title;
    }
}
