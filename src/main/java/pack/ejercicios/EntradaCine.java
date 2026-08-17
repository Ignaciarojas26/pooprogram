package pack.ejercicios;

public class EntradaCine {
    String nombrePelicula;
    double precioEntrada;
    boolean entradaUsada;
    int codigoEntrada;

    public EntradaCine(String nombrePelicula, double precioEntrada, int codigoEntrada) {
        this.nombrePelicula = nombrePelicula;
        this.precioEntrada = precioEntrada;
        this.entradaUsada = false;
        this.codigoEntrada = codigoEntrada;
    }

    public void mostrarDatos() {
        System.out.println("Nombre pelicula: " + nombrePelicula);
        System.out.println("Precio total: " + precioEntrada);
        System.out.println("Codigo entrada: " + codigoEntrada);
        System.out.println("Entrada usada: " + entradaUsada);
    }

    public boolean isEntradaUsada() {
        return entradaUsada;
    }
    public void usar() {
        this.entradaUsada = true;
}
}
//Se dejo afuera pedir datos tipo metodo de pago, tipo de entrada, sala y horario al no ser necesarios