package pack.ejercicios;

public class BusEscolar {
    int cuposBus;
    String recorrido;
    String estadoBus;
    int pasajerosActuales;
    String patente;

    public BusEscolar(int cuposBus, String recorrido, String patente) {
        this.cuposBus = cuposBus;
        this.recorrido = recorrido;
        this.estadoBus = "Saliendo";
        this.pasajerosActuales = 0;
        this.patente = patente;
    }

    public void mostrarDatos() {
        System.out.println("Cupos desponibles: " + cuposBus);
        System.out.println("Asientos usados: " + pasajerosActuales);
        System.out.println("Recorrido: " + recorrido);
        System.out.println("Estado: " + estadoBus);
        System.out.println("Patente del bus: " + patente);
    }

    public void subirPasajero() {
        this.pasajerosActuales = this.pasajerosActuales + 1;
    }

    public boolean hayCupos() {
        return cuposBus > pasajerosActuales;
    }
}
//Se dejo afuera datos como lista de nombres de estudiantes, horario de salida o llegada, ya que no eran necesarios
