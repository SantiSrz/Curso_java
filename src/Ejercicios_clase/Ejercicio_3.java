package Ejercicios_clase;

/* 3. Implemente un programa que dibuje un ajedrez en modo consola al estilo: */

public class Ejercicio_3 {
    public static void main(String[] args) {
    	for (int i = 0;i < 8; i++ ) {
    		System.out.println();
    		for (int j = 0;j < 8; j++ ) {
    			if ( (i + j) % 2 == 0 ) {
    				System.out.print("B");
    			} else {
    				System.out.print("W");
}    	
}
}
}
}
