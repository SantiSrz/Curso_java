package Exercises_POO_9;

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
    	var libro = new Book("El Quijote", "Cervantes");
    	libro.DatosLibro();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
    	var ladrido = new Dog();
    	ladrido.Bark();
    	
        // 3. Añade un constructor a la clase Book que reciba title y author.
    	
    	//public Book(String title, String author){
		//this.title = title;
		//this.author = author;
		//}
    	
        // 4. Crea una clase Car con atributos brand y model y un método showData().
    	var coche = new Car("Audi", "Q3");
    	coche.showData();
    	
        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
    	var nota = new Student(65);
    	nota.aprobado();
    	
        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
    	var banco = new BankAccount(4657.56);
    	banco.deposit(432.87);
    	System.out.println(" ");
    	
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
    	var figura = new Rectangulo(5, 6);
    	figura.area();
    	figura.perimetro();
    	
        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
    	Worker w1 = new Worker("Carlos", 1500);
    	w1.mostrarSalario();
    	
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
    	ArrayList<Persona> personas = new ArrayList<>();

    	personas.add(new Persona("Ana", 25));
    	personas.add(new Persona("Luis", 30));
    	personas.add(new Persona("Marta", 22));

    	for (Persona p : personas) {
    	    p.showData();
    	}
    	
        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
    	var p1 = new Product("Ratón", 40);
    	p1.aplicarDescuento(15);
    	
    }
}
