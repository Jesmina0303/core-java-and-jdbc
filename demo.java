import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Register extends JFrame implements ActionListener {
    private Container c;
    private JLabel title, name, age, email, address;
    private JTextField tname, tage, temail;
    private JTextArea taddress;
    private JCheckBox terms;
    private JButton submit;

    public Register() {
        setTitle("Register Form");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Register Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(130, 20, 200, 30);
        c.add(title);

        name = new JLabel("Name:");
        name.setFont(new Font("Arial", Font.PLAIN, 16));
        name.setBounds(50, 80, 100, 30);
        c.add(name);

        tname = new JTextField();
        tname.setBounds(150, 80, 180, 30);
        c.add(tname);

        age = new JLabel("Age:");
        age.setFont(new Font("Arial", Font.PLAIN, 16));
        age.setBounds(50, 130, 100, 30);
        c.add(age);

        tage = new JTextField();
        tage.setBounds(150, 130, 180, 30);
        c.add(tage);

        email = new JLabel("Email:");
        email.setFont(new Font("Arial", Font.PLAIN, 16));
        email.setBounds(50, 180, 100, 30);
        c.add(email);

        temail = new JTextField();
        temail.setBounds(150, 180, 180, 30);
        c.add(temail);

        address = new JLabel("Address:");
        address.setFont(new Font("Arial", Font.PLAIN, 16));
        address.setBounds(50, 230, 100, 30);
        c.add(address);

        taddress = new JTextArea();
        taddress.setBounds(150, 230, 180, 60);
        taddress.setLineWrap(true);
        c.add(taddress);

        terms = new JCheckBox("Accept terms and conditions");
        terms.setBounds(50, 310, 250, 30);
        c.add(terms);

        submit = new JButton("Submit");
        submit.setBounds(150, 360, 100, 30);
        submit.addActionListener(this);
        c.add(submit);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String name = tname.getText();
            String age = tage.getText();
            String email = temail.getText();
            String address = taddress.getText();

            if (!terms.isSelected()) {
                JOptionPane.showMessageDialog(this, "Please accept the terms and conditions.");
                return;
            }

            String data = "Name: " + name + "\nAge: " + age + "\nEmail: " + email + "\nAddress: " + address;
            JOptionPane.showMessageDialog(this, "Registered Successfully:\n\n" + data);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Register());
    }
}
