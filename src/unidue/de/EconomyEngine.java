package unidue.de;

public class EconomyEngine implements Engine {
    @Override
    public int getNumberOfPistons() {
        return 4;
    }

    @Override
    public int getSize() {
        return 1500;
    }

    @Override
    public int getFuelConsumption() {
        return 6;
    }
}
