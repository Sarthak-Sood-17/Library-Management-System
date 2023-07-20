import java.util.HashSet;

public class Books extends Items{

    String author;
    int noOfPages;

    Books(String title, String genre, int id, String author, int noOfPages) {
        this.title = title;
        this.genre = genre;
        this.id = id;
        this.author = author;
        this.noOfPages = noOfPages;
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

    public void updateAuthor(String author)
    {
        this.author=author;
    }

    public void updateNoOfPages(int noOfPages)
    {
        this.noOfPages=noOfPages;
    }

    @Override
    public void printDetails() {
        System.out.println("Book");
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Genre : "+genre);
        System.out.println("No of Pages : "+noOfPages);
    }

}
