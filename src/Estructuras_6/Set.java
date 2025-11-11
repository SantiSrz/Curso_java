package Estructuras_6;

import java.util.HashSet;

public class Set {
	public static void main(String[] args) {
		
		// Declaracion y creacion
		HashSet<String> names = new HashSet<>(); // Los sets no permiten repetidos, las listas si
		var numbers = new HashSet<Integer>();
		
		// Añadir elementos
		names.add("Santiago");
		names.add("Alejandro");
		names.add("Maria");
		System.out.println(names);
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);

		// Acceder a los elementos
			// No existe orden, guarda los datos de manera desordenada asique no se puede acceder a los elementos

		// Modificar los elementos
			// Tampoco de puede modificar por el mismo motivo

		// Tamaño
		System.out.println(names.size());
		
		//Eliminar Elementos
		names.remove("Maria");
		System.out.println(names);
		System.out.println(names.size());
				
		//Buscar elemento
		System.out.println(names.contains("Santiago"));
		
		// Conjuntos
			//names.addAll(numbers); Error por incompatibilidad de datos
		
		var countries = new HashSet<String>();
		countries.add("España");
		countries.add("Alemania");
		countries.add("Portugal");
		
		names.addAll(countries);
		System.out.println(names);
		
		names.retainAll(countries);
		System.out.println(names);

		names.removeAll(countries);
		System.out.println(names);

		//Limpiar Listas
		names.clear();
		System.out.println(names);
		System.out.println(names.size());
	
		
	}
}
