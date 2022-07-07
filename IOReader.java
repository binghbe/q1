
/**
 *
 * @author bear
 * @version 21/6/22
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class IOReader
{
    final String FILENAME="arrivals.csv";
    final int MAXLINES=100;
    final int VALUESPERLINE=4;
    
    public IOReader()
    {
       File thefile = new File(FILENAME);
       String CSVlines[] = new String[MAXLINES];
       String AllLinesAllElements[][]= new String[MAXLINES][VALUESPERLINE];
       int lineCount=0;
      try {
           Scanner reader = new Scanner(thefile);
        while (reader .hasNextLine() && lineCount < MAXLINES){
               String line = reader .nextLine();
               CSVlines[lineCount]=line;
               lineCount++;
            
            
            }
        for (int i =0; i<lineCount; i++)
                System.out.println(CSVlines[i]);
        for (int i =0; i<lineCount; i++){
           String values[] = CSVlines[i].split(",");
           for (int j =0; j< values.length;j++)
               System.out.print(values[j]+"****");      
           System.out.println("");
           for (int j=0; j< values.length;j++)
                AllLinesAllElements[i][j]=values[j];
                
        }
        } catch (IOException e) {System.out.println(e);}
      System.out.println("the first columm read");
      for (int i=0;i<lineCount;i++)
            System.out.println(AllLinesAllElements[i][0]);
      for (int i=0;i<lineCount;i++)
            System.out.println("at"+AllLinesAllElements[i][0]+"   "+AllLinesAllElements[i][2]+" arrived");
        }
    }


