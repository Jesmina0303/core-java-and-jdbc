import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.Container;
import javax.swing.JButton;

public class tutorial extends JFrame{
   
    public tutorial()
    {
       
      

        JFrame frame=new JFrame();

        frame.setBounds(0,0, 800, 500);
        frame.setLocationRelativeTo(null);
        Container content=new Container();
        content.setLayout(null);
        Container c=frame.getContentPane();

        c.setLayout(null);
        c.setBackground(java.awt.Color.LIGHT_GRAY);
        frame.setTitle("GridLayout Example");
        frame.setResizable(false);
        GridLayout grid=new GridLayout();
       
        c.setLayout(grid);
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");
        JButton btn3 = new JButton("Button 3");
        JButton btn4 = new JButton("Button 4");
        JButton btn5 = new JButton("Button 5");
        JButton btn6 = new JButton("Button 6");
      
        
      
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
      

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
          
       

       
    }

          public static void main(String args[]){
            new tutorial();
          }
       
        }


  
        


    
    


        