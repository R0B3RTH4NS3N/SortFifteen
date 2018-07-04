import javax.swing.*;
import java.awt.*;
import java.util.List;

public class View extends JFrame {

    private JPanel fifteenPanel;

    public View(List<Tile> fifteen, Controller controller) {
        super("SortFifteen");
        setResizable(false);
        setLayout(new BorderLayout());
        updateFifteenPanel(fifteen);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton checkButton = new JButton("Check solution");
        checkButton.addActionListener(controller);
        buttonPanel.add(checkButton);
        JButton newButton = new JButton("New game");
        newButton.addActionListener(controller);
        buttonPanel.add(newButton);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void updateFifteenPanel(List<Tile> fifteen) {
        if (fifteenPanel != null) {
            remove(fifteenPanel);
        }
        fifteenPanel = new JPanel(new GridLayout(4,4));
        fifteen.forEach(tile -> {
            fifteenPanel.add(tile);
        });
        add(fifteenPanel, BorderLayout.CENTER);
        pack();
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

}
