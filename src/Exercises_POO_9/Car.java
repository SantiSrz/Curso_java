package Exercises_POO_9;

public class Car {
	
	String model;
	String brand;
	
	public Car(String brand, String model) {
		this.model = model;
		this.brand = brand;
	}
	
	public void showData() {
		System.out.println("Este coche es de la marca: " + brand + " y el modelo: " + model);
	}
}
