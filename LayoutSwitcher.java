import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutSwitcher extends JFrame {

    private JPanel panel;
    private JList<String> layoutList;
    private CardLayout cardLayout;

    public LayoutSwitcher() {
        setTitle("Layout Manager Switcher");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Layout Switcher List
        String[] layouts = {"BorderLayout", "FlowLayout", "GridLayout", "CardLayout", "BoxLayout", "SpringLayout"};
        layoutList = new JList<>(layouts);
        layoutList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        layoutList.setSelectedIndex(0); // Default selection
        add(new JScrollPane(layoutList), BorderLayout.WEST);

        // Panel where the layouts will change
        panel = new JPanel();
        panel.setLayout(new BorderLayout()); // Default layout is BorderLayout
        add(panel, BorderLayout.CENTER);

        // Add 5 boxes to the panel
        for (int i = 1; i <= 5; i++) {
            panel.add(new JButton("Box " + i), BorderLayout.CENTER);
        }

        layoutList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                updateLayout(layoutList.getSelectedValue());
            }
        });

        // Set the initial layout
        updateLayout(layouts[0]);

        setVisible(true);
    }

    // Method to update the layout based on selection
    private void updateLayout(String layout) {
        panel.removeAll(); // Clear the existing components

        switch (layout) {
            case "BorderLayout":
                panel.setLayout(new BorderLayout());
                panel.add(new JButton("Box 1"), BorderLayout.NORTH);
                panel.add(new JButton("Box 2"), BorderLayout.SOUTH);
                panel.add(new JButton("Box 3"), BorderLayout.EAST);
                panel.add(new JButton("Box 4"), BorderLayout.WEST);
                panel.add(new JButton("Box 5"), BorderLayout.CENTER);
                break;

            case "FlowLayout":
                panel.setLayout(new FlowLayout());
                for (int i = 1; i <= 5; i++) {
                    panel.add(new JButton("Box " + i));
                }
                break;

            case "GridLayout":
                panel.setLayout(new GridLayout(1, 5)); // 1 row, 5 columns
                for (int i = 1; i <= 5; i++) {
                    panel.add(new JButton("Box " + i));
                }
                break;

            case "CardLayout":
                cardLayout = new CardLayout();
                panel.setLayout(cardLayout);
                for (int i = 1; i <= 5; i++) {
                    panel.add(new JButton("Box " + i), "Card " + i);
                }
                cardLayout.show(panel, "Card 1");
                break;

            case "BoxLayout":
                panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS)); // Horizontal BoxLayout
                for (int i = 1; i <= 5; i++) {
                    panel.add(new JButton("Box " + i));
                }
                break;

            case "SpringLayout":
                panel.setLayout(new SpringLayout());
                for (int i = 1; i <= 5; i++) {
                    JButton box = new JButton("Box " + i);
                    panel.add(box);
                    // Using SpringLayout for each component
                    SpringLayout layoutManager = (SpringLayout) panel.getLayout();
                    if (i == 1) {
                        layoutManager.putConstraint(SpringLayout.WEST, box, 10, SpringLayout.WEST, panel);
                    } else {
                        layoutManager.putConstraint(SpringLayout.WEST, box, 10, SpringLayout.EAST, panel.getComponent(i - 2));
                    }
                    layoutManager.putConstraint(SpringLayout.NORTH, box, 10, SpringLayout.NORTH, panel);
                }
                break;
        }

        panel.revalidate(); // Revalidate the panel
        panel.repaint(); // Repaint the panel
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LayoutSwitcher());
    }
}