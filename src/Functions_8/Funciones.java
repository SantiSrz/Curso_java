package Functions_8;

public class Funciones {
	public static void main(String[] args) {
		
		//Funciones
		SendEmail();
		SendEmailToUser("santibox88@gmail.com", "Superheroes6");
		var state = sendEmailWithState("santibox88@gmail.com");
		System.out.println(state);
		var state2 = sendEmailWithState("");
		System.out.println(state2);

	}
			// Funcion sin parametros ni retorno
		public static void SendEmail() {
			System.out.println("Envia un email");
		}
		
			// Funcion con parametros
		public static void SendEmailToUser(String email, String user) {
			System.out.println("Envia un email a: " + user + ", mas concretamente a su correo: " + email);
		}
		
			// Funcion con retorno
		public static boolean sendEmailWithState(String email) {

	        if (email.isEmpty()) {
	        	return false;
	        }

	        System.out.println("Se envía el email a " + email);
	        return true;
	    }
}
