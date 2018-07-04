import javax.swing.*;
import java.awt.*;

public abstract class Tile extends JButton implements Comparable<Tile> {

    public Tile(String name) {
        super(name);
        setPreferredSize(new Dimension(100,100));
    }

}