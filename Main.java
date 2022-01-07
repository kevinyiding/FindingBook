import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main
{
      // test it with manually typed inputs
//    public static void main(String[]args)
//    {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Number of inputs: ");
//        int N=Integer.parseInt(scanner.nextLine());
//        Library library=new Library();
//        for(int i=1;i<=N;i++)
//        {
//            String [] arr=scanner.nextLine().split(",");
//            library.updateLib(arr);
//        }
//        library.generateOutput();
//
//
//    }

    // test it with input CSV file

    public static void main(String[]args)
    {
        Library library=new Library();
        String path="/Users/KevinDing/IdeaProjects/Books/src/data/input.csv"; //change path name when needed
        String line="";
        try
        {
            BufferedReader reader=new BufferedReader(new FileReader(path));
            while((line=reader.readLine())!=null)
            {
                line=line.replaceAll("\"","");
                String [] arr=line.split(",");
                library.updateLibrary(arr);
            }
            library.generateOutput();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
