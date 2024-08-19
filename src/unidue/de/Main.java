package unidue.de;

public class Main {

    public static void main(String[] args) {
	CarPartFactory sportFactory = new SportCarPartFactory();
	CarPartFactory economyFactory = new EconomyCarPartFactory();

	CarDealership sportCarDealership = new CarDealership(sportFactory);
	CarDealership economyCarDealership = new CarDealership(economyFactory);


	Car sportsCar = sportCarDealership.Order(Color.BLUE, Color.BLACK);
	Car economyCar = economyCarDealership.Order(Color.WHITE, Color.WHITE);

        System.out.println(sportsCar);
        System.out.println(economyCar);

        sportsCar.fuelUp();
        sportsCar.testDrive();

        economyCar.fuelUp();
        economyCar.testDrive();

    }
}
