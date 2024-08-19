package unidue.de;

public class UniquelyFancySeat implements Seat{
    private Color seatColor;

    public UniquelyFancySeat(Color seatColor) {
        this.seatColor = seatColor;
    }

    @Override
    public Color getColor() {
        return this.seatColor;
    }
}
