package Exercises_POO_9;

public class Rectangulo {
	
	double base;
	double altura;
	
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public void area() {
		double area = base * altura;
		System.out.println("El area del rectangulo es: " + area);
	}
	
	public void perimetro() {
		double perimetro = 2 *(base + altura);
		System.out.println("El perimetro del rectangulo es: " + perimetro);
	}

}
