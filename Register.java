import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Register extends JFrame implements ActionListener
{
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel age;
    private JTextField tage;

    
    private JLabel email;
    private JTextField temail;
  
    private JLabel address;
    private JTextField taddress;
    private JCheckBox terms;
    private JButton submit;
    public Register()
    {
        
        setTitle("Register Form");
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        c = getContentPane();
        c.setLayout(null);
        title= new JLabel("Register Form");
        title.setFont(new Font("Arial",Font.BOLD,16));
        title.setBounds(130,20,200,30);
        c.add(title);
        name= new JLabel("Name:");
        name.setFont(new Font("Arial",Font.BOLD,18));
        name.setBounds(50,80,100,30);
        c.add(name);
        tname=new JTextField();
        tname.setFont(new Font("Arial",Font.BOLD,18));
        tname.setBounds(150,80,180,30);
        c.add(tname);
        age = new JLabel("Age:");
        age.setFont(new Font("Arial",Font.BOLD,20));
        age.setBounds(50,130,100,30);
        c.add(age);

        tage= new JTextField();
        tage.setFont(new Font("Arial",Font.BOLD,16));
        tage.setBounds(150,130,180,30);
        c.add(tage);

       

      

        email=new JLabel("Email:");
        email.setFont(new Font("Arial",Font.BOLD,20));
        email.setBounds(50,180,100,30);
        c.add(email);
        temail=new JTextField();
        temail.setFont(new Font("Arial",Font.BOLD,18));
        temail.setBounds(150,180,180,30);
        c.add(temail);
        
         address=new JLabel("Address:");
        address.setFont(new Font("Arial",Font.BOLD,20));
        address.setBounds(50,230,100,30);
        c.add(address);
        taddress=new JTextField();
        taddress.setFont(new Font("Arial",Font.BOLD,16));
        taddress.setBounds(150,230,180,60);
        c.add(taddress);
   
        terms= new JCheckBox("Terms and Condition");
        terms.setFont(new Font("Arial",Font.BOLD,16));
        terms.setBounds(50,310,250,30);
        
        c.add(terms);
        submit=new JButton("Submit");
        submit.setFont(new Font("Arial",Font.BOLD,   16));
        submit.setBounds(150,360,100,30);
        submit.addActionListener(this);
        c.add(submit);
        setVisible(true);



    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String name = tname.getText();
            String age = new String(tage.getText());
            String email = temail.getText();
            
        
            
            if (!terms.isSelected()) {
                JOptionPane.showMessageDialog(this, "You must agree to terms and conditions!");
                return;
            }
         
           
            
            // Display collected data (in real app, you'd verify credentials)
            String data = "Name: " + name + "\nAge: " + age + "\nEmail: " + email;
            
            
            JOptionPane.showMessageDialog(this, "Register Form:\n" + data);
            
        }
    }
    public static void main(String[] args) {
        // Use SwingUtilities to ensure thread safety
        SwingUtilities.invokeLater(() -> new Register());
        
    }
}