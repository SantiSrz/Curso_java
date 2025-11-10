package Operators_2;

public class OperatorsExercises {

    public static void main(String[] args) {
    	
    	double a = 10;
    	var b = 2;
    	
        // 1. Crea una variable con el resultado de cada operación aritmética.
    	
    	double c = a + b;
    	System.out.println(c);

    	double d = a - b;
    	System.out.println(d);

    	double e = a * b;
    	System.out.println(e);

    	double f = a / b;
    	System.out.println(f);

    	double g = a % b;
    	System.out.println(g);
    	
        // 2. Crea una variable para cada tipo de operación de asignación.
    	
    	a = b;
    	System.out.println(a);

    	a = b * 2;
    	System.out.println(a);

    	a += 1;
    	System.out.println(a);
    	
    	a -= 1;
    	System.out.println(a);

    	a *= 2;
    	System.out.println(a);

    	a /= 2;
    	System.out.println(a);
    	
    	a %= 2;
    	System.out.println(a);
    	
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
    	
    	System.out.println(3 < 8);
    	System.out.println(3 == 3);
    	System.out.println(3 != 8);

    	
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
    	
    	System.out.println(3 > 8);
    	System.out.println(3 != 3);
    	System.out.println(3 == 8);
    	
        // 5. Utiliza el operador lógico and.
    	
    	System.out.println(true && true);
    	System.out.println(true && false);
    	System.out.println(false && false);
    	System.out.println(false && true);
    	
    	System.out.println(3 > 2 && 5 == 2);
    	
        // 6. Utiliza el operador lógico or.
    	
    	System.out.println(true || true);
    	System.out.println(true || false);
    	System.out.println(false || false);
    	System.out.println(false || true);
    	
    	System.out.println(3 > 2 || 5 == 2);
    	
        // 7. Combina ambos operadores lógicos.
    	
    	System.out.println((true || true) && (true || true));
    	
        // 8. Añade alguna negación.
    	
    	System.out.println(!(true || true) && (true || true));

    	
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
    	
    	System.out.println(+b);
    	System.out.println(-b);
    	System.out.println(++b);
    	
        // 10. Combina operadores aritméticos, de comparación y lógicos.
    	
        double suma = a + b;
        boolean comparacion = suma > 12;
        boolean resultado = comparacion && (b > a);
        
        System.out.println("Suma: " + suma);
        System.out.println("¿La suma es mayor que 12? " + comparacion);
        System.out.println("Resultado final (comparación AND b > a): " + resultado);

    	
    }
}