package pack.ejercicios;

public class Prestamo {
    String fechaPrestamo;
    String fechaDevolucion;
    String titulo;
    String estudiante;
    boolean devuelto;

    //constructor
    public Prestamo(String fechaPrestamo, String titulo, String estudiante){
        this.fechaPrestamo = fechaPrestamo;
        this.titulo = titulo;
        this.estudiante = estudiante;
        this.devuelto = false;

    }
    //metodo

    public boolean isDevuelto() {
        return devuelto;
    }

    public void devolver() {
        this.devuelto = true;
    }

    public void mostrarDatos() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Estudiante: " + estudiante);
        System.out.println("Fecha prestamo: " + fechaPrestamo);
        System.out.println("Devuelto: " + devuelto);
    }
}

//Se dejo afuera el numero de renovaciones y las multas por atraso que no son necesarias para este sistema basico