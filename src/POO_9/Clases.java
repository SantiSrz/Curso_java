package POO_9;

public class Clases {
	
	public static void main(String[] args) {
		
		var persona = new Persona("Santiago", 19);
		
		//persona.name = "Santiago";
		//persona.age = 19;
		
		persona.DecirHola();
		System.out.println(persona.name);
		System.out.println(persona.age);
		
		var persona2 = new Persona("Patricio", 21);
		persona2.DecirHola();

	}

}
