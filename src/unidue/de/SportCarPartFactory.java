package unidue.de;

public class SportCarPartFactory implements CarPartFactory {
    @Override
    public Engine buildEngine() {
        return new SportEngine();
    }

    @Override
    public Seat buildSeat(Color seatColor) {
        return new SportSeat(seatColor);
    }
}
