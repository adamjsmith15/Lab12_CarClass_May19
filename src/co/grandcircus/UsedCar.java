package co.grandcircus;

import java.util.ArrayList;

public class UsedCar extends Car {
	private double mileage;

	public UsedCar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	
	public void createCarList(ArrayList<Car> list) {
		Car car1 = new Car("Ford", "Mustang", 2019, 26395);
		Car car2 = new Car("Tesla", "Model S", 2019, 86200);
		Car car3 = new Car("Chevrolet", "Equinox", 2019, 22222.22);
		UsedCar car4 = new UsedCar("Kia","Sedona", 2018, 37500, 2568);
		UsedCar car5 = new UsedCar("Chevrolet","Impala", 2018, 20400, 33278);
		UsedCar car6 = new UsedCar("Tesla","Model S", 2013, 43300, 40277);
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		list.add(car5);
		list.add(car6);
	}

	@Override
	public String toString() {
		String format = "%-10s %-10s %-10s $%,-10.2f %-10s %,-10.0f \n";
		return String.format(format, getMake(), getModel(), getYear(), getPrice(), " (Used) ",getMileage());

	}
	
	

}
