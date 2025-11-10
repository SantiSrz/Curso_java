package Estructuras_6;

public class Arrays {
	public static void main(String[] args) {
		
		// Declaracion y creacion
		int[] numbers = new int[3];
		System.out.println(numbers);
		
		String[] names = {"Santiago", "Marcos", "Julio"};
		System.out.println(names);
		
		// Acceso
		System.out.println(names[0]);
		System.out.println(numbers[0]);
		System.out.println((new String[3])[0]);
		
		// Modificacion
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		names[1] = "Luis";
		System.out.println(names[1]);
		
		boolean[] booleans = new boolean[5];
		System.out.println(booleans[4]);
	}	
}
