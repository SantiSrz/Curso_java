package POO_9;

public class Persona {

	// Atributos
	String name;
	int age;
	
	// Constructores
	public Persona(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Metodos
	public void DecirHola() {
		System.out.println("Hola soy " + name + " y tengo: " + age + " años");
	}
}
