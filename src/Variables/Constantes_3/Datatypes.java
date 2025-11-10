package Variables.Constantes_3;

public class Datatypes {
	public static void main(String[] args) {
		
		// Tipos de datos primitivos
	
	int entero = 21;
	System.out.println(entero);
	
	double decimal = 1.94;
	System.out.println(decimal);
		// float, long, byte
	
	char caracter = 'a';
	System.out.println(caracter);
	
	boolean dato = true;
	System.out.println(dato);
	dato = false;
	System.out.println(dato);

	String cadena_de_texto = "Hola";
	System.out.println(cadena_de_texto);

	// Tipo de dato en tiempo de compilacion para una clase
	
	System.out.println(cadena_de_texto.getClass().getSimpleName());
	}

		
}
