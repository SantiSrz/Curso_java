package Ejercicios_clase;

	//a. Declara una clase Ejemplo. 
public class Ejercicio_1 {

		//b. Declara el método main.
	    public static void main(String[] args) {
	    	
	    	//c. Declara una variable String denominada shortMsg con valor inicial “Short Message”. 
	    	String shortMsg = "Short Message";
	    	
	    	//d. Declara otra variable String denominada longMsg, con valor inicial “Loooooooooong message”.
	    	String longMsg = "Loooooooooong message";
	    	
	    	//e. Declara una variable boolean de nombre printShort, cuyo valor inicial sea true. 
	    	boolean printShort = true;
	    	
	    	//f. Declara una variable int de nombre counter, y no le asignes ningún valor inicial. 
	    	int counter;
	    	
	    	//g. Escribe una instrucción if de manera que se imprima por pantalla shortMsg sólo si printShort vale true.
	    	if (printShort == false) {
	    		System.out.println(shortMsg);
	    		
	    	//h. Añade un else al if, de manera que si printShort es false se imprima longMsg. 
	    	}else{
	    		System.out.println(longMsg);
	    	}
	    	
	    	//i. Añade el código necesario para que, sea cual sea el valor de printShort, lo siguiente que se imprima sea el mensaje “This message is always printed”. 
	    	if (printShort == false || printShort == true) {
	    		System.out.println("This message is always printed");
	    	}
	    	
	    	//j. Incluye a continuación un bucle for que imprima el mensaje “Are we there yet?” diez veces seguidas. 
	    	for (int i = 0; i < 10; i++) {
	    	    System.out.println("Are we there yet?");
	    	}
	    	
	    	//k. Añade un bucle while al final que imprima 7 veces el mensaje “I’m going to pass this course”. 
	    	int j = 0;

	    	while (j < 7) {
	    	    System.out.println("I’m going to pass this course");
	    	    j++;
	    	}
	    }
	}

