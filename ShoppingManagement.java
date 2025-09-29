import java.awt.*;
import javax.swing.*;
public class ShoppingManagement{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Shopping Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label=new JLabel("JESMINA SHOPPING MANAGEMENT SYSTEM");
        label.setFont(new Font("Arial", Font.BOLD, 16));
        label.setForeground(Color.BLUE);
        
        
        panel.add(label);
        panel.setBackground(Color.LIGHT_GRAY);
        frame.add(panel, BorderLayout.NORTH);

        JLabel label1 = new JLabel("Item Name:");
        JTextField textField1 = new JTextField();
        textField1.setColumns(15);

        
        JLabel label2 = new JLabel("Quantity:");
        JTextField textField2 = new JTextField();
        textField1.setColumns(10);
        


        JLabel label3 = new JLabel("Price:");
        JTextField textField3 = new JTextField();
        textField3.setColumns(15);
        
        
        JButton button = new JButton("Add to Cart");
        textField2.setColumns(5);

        
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);
        panel.add(label3);
        panel.add(textField3);
        
        frame.add(panel);
        frame.setVisible(true);
        button.addActionListener(e -> {
            String itemName = textField1.getText();
            String quantity = textField2.getText();
            String price = textField3.getText();

            if (itemName.isEmpty() || quantity.isEmpty() || price.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
                return;
            }
            JOptionPane.showMessageDialog(frame, "Added " + quantity + " of " + itemName + " to cart.");
        });
        frame.setLocationRelativeTo(null); // Center the frame on the screen
        frame.setVisible(true); // Make the frame visible
 
}
    // Additional methods can be added here for more functionality
    public void addItem(String itemName, int quantity) {
        addItem("makeup", 2);
        addItem("pen", 5);
        addItem("maggi",3);
        addItem("cookies", 4);
        if (itemName.isEmpty() || quantity <= 0) {
            JOptionPane.showMessageDialog(null, "Invalid item name or quantity.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Added " + quantity + " of " + itemName + " to cart.");
        // Logic to add item to cart
    }
    public void removeItem(String itemName) {
        removeItem("book");

        // Logic to remove item from cart
    }
    public void viewCart()
     {
    
        
        


        // Logic to view items in cart


}
    public void checkout() {
        // Logic to perform checkout
        JOptionPane.showMessageDialog(null, "Checkout completed successfully!");
    }
}

  
    
      
        