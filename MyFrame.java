import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener {
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;

    private JLabel age;
    private JTextField tage;

    private JLabel email;
    private JTextField temail;
   

    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JLabel dob;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JLabel add;
    private JTextArea tadd;
    
    private JCheckBox terms;
    private JButton submit;
    private JButton reset;
    private JLabel resadd;

    private String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
    private String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
    private String years[] = { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" };
    public MyFrame() {
        c = getContentPane();
        c.setLayout(null);
        setTitle("Registration Form");
        setBounds(300, 90, 700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setSize(300, 30);
        title.setLocation(250, 30);
        c.add(title);
        
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
        
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
        
        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setSize(100, 20);
        email.setLocation(100, 150);
        c.add(email);
        
        temail = new JTextField();
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(190, 20);
        temail.setLocation(200, 150);
        c.add(temail);
        
        age = new JLabel("Age");
        age.setFont(new Font("Arial", Font.PLAIN, 20));
        age.setSize(100, 20);
        age.setLocation(100, 200);
        c.add(age);
        
        tage = new JTextField();
        tage.setFont(new Font("Arial", Font.PLAIN, 15));
        tage.setSize(190, 20);
        tage.setLocation(200, 200);
        c.add(tage);

              


        


        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 250);
        c.add(gender);
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSize(100, 20);
        male.setLocation(200, 250);
        c.add(male);
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSize(100, 20);
        female.setLocation(300, 250);
        c.add(female);
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
        dob = new JLabel("Date of Birth");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 300);
        c.add(dob);
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 300);
        c.add(date);
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(100, 20);
        month.setLocation(250, 300);
        c.add(month);
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(70, 20);
        year.setLocation(350, 300);
        c.add(year);
        add = new JLabel("Address");
        add.setFont(new Font("Arial", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 350);
        c.add(add);
        tadd = new JTextArea(10,20);
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(190, 60);
        tadd.setLocation(200, 350);
        c.add(tadd);
        terms = new JCheckBox("I agree to the terms and conditions");
        terms.setFont(new Font("Arial", Font.PLAIN, 15));
        terms.setSize(300, 20);
        terms.setLocation(100, 420);
        c.add(terms);
        submit = new JButton("Submit");
        submit.setFont(new Font("Arial", Font.PLAIN, 15));
        submit.setSize(100, 30);
        submit.setLocation(150, 460);
        c.add(submit);
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 30);
        reset.setLocation(270, 460);
        c.add(reset);
        resadd = new JLabel("");
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(400, 30);
        resadd.setLocation(100, 500);
        c.add(resadd);
        submit.addActionListener(this);
        reset.addActionListener(this);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == submit)

        {
                    
            String data = "Name: " + tname.getText() + ",Age:" +tage.getText()+",Email: " + temail.getText() 
            + ", Gender: " + (male.isSelected() ? "Male" : "Female") + ", Date of Birth: " + date.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem()
            + ", Address: " + tadd.getText();
            resadd.setText(data);


            

            
                


            }
            System.out.println("it is a eliglible");
           
            
            

        }
      
            public static void main(String[] args)
        {
            new MyFrame();

            
        

        }
        
    }

        
    

    
        