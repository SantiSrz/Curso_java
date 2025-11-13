package Ejercicios_clase;

/*
6. Implementar el cálculo del factorial de un número dado primero utilizando un bucle for y después
utilizando un bucle while.
 */

import java.util.Scanner;

public class Ejercicio_6 {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num1 = sc.nextInt();
        
        int i;
        int factorial1 = 1;
        for (i = 1; i <= num1; i++) {
            factorial1 *= i;
        }
    	System.out.println(factorial1);
    	
        System.out.print("Introduce un número: ");
        int num2 = sc.nextInt();
    	
    	int j = 1;
    	int factorial2 = 1;
    	while (j <= num2) {
            factorial2 *= j;
            j++;
    	}
    	System.out.println(factorial2);

	}
}
