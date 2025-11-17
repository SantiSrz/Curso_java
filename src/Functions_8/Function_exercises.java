package Functions_8;

import java.util.ArrayList;

public class Function_exercises {
	public static void main(String[] args) {
		Bienvenida();
		Saludo("Santiago");
		Resta(5,3);
		Cuadrado(2);
		ParImpar(3);
		Edad(18);
		Longitud("Hola");
        int[] numeros = {4, 8, 15, 16, 23, 42};
		Media(numeros);
		Factorial(5);
		var lista = new ArrayList<String>();
		lista.add("Santiago");
		lista.add("Alejandro");
		lista.add("Maria");
		Recorrer(lista);
		
	}
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
		public static void Bienvenida() {
			System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
		}
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
		public static void Saludo(String nombre) {
		    System.out.println("Hola, " + nombre);
		}
		
        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
		public static void Resta(int num1, int num2) {
			int resta = num1 - num2;
		    System.out.println(resta);
		}

        // 4. Crea un método que calcule el cuadrado de un número (n * n).
		public static void Cuadrado(int num1) {
			int cuadrado = num1 * num1;
		    System.out.println(cuadrado);
		}
		
        // 5. Escribe una función que reciba un número y diga si es par o impar.
		public static void ParImpar(int num1) {
			if (num1 % 2 == 0) {
			    System.out.println(num1 + " es par");
			}else {
			    System.out.println(num1 + " es impar");
			}
		}
		
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
		public static void Edad(int num3) {
			if (num3 >= 18) {
			    System.out.println("Es mayor de edad");
			}else {
			    System.out.println("Es menor de edad");
			}
		}
		
        // 7. Implementa una función que reciba una cadena y retorne su longitud.
		public static void Longitud(String cadena) {
		    System.out.println(cadena.length());
		}

		
        //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
		public static void Media(int[] enteros) {
			int suma = 0;
			int division = 0;
			for(int num:enteros) {
				suma = suma + num;
				division = suma/enteros.length;
			}
			System.out.println("La media es: " + division);
		}

		
        // 9. Escribe un método que reciba un número y retorna su factorial.
		public static void Factorial(int num4) {

		int n;
        int factorial = 1;
        for (n = 1; n <= num4; n++) {
            factorial *= n;
        }
    	System.out.println(factorial);
    	
    }
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
		public static void Recorrer(ArrayList<String> lista) {
			for(String elemento:lista) {
				System.out.println(elemento);
			}
		}
	
    }
