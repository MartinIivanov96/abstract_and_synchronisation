package unidue.de;

public class EconomyCarPartFactory implements CarPartFactory {
    @Override
    public Engine buildEngine() {
        return new EconomyEngine();
    }

    @Override
    public Seat buildSeat(Color seatColor) {
        return new EconomySeat(seatColor);
    }
}
