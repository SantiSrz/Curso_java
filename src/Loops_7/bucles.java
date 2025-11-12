package Loops_7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class bucles {
	public static void main(String[] args) {
		
		// For controlado por contador
		
		for (int i = 0; i<5; i++) {
			System.out.println("Hola, Java");
		}
		
		String[] names = {"Santiago", "Marcos", "Julio"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// For-each -> Sirve para recorrer Arrays, Listas maps, sets, etc...
		
			//Array
		for(String nombres:names) {
			System.out.println(nombres);
		}
		
			//HashSet
		var numbers = new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		for(Integer numeros:numbers) {
			System.out.println(numeros);
		}
		
			//HashMap
		var telefonos = new HashMap<String, String>();
		telefonos.put("Santiago", "Santibox888@gmail.com");
		telefonos.put("Marina", "Marina8@gmail.com");
		telefonos.put("Julieta", "Julieta@gmail.com");
		
		for(Map.Entry<String, String> telefono: telefonos.entrySet()) {
			System.out.println(telefono.getKey());
			System.out.println(telefono.getValue());
			System.out.println(telefono);

		}
		
		// While
		
		int j = 0;
		while (j < 5) {
			System.out.println("Hola, Java");
			j++;
		}
		
		int m = 0;
		boolean find = false;
		while (find == false) {
			System.out.println(names[m]);
			if (names[m] == "Julio") {
				find = true;
			}
			m++;
		}
		
		// Do-while -> lo que hace es minimo ejecutarlo una vez
		
		int u = 0;
		do {
			System.out.println("Hola, Java");
			u++;
		} while (u < 5);
		
		
		// Control de bucles
		
			// -break
		for(String nombres:names) {
			System.out.println(nombres);
			if (nombres.equals("Marcos")) {
				break;
			}
			
		}
			
			// -Continue
		for (int b = 0; b<5; b++) {
				if (b == 3) {
					continue;
				}
				System.out.println(b);

		}
		
		
		}
	}

