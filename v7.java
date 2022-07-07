
/**
 * Write a description of class v7 here.
 *
 * @author (bear)
 * @version ( version 4)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class v7 extends JFrame implements ActionListener
{

    
      public v7 ()
    {
        // initialise instance variables
        JMenuBar menuBar;
        JMenu menu;
        
        
        JMenuItem menuItem;
        
        menuBar=new JMenuBar();
        this.setJMenuBar(menuBar);
        
        
        menu = new JMenu("file");
        
        
        menuBar.add(menu);
        menuItem=new JMenuItem("open");
        menuItem.addActionListener(this);
        menuItem.setAccelerator(KeyStroke.getKeyStroke('o'));
        menu.add(menuItem);
        
        menuItem=new JMenuItem("print");
        menuItem.addActionListener(this);
        menuItem.setAccelerator(KeyStroke.getKeyStroke('p'));
        menu.add(menuItem);
        
        menuItem=new JMenuItem("exit");
        menuItem.addActionListener(this);
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ESCAPE"));
        menu.add(menuItem);
        
        
        
        setTitle("system");
        this.getContentPane().setPreferredSize(new Dimension(300,30)); 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack(); 
        this.toFront();
        this.setVisible(true);
          

  
      }
      public void actionPerformed(ActionEvent event){
        
        String cmd=event.getActionCommand();
        Scanner reader = new Scanner(System.in);
        System.out.println('\u000c');
        
        switch (cmd)
        {
            case "print" :System.out.println(" out of paper");
                break;
            case "open" :System.out.println("files are corpted");
                break;
            case "exit" :System.exit(0);
                        
                break;    
            default : System.out.println("mmmm m m m m ");
                
        }
        
       }
    
    
}

