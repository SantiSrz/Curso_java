package Variables.Constantes_3;

public class Variables_Y_Constantes {
	public static void main(String[] args) {
		
		// variables
		
		String name = "Santiago";
		System.out.println(name);
		
		name = "Santi";
		System.out.println(name);
		
			// name = 32 (error, no se puede cambiar el tipo de dato)

		int age = 19;
		System.out.println(age);
		
		var email = "Santibox888@gmail.com";
		System.out.println(email);
		
		var year = 2016;
		System.out.println(year);

			//var sirve para poner cualquier variable sin tener que especificarla
		
		// Constantes
		
		final String EMAIL = "Santibox888@gmail.com";
		
			//EMAIL = "Santi@gmail.com"; (No se peude cambiar la variable porque ahora es constante)
			//Se pone en mayusculas para identificar que es una constante
		
		System.out.println(EMAIL);

	}
}
