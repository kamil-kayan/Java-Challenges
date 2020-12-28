import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

        //ArrayList for Creating New Albums;
    private static final ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album cami = new Album("CAMILA", "Camila Cabello");

        cami.addSong("Havana");
        cami.addSong("Into it");
        cami.addSong("Real Friends");
        cami.addSong("Never Be The Same");
        cami.addSong("Consequences");
        cami.addSong("She Loves Control");
        albums.add(cami);   //First Album (Camila)

        cami = new Album("ROMANCE", "Camila Cabello");
        cami.addSong("My oh My");
        cami.addSong("Senyorita");
        cami.addSong("Shameless");
        cami.addSong("Cry For Me");
        cami.addSong("Dream of you");
        cami.addSong("Feel it Twice");
        albums.add(cami);   //Second Album (Romance);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(1).addToPlaylist("Easy", playList);//Second album and adds "Easy" to the Playlist;
        albums.get(1).addToPlaylist("My oh My", playList);
        albums.get(1).addToPlaylist("Cry For Me", playList);
        albums.get(0).addToPlaylist("First Man", playList);
        albums.get(1).addToPlaylist("Easy", playList);
//        albums.add(new Album("My oh My", "Camila"));

        play(playList);
        play(albums);
    }
        public static void play(LinkedList<Song> playlist){

            ListIterator<Song> listIterator = playlist.listIterator();
            if (playlist.size() == 0){
                System.out.println("This Playlist doesn't Contain any Songs.");
            }else {
                System.out.println("Now Playing: "+listIterator.next().toString());
            }

    }
    public static void play(ArrayList<Album> albumSongs){
        ListIterator<Album> li = albumSongs.listIterator();
        if (albumSongs.size() == 0){
            System.out.println("Album is Empty");
        }else {
            System.out.println("Now Playing: "+li.next().toString());
        }

    }

}
