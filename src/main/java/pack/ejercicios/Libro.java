package pack.ejercicios;

//se dejó afuera el numero de páginas, la editorial y el género porque no son necesarias para el ojetivo del sistema

//clase propuesta y atributos
public class Libro {
    String titulo;
    String author;
    int anio;
    boolean disponible;

    //constructor
    public Libro(String titulo, String author, int anio, boolean disponible) {
        this.titulo = titulo;
        this.author = author;
        this.anio = anio;

//metodos
    }
    public void prestar() {
      this.disponible = false;

    }

    public void devolver() {
        this.disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }
}

