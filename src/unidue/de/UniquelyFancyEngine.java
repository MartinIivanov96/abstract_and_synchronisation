package unidue.de;

public class UniquelyFancyEngine implements Engine{

    @Override
    public int getNumberOfPistons() {
        return 16;
    }

    @Override
    public int getSize() {
        return 8000;
    }

    @Override
    public int getFuelConsumption() {
        return 35;
    }
}
