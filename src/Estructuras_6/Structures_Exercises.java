package Estructuras_6;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Structures_Exercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
		String[] names = {"Santiago", "Marcos", "Julio", "Marina", "Lucia"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
    	names[1] = "Raul";
		System.out.println(names[1]);

        // 3. Crea un ArrayList vacío.
		String[] palabras = new String[4];

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
		var num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.remove(2);
        System.out.println(num);
    	
        // 5. Crea un HashSet con 2 valores diferentes.
    	var val = new HashSet<Integer>();
    	val.add(1);
		val.add(2);
		System.out.println(val);
        
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
		val.add(1);
		val.add(3);
		System.out.println(val);

        // 7. Elimina uno de los elementos del HashSet.
		val.remove(2);
        System.out.println(val);
        
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
		var num_tel = new HashMap<String, Integer>();
		num_tel.put("Santiago", 657483746);
		num_tel.put("Marina", 654342532);
		num_tel.put("Julieta", 609712634);
		System.out.println(num_tel);
        
        // 9. Modifica uno de los contactos y elimina otro.
		System.out.println(num_tel.replace("Marina", 657483746));
		System.out.println(num_tel.remove("Santiago"));
		System.out.println(num_tel);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        
     // Array inicial
        String[] array = {"A", "B", "C", "A"};

        // 1) Array → ArrayList
        ArrayList<String> lista = new ArrayList<>(Arrays.asList(array));

        // 2) ArrayList → HashSet (elimina duplicados)
        HashSet<String> conjunto = new HashSet<>(lista);

        // 3) HashSet → HashMap (clave = valor)
        HashMap<String, String> mapa = new HashMap<>();
        for (String elemento : conjunto) {
            mapa.put(elemento, elemento);
        }

        System.out.println("ArrayList: " + lista);
        System.out.println("HashSet: " + conjunto);
        System.out.println("HashMap: " + mapa);
    }
}
