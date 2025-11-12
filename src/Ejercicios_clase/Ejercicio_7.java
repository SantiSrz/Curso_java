package Ejercicios_clase;

import java.util.Scanner;

/* 7. Escribe un método que calcule la ecuación del espacio recorrido por un objeto que se mueve a
velocidad constante, habiendo recorrido un espacio inicial de 5,5 m y que se mueve a velocidad
constante de 3,2 m/s. El método recibirá como argumento los segundos que lleva moviéndose el
objeto. 
 */

public class Ejercicio_7 {
    public static void main(String[] args) {
    	
    	metodo();
    }
    
    public static void metodo() {
    	
    	Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos segundos lleva moviéndose el objeto: ");
        double t = sc.nextDouble();

        double EspacioInicial = 5.5;
        double VelocidadConstante = 3.2;
        
        var formula = EspacioInicial + VelocidadConstante * t;
        System.out.print("El objeto a recorrido: " + formula + " metros");

    }
}
