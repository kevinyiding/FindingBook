import java.util.HashMap;
import java.util.Map;

public class Library
{
    private final Map<String,Integer> publications; // match author with number of books published
    private final Map<String,Author> authors; // match author name with the actual author

    public Library()
    {
        publications =new HashMap<>();
        authors=new HashMap<>();
    }

    public void addAuthor(Author author)
    {
        if(publications.containsKey(author.getName()))
            publications.replace(author.getName(), publications.get(author.getName())+1);
        else
        {
            publications.put(author.getName(),1);
            authors.put(author.getName(),author);
        }

    }
    public Author getAuthorWithMostBooks()
    {
        String name="";
        int max=0;
        for(var entry: publications.entrySet())
            if(entry.getValue()>max)
            {
                max=entry.getValue();
                name=entry.getKey();
            }
        return authors.get(name) ;
    }

    public void updateLibrary(String[]arr)
    {
        String title=arr[0];
        String date=arr[1];
        String name=arr[2];
        int pages=Integer.parseInt(arr[3]);
        Author author=new Author(name);
        addAuthor(author);
        Book book;
        if(authors.containsKey(author.getName()))
            book=new Book(title,authors.get(author.getName()),date,pages);
        else
            book=new Book(title,author,date,pages);
    }

    public void generateOutput()
    {
        Author a= getAuthorWithMostBooks();
        Book b=a.getOldestBook();
        System.out.println(b);
    }
}
