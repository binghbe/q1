/**
 *
 * @author bear
 * @version 21/6/22
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class maincode
{
    final String FILENAME="arrivals.csv";
    final int MAXLINES=100;
    final int VALUESPERLINE=4;
    Queue cafe;
    public maincode()
    {
        File thefile = new File(FILENAME);
        String CSVlines[] = new String[MAXLINES];
        String AllLinesAllElements[][]= new String[MAXLINES][VALUESPERLINE];
        int lineCount=0;
        cafe = new Queue();
        try {
            Scanner reader = new Scanner(thefile);
            reader .nextLine();//get rider of the tittel line
            while (reader .hasNextLine() && lineCount < MAXLINES){
                String line = reader .nextLine();
                CSVlines[lineCount]=line;
                lineCount++;
            }

            for (int i =0; i<lineCount; i++){
                String values[] = CSVlines[i].split(",");
                
                for (int j=0; j< values.length;j++)
                    AllLinesAllElements[i][j]=values[j];
                int time=Integer.parseInt(AllLinesAllElements[i][0]);
                System.out.println("time "+time);
                int students=Integer.parseInt(AllLinesAllElements[i][1]);
                System.out.println("coming students "+students);
                for (int st=0; st< students;st++){
                    Element nextArrivel = new Element (true,time);
                    cafe.enqueue(nextArrivel);
                }
                int teachers=Integer.parseInt(AllLinesAllElements[i][2]);
                System.out.println("coming teachers "+teachers);
                for (int TC=0; TC< teachers;TC++){
                    Element nextArrivel = new Element (true,time);
                    cafe.enqueue(nextArrivel);
                }
                int served=Integer.parseInt(AllLinesAllElements[i][3]);
                System.out.println("served "+served);
                int maths=students + teachers;
                
                System.out.println("maths "+maths);
            }
            
        } catch (IOException e) {System.out.println(e);}
    }
}