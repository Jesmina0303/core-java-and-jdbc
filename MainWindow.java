import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class MainWindow extends JFrame {
    private JPanel centerPanel = new JPanel();
    private CardLayout cardLayout = new CardLayout();
    private JLabel SearchLabel, replaceLabel;

    public MainWindow() {
        setTitle("jesmina.jpg/Welcome");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Header
        JLabel header = new JLabel("Visual Studio", SwingConstants.CENTER);
        header.setOpaque(true);
        header.setBackground(new Color(0,0,0));
        header.setForeground(Color.WHITE);
        header.setFont(new Font("Arial", Font.BOLD, 18));
        add(header, BorderLayout.NORTH);

        // Footer
        JLabel footer = new JLabel("footer", SwingConstants.CENTER);
        footer.setOpaque(true);
        footer.setBackground(new Color(255, 102, 0));
        footer.setForeground(Color.WHITE);
        add(footer, BorderLayout.SOUTH);

        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(0,0,0));
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));

        JButton searchBtn= new JButton("Search");
        searchBtn.addActionListener(e -> cardLayout.show(centerPanel, "Search"));
        JButton replaceBtn = new JButton("Replace");
        replaceBtn.addActionListener(e -> cardLayout.show(centerPanel, "Replace"));
        

        sidebar.add(Box.createVerticalStrut(20));
        sidebar.add(searchBtn);
        sidebar.add(Box.createVerticalStrut(10));
        sidebar.add(replaceBtn);
       
        add(sidebar, BorderLayout.WEST);

        // Center Panel with CardLayout
        cardLayout = new CardLayout();
        centerPanel = new JPanel(cardLayout);

        // --- Home Page
        JPanel SearchPanel = new JPanel();
        SearchPanel.setBackground(Color.BLACK);
        SearchPanel.setLayout(new BoxLayout(SearchPanel, BoxLayout.Y_AXIS));

        SearchLabel = new JLabel("WELCOME TO THE HOME PAGE");
        SearchLabel.setForeground(Color.RED);
        
        SearchLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        SearchLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        SearchPanel.add(SearchLabel);

        JButton fontButton = new JButton("Change Font");
        fontButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        fontButton.addActionListener(this::changeFont);

        JButton colorButton = new JButton("Change Color");
        colorButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        colorButton.addActionListener(this::changeColor);

        SearchPanel.add(Box.createVerticalStrut(20));
        SearchPanel.add(fontButton);
        SearchPanel.add(Box.createVerticalStrut(10));
        SearchPanel.add(colorButton);

        // --- About Page
        JPanel replacePanel = new JPanel();
        replacePanel.setBackground(new Color(0, 0, 0));
        

        replaceLabel = new JLabel(" Replace Content Here");
        replaceLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
        replaceLabel.setForeground(Color.WHITE);
        replacePanel.add(replaceLabel);

       
        // Add cards
        centerPanel.add(SearchPanel, "search");
        centerPanel.add(replacePanel, "Replace");
        

        add(centerPanel, BorderLayout.CENTER);

        // Show home by default
        cardLayout.show(centerPanel, "Search");
    }

    private void changeFont(ActionEvent e) {
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        String font = fonts[new Random().nextInt(fonts.length)];
        SearchLabel.setFont(new Font(font, Font.PLAIN, 20));
    }

    private void changeColor(ActionEvent e) {
        Random rand = new Random();
        Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
       replaceLabel.setForeground(color);
    }

    // Main method to launch the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }
}
