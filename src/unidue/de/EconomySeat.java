package unidue.de;

public class EconomySeat implements Seat {
    private Color color;

    public EconomySeat(Color color){
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
