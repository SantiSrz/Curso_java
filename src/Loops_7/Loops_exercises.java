package Loops_7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Loops_exercises {
	 public static void main(String[] args) {

	        // 1. Imprime los números del 1 al 10 usando while.
		 	int i = 1;
		 	while (i <= 10){
			 System.out.println(i);
			 i++;
		 	}
		 
	        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
			var names = new ArrayList<String>();
			names.add("Santiago");
			names.add("Alejandro");
			names.add("Maria");
			
			int u = 0;
			do {
				System.out.println(names.get(u));
				u++;
			} while (u < names.size());
		 
	        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
			for(int b = 1; b <= 50; b++) {
				if (b % 5 == 0) {
					System.out.println(b);
				}
			}
		 
	        // 4. Recorre un Array de 5 números e imprime la suma total.
			int[] numbers = new int[5];
			numbers[0] = 1;
			numbers[1] = 2;
			numbers[2] = 3;
			numbers[3] = 4;
			numbers[4] = 5;
			
			int suma = 0;
			for (int g = 0; g < numbers.length; g++) {
				System.out.println(numbers[g]);
				suma = suma + numbers[g];
			}
			System.out.println(suma);

	        // 5. Usa un for para recorrer un Array y mostrar sus valores.
			int[] number = new int[5];
			number[0] = 1;
			number[1] = 2;
			number[2] = 3;
			number[3] = 4;
			number[4] = 5;
			
			for (int g = 0; g < numbers.length; g++) {
				System.out.println(numbers[g]);
			}
		 
	        // 6. Usa for-each para recorrer un HashSet y un HashMap.
			var numeros = new HashSet<Integer>();
			numeros.add(1);
			numeros.add(2);
			numeros.add(3);
			numeros.add(4);
			numeros.add(5);
			
			for(Integer numero:numeros) {
				System.out.println(numero);
			}
			
			var telefonos = new HashMap<String, String>();
			telefonos.put("Santiago", "Santibox888@gmail.com");
			telefonos.put("Marina", "Marina8@gmail.com");
			telefonos.put("Julieta", "Julieta@gmail.com");
			
			for(Map.Entry<String, String> telefono: telefonos.entrySet()) {
				System.out.println(telefono);
			}
		 
	        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
			for (int o = 10; o >= 1; o--) {
			    System.out.print(o + ", ");
			}
		 
	        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
			for(int q = 1; q <= 20; q++) {
				if (q % 3 == 0) {
					continue;
				}
			    System.out.println(q);
			}
	        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
			int[] edad = new int[3];
			edad[0] = 1;
			edad[1] = -2;
			edad[2] = 3;
			for(Integer num:edad) {
				if (num < 0) {
					break;
				}
				System.out.println(num);
			}
			
	        // 10. Crea un programa que calcule el factorial de un número dado.
			Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce un número: ");
	        int num1 = sc.nextInt();
	        
	        int n;
	        int factorial1 = 1;
	        for (n = 1; n <= num1; n++) {
	            factorial1 *= n;
	        }
	    	System.out.println(factorial1);
	    	
	    }
}
