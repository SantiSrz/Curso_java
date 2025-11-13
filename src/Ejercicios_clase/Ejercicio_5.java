package Ejercicios_clase;

/*
 5. Transformar el siguiente bucle while en un bucle for:
 
 final int MAX_ITEMS = 10;
int [] items = { 2, 4, 6, 8, 10, 9, 7, 5, 3, 1};
boolean found = false;
int find = 10;
// loop while
int i = 0;
while ( (!found) && (i < MAX_ITEMS) ) {
found = (items[i] == find);
i++;
}
System.out.println(i-1);
 */

public class Ejercicio_5 {
    public static void main(String[] args) {
    	
    	final int MAX_ITEMS = 10;
    	int [] items = { 2, 4, 6, 8, 10, 9, 7, 5, 3, 1};
    	boolean found = false;
    	int find = 10;
    	
    	int i;
    	for (i = 0; (!found) && (i < MAX_ITEMS); i++) {
    		found = (items[i] == find);
    	}
    	System.out.println(i-1);
    }
}
