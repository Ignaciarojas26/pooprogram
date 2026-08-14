package pack.ejercicios;

//se dejo afuera el numero de paginas, la editorial y el genero porque no son necesarias para el ojetivo del sistema
public class Libro {
    String titulo;
    String author;
    int anio;
    boolean disponible;

    public Libro(String titulo, String author, int anio, boolean disponible) {
        this.titulo = titulo;
        this.author = author;
        this.anio = anio;



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

