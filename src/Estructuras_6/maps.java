package Estructuras_6;

import java.util.HashMap;

public class maps {
	public static void main(String[] args) {
		
		// Declaracion y creacion
		HashMap<String, String> names = new HashMap<>(); // Los maps son como los diccionarios de python
		var numbers = new HashMap<Integer, String>();
				
		// Añadir elementos
		names.put("Santiago", "Santibox888@gmail.com");
		names.put("Marina", "Marina8@gmail.com");
		names.put("Julieta", "Julieta@gmail.com");
		System.out.println(names);

		// Acceder a los elementos
		System.out.println(names.get("Santiago"));
		
		// Verificar los datos
		System.out.println(names.containsKey("Santiago"));
		System.out.println(names.containsValue("Santibox888@gmail.com"));

		// Tamaño
		System.out.println(names.size());
				
		//Eliminar Elementos
		names.remove("Julieta");
		System.out.println(names);
		System.out.println(names.size());
		
		//Limpiar Listas
		names.clear();
		System.out.println(names);
		System.out.println(names.size());
			
				
	}
}
