package Exercises_POO_9;

public class Persona {

	// Atributos
	public String name;
	public int age;
	
	// Constructores
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Metodos
	public void DecirHola() {
		System.out.println("Hola soy " + name + " y tengo: " + age + " años");
	}
	
	public void showData() {
        System.out.println(name + " - " + age + " años");
    }
}
