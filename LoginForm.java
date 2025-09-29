
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginForm extends JFrame implements ActionListener {
    private Container c;
    private JLabel title;
    private JLabel username;
    private JTextField tusername;
    private JLabel password;
    private JPasswordField tpassword; // Changed to JPasswordField
  
    private JLabel add;
    private JTextArea tadd;
    private JCheckBox terms;
    private JButton login;
    private JButton Submit;
    private JButton Register;
    

    public LoginForm() {
        
        setTitle("Login Form");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        c=  getContentPane();
        c.setLayout(null);
        
        

        
       
        // Title label
        title = new JLabel("Login Form");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setBounds(200, 30, 300, 40);
        c.add(title);

        // Username field
        username = new JLabel("Username:");
        username.setFont(new Font("Arial", Font.BOLD, 16));
        username.setBounds(100, 100, 150, 30);
        c.add(username);

        tusername = new JTextField();
        tusername.setBounds(250, 100, 250, 30);
        c.add(tusername);

        // Password field
        password = new JLabel("Password:");
        password.setFont(new Font("Arial", Font.BOLD, 16));
        password.setBounds(100, 150, 150, 30);
        c.add(password);

        tpassword = new JPasswordField(); // Secure password field
        tpassword.setBounds(250, 150, 250, 30);
        c.add(tpassword);

        // Address field
        add = new JLabel("Address:");
        add.setFont(new Font("Arial", Font.BOLD, 16));
        add.setBounds(100, 200, 150, 30);
        c.add(add);
       

        tadd = new JTextArea();
        
        tadd.setBounds(250,200,200,40);
        tadd.setLineWrap(true);//enable to wrapping
        
        c.add(tadd);
        
        // Terms checkbox
        terms = new JCheckBox("Agree to terms and conditions");
        terms.setFont(new Font("Arial", Font.PLAIN, 14));
        terms.setBounds(150, 300, 300, 30);
        c.add(terms);

        // Login button
        login = new JButton("Login");
        login.setFont(new Font("Arial", Font.BOLD, 16));
        login.setBounds(220, 350, 150, 40);
        login.addActionListener(this); // Register action listener
        c.add(login);

        Register=new JButton("Register");
        Register.setFont(new Font ("Arial",Font.BOLD,20));
        Register.setBounds(220,400,150,30);
        Register.addActionListener(e->{

        
        new Register();
         dispose();
        } );
        c.add(Register);
        
    
        


      setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {
            String user = tusername.getText();
            String pass = new String(tpassword.getPassword());
            String address = tadd.getText();
            
        
            
            if (!terms.isSelected()) {
                JOptionPane.showMessageDialog(this, "You must agree to terms and conditions!");
                return;
            }
         
           
            
            // Display collected data (in real app, you'd verify credentials)
            String data = "Username: " + user + "\nPassword: " + pass + "\nAddress: " + address;
            
            
            JOptionPane.showMessageDialog(this, "Login Details:\n" + data);
            
        }
    }
  

  public static void main(String []args){
    // Use SwingUtilities to ensure thread safety
        SwingUtilities.invokeLater(() -> new LoginForm());

  }
        
    
    

}