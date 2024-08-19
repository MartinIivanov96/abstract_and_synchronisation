package unidue.de;

public class Main {

    public static void main(String[] args) {
	CarPartFactory sportFactory = new SportCarPartFactory();
	CarPartFactory economyFactory = new EconomyCarPartFactory();
	CarPartFactory uniquelyFancyFactory = UniquelyFancyCarPartFactory.getInstance();

	CarDealership sportCarDealership = new CarDealership(sportFactory);
	CarDealership economyCarDealership = new CarDealership(economyFactory);
	CarDealership uniquelyFancyCarDealership = new CarDealership(uniquelyFancyFactory);


	Car sportsCar = sportCarDealership.Order(Color.BLUE, Color.BLACK);
	Car economyCar = economyCarDealership.Order(Color.WHITE, Color.WHITE);
	Car uniquelyFancyCar = uniquelyFancyCarDealership.Order(Color.RED,Color.RED);

        System.out.println(sportsCar);
        System.out.println(economyCar);
        System.out.println(uniquelyFancyCar);

        sportsCar.fuelUp();
        sportsCar.testDrive();

        economyCar.fuelUp();
        economyCar.testDrive();

        uniquelyFancyCar.fuelUp();
        uniquelyFancyCar.testDrive();

    }
}
