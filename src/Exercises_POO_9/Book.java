package Exercises_POO_9;

public class Book {
	
	String title;
	String author;
	
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	public void DatosLibro() {
		System.out.println("Titulo del libro: "+ title);
		System.out.println("Autor: " + author);

	}
}
