import java.awt.*;
import javax.swing.*;
public class OnlineShopping {
    public static void main(String[] args) {
        new OnlineShopping().createGUI();
    }

    public void createGUI() {
        JFrame frame = new JFrame("Online Shopping");
        frame.setSize(900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

    
        // HEADER
        JPanel header = new JPanel();
        header.setBackground(new Color(51, 153, 255));
        header.setPreferredSize(new Dimension(100, 60));
        JLabel title = new JLabel(" Online Shopping Management System");
       
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setForeground(Color.BLACK);
        header.add(title);
        frame.add(header, BorderLayout.NORTH);

        // SIDEBAR
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(102, 204, 255));
        sidebar.setPreferredSize(new Dimension(180, 400));
        sidebar.setLayout(new GridLayout(5, 1, 10, 10));

        String[] buttons = {"Dashboard", "Add Quantity", "View product", "Price", "Logout"};
        for (String btnText : buttons) {
            JButton btn = new JButton(btnText);
        
            btn.setBackground(Color.lightGray);
            btn.setFont(new Font("Tahoma", Font.PLAIN, 14));
            sidebar.add(btn);
        }
        frame.add(sidebar, BorderLayout.WEST);

        // MAIN PANEL (with image)
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.WHITE);
        mainPanel.setLayout(new BorderLayout());

        JLabel imageLabel = new JLabel();
        ImageIcon icon = new ImageIcon("BMW.jpg"); // Replace with your image path
        Image scaledImage = icon.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);

        imageLabel.setIcon(new ImageIcon(scaledImage));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(imageLabel, BorderLayout.CENTER);

        frame.add(mainPanel, BorderLayout.CENTER);
        
       


        // FOOTER
        JPanel footer = new JPanel();
        footer.setBackground(new Color(51, 153, 255));
        footer.setPreferredSize(new Dimension(100, 40));
        JLabel footerText = new JLabel("© 2025 Online Shopping app | Developed in Java");
        footerText.setForeground(Color.lightGray);
        footerText.setFont(new Font("Arial", Font.PLAIN, 12));
        footer.add(footerText);
        frame.add(footer, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
