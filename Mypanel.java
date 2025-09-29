import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Mypanel extends JFrame {
   public Mypanel()
   {
    setLayout(new FlowLayout());
    setPreferredSize(getPreferredSize());
    setLayout(new FlowLayout());
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    

        // JLabel
        JLabel label = new JLabel("Enter Name:");
        JLabel label2= new JLabel("Enter Email:");
        JLabel label3= new JLabel("Enter Mobile No:");
        JLabel label4=new JLabel("Enter gender:");
        JLabel label5=new JLabel("Enter Address:");
        add(label4);
        add(label5);

        add(label);

        // JTextField
        JTextField textField = new JTextField(15);
        JTextField textField2 = new JTextField(10);
        JTextField textField3 = new JTextField(20);
        JTextField textField4 = new JTextField(10);
        JTextField textField5 = new JTextField(20);
        add(textField);
        add(textField2);
        add(textField3);
        add(textField4);
        add(textField5);

        // JCheckBox
        JCheckBox checkBox = new JCheckBox("Accept Terms");
        checkBox.setSelected(true);
        checkBox.setFont(new Font("Arial", Font.PLAIN, 14));
        checkBox.setForeground(Color.BLUE);
        add(checkBox);
        // JComboBox
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setSelectedIndex(0);
        comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        comboBox.setForeground(Color.RED);
        add(comboBox);
        // JRadioButton
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        add(radioButton1);
        add(radioButton2);
        // JPasswordField
        JPasswordField passwordField = new JPasswordField(15);
        passwordField.setEchoChar('*');
        passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
        passwordField.setForeground(Color.GREEN);
        add(passwordField);
        // JSpinner
        SpinnerModel spinnerModel = new SpinnerNumberModel(1, 1, 10, 1);
        JSpinner spinner = new JSpinner(spinnerModel);
        spinner.setFont(new Font("Arial", Font.PLAIN, 14));
        spinner.setForeground(Color.MAGENTA);
        add(spinner);
        // JToggleButton
        JToggleButton toggleButton = new JToggleButton("Toggle Me");
        toggleButton.setFont(new Font("Arial", Font.PLAIN, 14));
        toggleButton.setForeground(Color.ORANGE);
        add(toggleButton);

        // JTextArea with ScrollPane
        JTextArea textArea = new JTextArea(5, 20);
        JScrollPane textScrollPane = new JScrollPane(textArea);
        add(textScrollPane);
     // JButton with Action
        JButton button = new JButton("Show Message");
        add(button);

        button.addActionListener(e -> {
            String name = textField.getText();
            boolean accepted = checkBox.isSelected();
            JOptionPane.showMessageDialog(this,
                "Name: " + name + "\nAccepted: " + accepted,
                "Info", JOptionPane.INFORMATION_MESSAGE);
        });

        // JTable
        String[] columns = {"ID", "Name"};
        String[][] data = {
            {"1", "Jesmina"},
            {"2", "Bob"}
        };
        JTable table = new JTable(new DefaultTableModel(data, columns));
        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setPreferredSize(new Dimension(200, 70));
        add(tableScrollPane);

        // JList
        String[] fruits = {"Apple", "Banana", "Cherry"};
        JList<String> fruitList = new JList<>(fruits);
        JScrollPane listScrollPane = new JScrollPane(fruitList);
        listScrollPane.setPreferredSize(new Dimension(100, 70));
        add(listScrollPane);

        // JScrollBar
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 10, 0, 100);
        add(scrollBar);

        // JTree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        root.add(child2);
        JTree tree = new JTree(root);
        JScrollPane treeScrollPane = new JScrollPane(tree);
        treeScrollPane.setPreferredSize(new Dimension(150, 100));
        add(treeScrollPane);

        // JDialog
        JButton dialogButton = new JButton("Open Dialog");
        add(dialogButton);
        dialogButton.addActionListener(e -> {
            JDialog dialog = new JDialog(this,"MyDialog",true);
            dialog.setSize(200, 100);
            dialog.setLayout(new FlowLayout());
            dialog.add(new JLabel("This is a JDialog"));
            JButton closeBtn = new JButton("Close");
            closeBtn.addActionListener(event -> dialog.dispose());
            dialog.add(closeBtn);
            dialog.setVisible(true);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(wingAllInOne::new);
    }
}











   
   



