public class EmptyTile extends Tile {

    public EmptyTile() {
        super("");
        setVisible(false);
    }

    @Override
    public int compareTo(Tile o) {
        return 1;
    }

}
