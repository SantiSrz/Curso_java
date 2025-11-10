package Strings_4;

public class Strings {
    public static void main(String[] args) {
    	
    	// cadenas de texto
    	
    	String name = "Santiago";    	
    	var apellido = new String("Suarez");
    	
    	// Operaciones basicas
    	
    	
    		// Concatenacion
    	System.out.println(name);
    	System.out.println(apellido);
    	System.out.println(name + " " + apellido);
    		
    		//Longitud
    	System.out.println(name.length());
    	
    		//Obtener caracter
    	System.out.println(name.charAt(0));
    	System.out.println(name.charAt(name.length() - 1)); // Obtener ultimo caracter
    	
    		// Subcadena
    	System.out.println(name.substring(0, 2));
    	
    		// Mayusculas y minusculas
    	System.out.println(name.toLowerCase());
    	System.out.println(name.toUpperCase());
    	
    		// Comprobar si contiene
    	System.out.println("Hola, Java".contains("Santiago"));
    	System.out.println("Hola, Java".contains("Hola"));
    	System.out.println("Hola, Java".toUpperCase().contains("HOLA"));

    		// Comparacion
    	System.out.println(name.equals("Santiago"));
    	System.out.println(name.equals("santiago"));
    	System.out.println(name.equalsIgnoreCase("SaNtiaGo"));
    	
    		// Trim
    	System.out.println("Hola, Java".trim());
    	
    		// Replace
    	System.out.println("Hola, Java".replace("Hola", "Adios"));

    		// Format
    	var age = 19;
    	System.out.println(String.format("Hola, %s. Tengo %d.", name, age));

    	
    }
}
