package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
	public static void main(String[] args) {
		Car car = new Car();
		UsedCar usedCar = new UsedCar();
		Scanner sc = new Scanner(System.in);
		ArrayList<Car> list = new ArrayList<>();
		//car.addCar(list, sc);
		usedCar.createCarList(list);
		int userEntry = -1;
		
		while(userEntry != list.size() - 1) {
			try {
				car.printList(list);
				car.selectCar(list, sc);
			}catch(IndexOutOfBoundsException e){
				break;
			}
			
		}
		System.out.println("Have a great day!");

		
		
	}

}
