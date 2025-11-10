package Strings_4;

public class StringsExercises {
	public static void main(String[] args) {
		
		String name = " Santiago ";
		String lastname = " Suarez ";
		var edad = 19;
		
        // 1. Concatena dos cadenas de texto.
		System.out.println(name + " " + lastname);
		
        // 2. Muestra la longitud de una cadena de texto.
		System.out.println(name.length());
		
        // 3. Muestra el primer y último carácter de un string.
		System.out.println(name.charAt(0) + " " + name.charAt(name.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
		System.out.println(name.contains("Santi"));
		
        // 6. Formatea un string con un entero.
    	System.out.println(String.format("Hola, %s y tengo %d años.", name, edad));

        // 7. Elimina los espacios en blanco al principio y final de un string.
		System.out.println(name.trim());
		
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
		System.out.println(name.replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
		System.out.println(name.equalsIgnoreCase(lastname));
		
        // 10. Comprueba si dos strings tienen la misma longitud.
		boolean longitud = (name.length() == lastname.length());
		System.out.println(longitud);

    }

}
