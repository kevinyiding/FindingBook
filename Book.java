import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book implements Comparable<Book>
{
    private final String title;
    private final Author author;
    private final String publication;
    private int history; // number of days since published
    private final int pages;

    public Book(String title,Author author,String date,int pages)
    {
        this.title=title;
        this.author=author;
        this.publication =date;
        this.pages=pages;
        calculateHistory(date);
        author.addBook(this);
    }

    @Override
    public int compareTo(Book o)
    {
        return this.history-o.history;
    }

    private void calculateHistory(String date)
    {
        String[]arr=date.split("/");
        String born=arr[2]+"-"+arr[0]+"-"+arr[1];
        LocalDate birth=LocalDate.parse(born);
        LocalDate now=LocalDate.now();
        history=(int) ChronoUnit.DAYS.between(birth,now);
    }

    public String toString()
    {
        String output=title+", "+"written by "+author.getGenre()+
                " writer "+author.getName()+" on "+
                publication +" is "+pages+" pages long.";
        return output;
    }

}
