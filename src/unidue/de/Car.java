package unidue.de;

import java.util.List;

public class Car {
    private Engine engine;
    private List<Seat> seats;
    private Color color;

    Car(Engine engine, List<Seat> seats, Color carColor) {
        this.engine = engine;
        this.seats=seats;
        this.color=carColor;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public Color getColor() {
        return color;
    }

    public void fuelUp(){
        System.out.println("Filling the " + getColor() +" car with the " + getEngine().getSize() + " cc engine.");
    }

    public boolean testDrive() {
        System.out.println("Test driving car with " + getEngine().getNumberOfPistons() + " pistons engine.");
        return true;
    }

    @Override
    public String toString() {
        return getColor() + " car with the " + getEngine().getNumberOfPistons() + " piston, " + getEngine().getSize() + " cc engine. Fuel Consumption : " + getEngine().getFuelConsumption() + " l/100km.";
    }
}
