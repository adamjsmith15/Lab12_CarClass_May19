package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {
	private String make;
	private String model;
	private int year;
	private double price;

	public Car() {

	}

	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public void addCar(ArrayList<Car> list, Scanner sc) {
		System.out.println("Welcometo the Grand Circus admin console");
		int userNum = Validator.getInt(sc, "How many cars are you entering: ");
		for (int i = 0; i < userNum; i++) {
			System.out.print("Enter car #" + (i + 1) + " Make: ");
			String make = sc.next();
			System.out.print("Enter car #" + (i + 1) + " Model: ");
			sc.nextLine();
			String model = sc.nextLine();
			System.out.print("Enter car #" + (i + 1) + " Year: ");
			int year = sc.nextInt();
			System.out.print("Enter car #" + (i + 1) + " Price: ");
			double price = sc.nextDouble();
			list.add(new Car(make, model, year, price));
		}
	}
	public void printList(ArrayList<Car> list) {
		System.out.println("Current Inventory:");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		String format = "%-10s %-10s %-10s $%,-10.2f \n";
		return String.format(format, getMake(), getModel(), getYear(), getPrice());

	}

}
