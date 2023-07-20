import java.util.HashSet;

public abstract class Items {

    String title;
    String genre;
    int id;

    public abstract void printDetails();
    public abstract void updateTitle(String title);
    public abstract void updateGenre(String genre);
    public abstract void updateId(int id);
}
