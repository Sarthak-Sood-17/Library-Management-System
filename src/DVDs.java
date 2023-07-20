import java.util.HashSet;

public class DVDs extends Items {

    String artist;
    String duration;

    DVDs(String title, String genre, int id, String artist, String duration) {
        this.title = title;
        this.genre = genre;
        this.id = id;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void updateTitle(String title) {
        this.title=title;
    }

    @Override
    public void updateGenre(String genre) {
        this.genre=genre;
    }

    @Override
    public void updateId(int id) {
        this.id=id;
    }

    public void updateArtist(String artist)
    {
        this.artist=artist;
    }

    public void updateDuration(String duration)
    {
        this.duration=duration;
    }

    @Override
    public void printDetails() {
        System.out.println("DVD");
        System.out.println("Title : "+title);
        System.out.println("Author : "+artist);
        System.out.println("Genre : "+genre);
        System.out.println("No of Pages : "+duration);
    }
}
