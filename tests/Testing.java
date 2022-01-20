

/*
This class is solely used for testing the program, and is not part of the submission
I use this class to generate random input strings and put it into a CSV file and test if the
program outputs the correct result based on the input
 */

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Testing
{
    private static Map<String,Integer> map=new HashMap<>();
    public static void main(String[]args)
    {
        try(PrintWriter writer=new PrintWriter(new FileWriter("example.csv")))
        {
            for(int i=0;i<=200;i++)
            {
                StringBuilder s=new StringBuilder();
                s.append(generateInput());
                s.append("\n");
                writer.write(s.toString());
            }

        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(map);

    }

    public static String generateInput()
    {
        String[]authors={"Steven King","Rudyard Kipling","Isaac Asimov","Suzanne Collins"};
        int index= ThreadLocalRandom.current().nextInt(0,3+1);
        String author=authors[index];
        verifyAuthor(author);
        int pages=ThreadLocalRandom.current().nextInt(100,900+1); // pages between 100 and 900 inclusive

        int y=ThreadLocalRandom.current().nextInt(1900,1990);
        int m=ThreadLocalRandom.current().nextInt(1,12+1);
        int d=ThreadLocalRandom.current().nextInt(1,28+1);
        String date=formatDate(y,m,d);

        // generate random title
        int left=97;
        int right=122;
        int length=10;
        Random random=new Random();
        String title=random.ints(left,right+1)
                .limit(length)
                .collect(StringBuilder::new,StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
        String input=title+","+date+","+author+","+pages;
        return input;
    }

    private static String formatDate(int y,int m, int d)
    {
        String month;
        String day;
        String date;
        if(m<10)
            month="0"+m;
        else
            month=""+m;
        if(d<10)
            day="0"+d;
        else
            day=""+d;
        date=month+"/"+day+"/"+y;
        return date;
    }

    private static void verifyAuthor(String author)
    {
        if(map.containsKey(author))
            map.replace(author,map.get(author)+1);
        else
            map.put(author,1);
    }



}
