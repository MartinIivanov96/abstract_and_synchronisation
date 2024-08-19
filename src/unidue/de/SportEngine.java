package unidue.de;

public class SportEngine implements Engine {

    @Override
    public int getNumberOfPistons() {
        return 8;
    }

    @Override
    public int getSize() {
        return 5700;
    }

    @Override
    public int getFuelConsumption() {
        return 16;
    }
}
