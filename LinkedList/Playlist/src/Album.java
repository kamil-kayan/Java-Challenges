import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.name+", "+ this.getSongs();
    }

    //Adding songs to the Album;
    public boolean addSong(String title){
        Song found = findSong(title);
        if (found == null){
            this.songs.add(new Song(title));
            return true;
        }
        else {
            System.out.println(title + " Already Exists.");
            return false;
        }
    }

        //Removing Songs from Album;
    public boolean removeSong(String name){
        Song found = findSong(name);
        if (found != null){
            songs.remove(found);
            return true;
        }
        else {
            System.out.println(name+" is not on the Album");
            return false;
        }
    }

        //Finding Songs Method;
    public Song findSong(String title){
        for (Song album : songs) {
            if (album.getTitle().equals(title)) {
                return album;
            }
        }
        return null;
    }

        //Adding songs to Playlist With as many albums as you want.
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber -1;
        if ((index >= 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This Album doesn't have a track "+trackNumber);
        return false;
    }

        //Overloading addToPlaylist () that accepts the song title;
    public void addToPlaylist(String title, LinkedList<Song> playList){
        Song check = findSong(title);
        if (check != null){
            playList.add(check);
        }else {
            System.out.println("The Song "+title+" is not in this Album");
        }

    }

    //Now we create and Add songs to the Playlist, The song has to already exist in the Album


    public ArrayList<Song> getSongs() {
        return this.songs;
    }
}



































