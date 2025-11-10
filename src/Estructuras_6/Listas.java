package Estructuras_6;

import java.util.ArrayList;

public class Listas {
	public static void main(String[] args) {
		
		// Declaracion y creacion
		ArrayList<String> names = new ArrayList<>();
		var number = new ArrayList<Integer>();
		
		// Añadir elementos
		names.add("Santiago");
		names.add("Alejandro");
		names.add("Maria");
		
		// Acceder a los elementos
		System.out.println(names.getFirst());
		System.out.println(names.get(1));
		System.out.println(names.getLast());

		// Modificar los elementos
		System.out.println(names.set(1, "Marta"));
		System.out.println(names);

		// Tamaño
		System.out.println(names.size());
		
		//Eliminar Elementos
		names.remove(2);
		System.out.println(names);
		System.out.println(names.size());
		
		//Buscar elemento
		names.contains("Santiago");
		
		//Limpiar Listas
		names.clear();
		System.out.println(names);
		System.out.println(names.size());

	
	}
}
