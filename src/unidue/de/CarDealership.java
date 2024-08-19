package unidue.de;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
    private CarPartFactory partFactory;

    public CarDealership(CarPartFactory partFactory) {
        this.partFactory = partFactory;
    }

    public Car Order(Color carColor, Color seatColor) {
        Engine engine = partFactory.buildEngine();
        List<Seat> seats = new ArrayList<Seat>();
        for(int i=0 ; i<4 ; i++) {
            seats.add(partFactory.buildSeat(seatColor));
        }

        return new Car(engine,seats,carColor);
    }
}
