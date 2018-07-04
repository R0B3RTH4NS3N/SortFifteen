public class NumberTile extends Tile {

    Integer number;

    public NumberTile(int number, Controller controller) {
        super(String.valueOf(number));
        this.number = number;
        addActionListener(controller);
    }

    @Override
    public int compareTo(Tile o) {
        if (o.getClass().equals(NumberTile.class)) {
            return number.compareTo(((NumberTile)o).getNumber());
        } else {
            return -1;
        }
    }

    public int getNumber() {
        return number;
    }

}