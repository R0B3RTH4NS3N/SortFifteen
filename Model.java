import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {

    private View view;
    private List<Tile> fifteen;
    private EmptyTile emptyTile;

    public Model(Controller controller) {
        fifteen = new ArrayList<>(15);
        for (int i=1; i<=15; i++) {
            fifteen.add(new NumberTile(i, controller));
        }
        emptyTile = new EmptyTile();
        fifteen.add(emptyTile);
        view = new View(fifteen, controller);
    }

    public void swap(Tile tile) {
        int indexOfEmptyTile = fifteen.indexOf(emptyTile);
        int indexOfNumberTile = fifteen.indexOf(tile);
        if (indexOfEmptyTile == indexOfNumberTile+1 || indexOfEmptyTile == indexOfNumberTile-1
                || indexOfEmptyTile == indexOfNumberTile+4 || indexOfEmptyTile == indexOfNumberTile-4) {
            fifteen.set(indexOfEmptyTile, tile);
            fifteen.set(indexOfNumberTile, emptyTile);
            view.updateFifteenPanel(fifteen);
        }
    }

    public void newGame() {
        Collections.shuffle(fifteen);
        view.updateFifteenPanel(fifteen);
    }

    public void checkSolution() {
        String message = "solved";
        for (int i=0; i<15; i++) {
            if (fifteen.get(i).compareTo(fifteen.get(i+1)) != -1) {
                message = "nope";
            }
        }
        view.showMessage(message);
    }

}