package Ejercicios_clase;

/* 2. Escribir un programa que lea un número real por la entrada estándar, lo multiplique por 20 e
imprima su división por 10. A continuación debe sumar el número a la multiplicación y volver
a imprimir su división por 10. Si el resto no es cero, debe imprimirlo también. 
import java.util.Scanner;*/

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        var num = sc.nextDouble();

        var multiplicacion = num * 20;
        System.out.println("multiplicacion / 10 = " + (multiplicacion / 10));

        var suma = multiplicacion + num;
        System.out.println("suma / 10 = " + (suma / 10));

        var resto = suma % 10;
        if (resto != 0) {
            System.out.println("El resto es: " + resto);
        }
    }
}
