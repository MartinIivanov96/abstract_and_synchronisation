package unidue.de;

public class UniquelyFancyCarPartFactory implements CarPartFactory{

    private static UniquelyFancyCarPartFactory instance;

    private UniquelyFancyCarPartFactory() {}

    public static synchronized UniquelyFancyCarPartFactory getInstance() {
        if (instance == null) {
            instance = new UniquelyFancyCarPartFactory();
        }
        return instance;
    }

    @Override
    public Engine buildEngine() {
        return new UniquelyFancyEngine();
    }

    @Override
    public Seat buildSeat(Color seatColor) {
        return new UniquelyFancySeat(seatColor);
    }
}
