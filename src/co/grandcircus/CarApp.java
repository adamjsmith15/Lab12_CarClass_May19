package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Car();
		Scanner sc = new Scanner(System.in);
		ArrayList<Car> list = new ArrayList<>();
		car.addCar(list, sc);
		
		car.printList(list);
	}

}
