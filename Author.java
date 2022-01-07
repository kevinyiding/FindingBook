import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Author
{
    private final String name;
    private String genre;
    private final List<Book> list;


    public Author(String name)
    {
        this.name=name;
        assignGenre();
        list=new ArrayList<>();
    }

    private void assignGenre()
    {
        if(name.equals("Steven King"))
            genre="Horror";
        else if(name.equals("Rudyard Kipling"))
            genre="Adventure";
        else if(name.equals("Isaac Asimov"))
            genre="Science Fiction";
        else
            genre="YA Fiction";
    }

    public void addBook(Book book)
    {
        list.add(book);
    }

    public String getName()
    {
        return name;
    }

    public String getGenre()
    {
        return genre;
    }

    public Book getOldestBook()
    {
        list.sort(Collections.reverseOrder());
        return list.get(0);
    }

    public String toString()
    {
        return name;
    }


}
