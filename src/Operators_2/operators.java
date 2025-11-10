package Operators_2;

public class operators {
	public static void main(String[] args) {
		
		// Operadores
		
	double a = 10; // Se pone double para que de decimal en caso de que alguna operacion de decimal, con que uno de las variables tenga el double sirve
	var b = 2;
	
	// Aritmeticos
	
	System.out.println(a + b);
	System.out.println(a - b);
	System.out.println(a * b);
	System.out.println(a / b);
	System.out.println(a % b);
	
	// Asignacion
	
	a = b;
	System.out.println(a);

	a = b * 2;
	System.out.println(a);

	a += 1; // a = a + 1;
	System.out.println(a);
	
	a -= 1;
	System.out.println(a);

	a *= 2;
	System.out.println(a);

	a /= 2;
	System.out.println(a);
	
	a %= 2;
	System.out.println(a);
	
	// Comparacion
	
	System.out.println(a == b);
	System.out.println(a == 6);
	System.out.println(a != b);
	System.out.println(a < b);
	System.out.println(a > b);
	System.out.println(a >= b);
	System.out.println(a <= b);

	// Logicos
	
		// && = AND
	System.out.println(true && true);
	System.out.println(true && false);
	System.out.println(false && false);
	System.out.println(false && true);
	
	System.out.println(3 > 2 && 5 == 2);

		// || = OR
	System.out.println(true || true);
	System.out.println(true || false);
	System.out.println(false || false);
	System.out.println(false || true);
	
	System.out.println(3 > 2 || 5 == 2);

		// ! = NOT
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(!(3 > 2) || 5 == 2);
		
	// Unarios
	
	System.out.println(+b);
	System.out.println(-b);
	System.out.println(++b); // Si va delante primero lo aumenta/disminuye y luego lo imprime
	System.out.println(--b);
	System.out.println(b--); // Si va detras primero lo imprime y luego lo aumenta/disminuye
	System.out.println(b++);


	
	}		
}
