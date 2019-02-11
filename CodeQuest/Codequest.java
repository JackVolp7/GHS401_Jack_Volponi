import java.io.*;

public class Codequest
{
    public static void main() throws Exception
    {
        File file=new File("Prob00.in.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String st= br.readLine(); //reads first line
        int cases= Integer.parseInt(st);
        
        for(int i=0;i<cases;i++)
        {
            String str=br.readLine();
            int linesPerCase=Integer.parseInt(str);
            for(int x=0; x<linesPerCase; x++)
            {
                String line=br.readLine();
                String[] tokens= line.split(", ");
                String fname = tokens[1];
                System.out.println(fname);
            }
        }
    }
}
