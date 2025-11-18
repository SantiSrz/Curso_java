package Exercises_POO_9;

public class Product {
	String nombre;
    double precio;

    public Product(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
        System.out.println("Precio final de " + nombre + ": " + precio);
    }
}
