
/**
 * Write a description of class v3 here.
 *
 * @author (bear)
 * @version ( version 3)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class v3 extends JFrame implements ActionListener
{

    public void actionPerformed(ActionEvent e){
    
        String cmd=e.getActionCommand();
        System.out.print("mmmmmmmmmmmm mmmmmmmmmmmm mmmmmmmmmm mmmmmmmmm out of paper");
        
    };
   
    public v3 ()
    {
        // initialise instance variables
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;
        
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        menu = new JMenu("system");
        
        menuBar.add(menu);
        menuItem=new JMenuItem("print");
        menuItem.addActionListener(this);
        menu.add(menuItem);
        setTitle("veiw");
        this.getContentPane().setPreferredSize(new Dimension(500,700)); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack(); 
        this.toFront();
        this.setVisible(true);
          

  
        }
}
