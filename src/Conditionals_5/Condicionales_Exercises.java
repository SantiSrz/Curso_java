package Conditionals_5;

public class Condicionales_Exercises {
	public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
		var edad = 19;
		
		if (edad >= 18) {
			System.out.println("El usuario puede votar");
		}else {
			System.out.println("El usuario no puede votar");
		}
		
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
		var num1 = 2;
		var num2 = 4;
		
		if (num1 > num2) {
			System.out.println("El primer numero (" + num1 + ") es mayor que el segundo numero (" + num2 + ")");
		}else if (num1 == num2) {
			System.out.println("El primer numero (" + num1 + ") es igual que el segundo numero (" + num2 + ")");
		}else {
			System.out.println("El segundo numero (" + num2 + ") es mayor que el primer numero (" + num1 + ")");
		}
		
        // 3. Dado un número, verifica si es positivo, negativo o cero.
		var num3 = -3;
		
		if (num3 > 0) {
			System.out.println("El numero (" + num3 + ") es positivo");
		}else if (num3 == 0) {
			System.out.println("El numero (" + num3 + ") es igual que 0");
		}else {
			System.out.println("El numero (" + num3 + ") es negativo");
		}
        // 4. Crea un programa que diga si un número es par o impar.
		var num4 = 10;
		
		if (num4 % 2 == 0) {
			System.out.println("El numero (" + num4 + ") es par");
		}else {
			System.out.println("El numero (" + num4 + ") es impar");
		}
		
        // 5. Verifica si un número está en el rango de 1 a 100.
		var num5 = 180;
		
		if (num5 >= 1 & num5 <= 100) {
			System.out.println("El numero (" + num5 + ") esta entre el rango 1 y 100");
		}else {
			System.out.println("El numero (" + num5 + ") esta fuera del rango entre 1 y 100");
		}
		
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
		var day = 7;
	    
	    switch (day) {
	    case 1:
			System.out.println("Lunes");
			break;
	    case 2:
			System.out.println("Martes");
			break;
	    case 3:
			System.out.println("Miercoles");
			break;
	    case 4:
			System.out.println("Jueves");
			break;
	    case 5:
			System.out.println("Viernes");
			break;
	    case 6:
			System.out.println("Sabado");
			break;
	    case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("No es ningun dia de la semana");

			}
	    
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
	    var nota = 90;
	    
	    if (nota <= 49) {
			System.out.println("Has sacado un " + nota + ", estas suspenso");
	    }else if (nota >= 50 & nota <= 89) {
			System.out.println("Has sacado un " + nota + ", estas aprobado");
	    }else {
			System.out.println("Has sacado un " + nota + ", tienes un sobresaliente");
	    }
	    
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
	    var años = 15;
		
		if (años >= 15) {
			System.out.println("El usuario puede entrar al cine");
		}else {
			System.out.println("El usuario debe tener al menos 15 años o ir acompañado.");
		}
	    
        // 9. Crea un programa que diga si una letra es vocal o consonante.
		var letra = "a";

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
		    System.out.println("La letra " + letra + " es una vocal");
		} else {
		    System.out.println("La letra " + letra + " es una consonante");
		}

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
		var a = 12;
		var b = 32;
		var c = 6;
		
		if (a > b && a > c) {
		    System.out.println("El numero " + a + " es mayor que los numeros " + b + " y " + c);
		}else if (b > a && b > c) {
		    System.out.println("El numero " + b + " es mayor que los numeros " + a + " y " + c);
		}else {
		    System.out.println("El numero " + c + " es mayor que los numeros " + a + " y " + b);
		}

    }
}
