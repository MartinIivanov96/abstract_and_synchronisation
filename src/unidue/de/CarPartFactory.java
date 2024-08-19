package unidue.de;

public interface CarPartFactory {
    public Engine buildEngine();
    public Seat buildSeat(Color seatColor);
}
