import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class form extends JFrame implements ActionListener {
    private JTextField nameField;
    private JTextField emailField;
    private JTextField amountField;
    private JButton submitButton;

    public form() {
        setTitle("Shopping Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container content= new Container();
        content.setLayout(new FlowLayout());
        content.setBounds(0,0,400,300);
        content.setBackground(Color.LIGHT_GRAY);
        setContentPane(content);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel amountLabel = new JLabel("Amount:");
        JTextField amountField = new JTextField();
        amountField.setEditable(false);
        submitButton = new JButton("Submit");

        submitButton.addActionListener(this);
        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(e -> System.exit(0));

        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(submitButton);
        add(amountLabel);
        add(amountField);


        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String amount = amountField.getText();

            // Here you can add code to process the form data
            JOptionPane.showMessageDialog(this, "Name: " + name + "\nEmail: " + email + "\nAmount: " + amount);
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new form());
    }}
        