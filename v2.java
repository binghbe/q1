
/**
 * Write a description of class v2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
public class v2 extends JFrame
{


    /**
     * Constructor for objects of class v2
     */
    public v2()
    {
        // initialise instance variables
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
        
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        menu = new JMenu("a menu");
        menuBar.add(menu);
        menuItem=new JMenuItem("frist menu item");
        
        menu.add(menuItem);
        setTitle("veiw");
        this.getContentPane().setPreferredSize(new Dimension(500,700)); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack(); 
        this.toFront();
        this.setVisible(true);
          

  
        }
}
