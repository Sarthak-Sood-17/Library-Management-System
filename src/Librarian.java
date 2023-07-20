import java.util.HashMap;
import java.util.HashSet;

public class Librarian {

    HashMap<Integer, Books> mapIdBooks = new HashMap<>();
    HashMap<Integer, DVDs> mapIdDvds = new HashMap<>();

    public void addBooks(String title, String genre, int id, String author, int noOfPages)
    {
        Books book = new Books(title, genre, id, author, noOfPages);

        mapIdBooks.put(id, book);
    }

    public void removeBooks(int id)
    {
        mapIdBooks.remove(id);

        System.out.println("Removed Book with id : "+id);
    }

    public void updateTitleBooks(int id, String title)
    {
        Books book = mapIdBooks.get(id);

        book.updateTitle(title);
    }

    public void updateGenreBooks(int id, String genre)
    {
        Books book = mapIdBooks.get(id);

        book.updateGenre(genre);
    }

    public void updateIdBooks(int id, int nId)
    {
        Books book = mapIdBooks.get(id);

        book.updateId(nId);

        mapIdBooks.remove(id);

        mapIdBooks.put(nId, book);
    }

    public void updateAuthor(int id, String author)
    {
        Books book = mapIdBooks.get(id);

        book.updateAuthor(author);
    }

    public void updateNoOfPages(int id, int noOfPages)
    {
        Books book = mapIdBooks.get(id);

        book.updateNoOfPages(noOfPages);
    }


    public void addDvd(String title, String genre, int id, String artist, String duration)
    {
        DVDs dvd = new DVDs(title, genre, id, artist, duration);

        mapIdDvds.put(id, dvd);
    }

    public void removeDvd(int id)
    {
        mapIdDvds.remove(id);
    }

    public void updateTitleDvds(int id, String title)
    {
        DVDs dvd = mapIdDvds.get(id);

        dvd.updateTitle(title);
    }

    public void updateGenreDvds(int id, String genre)
    {
        DVDs dvd = mapIdDvds.get(id);

        dvd.updateGenre(genre);
    }

    public void updateIdDvds(int id, int nId)
    {
        DVDs dvd = mapIdDvds.get(id);

        dvd.updateId(nId);

        mapIdDvds.remove(id);

        mapIdDvds.put(nId, dvd);
    }

    public void updateArtist(int id, String author)
    {
        DVDs dvd = mapIdDvds.get(id);

        dvd.updateArtist(author);
    }

    public void updateDuration(int id, String duration)
    {
        DVDs dvd = mapIdDvds.get(id);

        dvd.updateDuration(duration);
    }

    public void printDetailsBooks(int id)
    {
        Items item = mapIdBooks.get(id);

        item.printDetails();
    }

    public void printDetailsDvds(int id)
    {
        Items item = mapIdDvds.get(id);

        item.printDetails();
    }

    public static void main(String[] args)
    {
        Librarian librarian = new Librarian();

        librarian.addBooks("Gulliver's Travel", "Adventure, Fiction", 1, "Jonathan Swift", 200);
        librarian.addDvd("Harry Potter", "Fiction, Magic, Adventure", 2, "J.K. Rowling", "2:30:00");

        librarian.printDetailsBooks(1);
        librarian.printDetailsDvds(2);

        librarian.printDetailsBooks(1);
        librarian.removeBooks(1);
    }
}
