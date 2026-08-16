package pack.ejercicios;

public class Mascota {
    String nombreMascota;
    String nombreTutor;
    String especie;
    boolean vacunada;

    public Mascota(String nombreMascota, String nombreTutor, String especie, boolean vacunada) {
        this.nombreMascota = nombreMascota;
        this.nombreTutor = nombreTutor;
        this.especie = especie;
        this.vacunada = vacunada;
    }
    public void mostrarDatos() {
        System.out.println("Nombre mascota: "+ nombreMascota);
        System.out.println("Nombre tutor: " + nombreTutor);
        System.out.println("Especie: " + especie);
        System.out.println("Estado de vacunacion: " + vacunada);
    }

    public boolean isVacunada() {
        return vacunada;
    }
    public void vacunar() {
        this.vacunada = true;
    }
}
//Se dejo afuera la informacion de la mascota, tal como edad, ultima visita medica, peso, etc.
