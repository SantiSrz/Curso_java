package Exercises_POO_9;

public class Student {
    
    int nota;
    
    public Student(int nota) {
        this.nota = nota;
    }
    
    public void aprobado() {
        if (nota < 60) {
            System.out.println("Has sacado un: " + nota + ", estás suspenso");
        } else {
            System.out.println("Has sacado un: " + nota + ", estás aprobado");
        }
    }
}
