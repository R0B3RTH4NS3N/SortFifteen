import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Model model;

    public Controller() {
        model = new Model(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof Tile) {
            model.swap((Tile)e.getSource());
        } else if (e.getActionCommand().equals("New game")){
            model.newGame();
        } else if (e.getActionCommand().equals("Check solution")) {
            model.checkSolution();
        }
    }

}
