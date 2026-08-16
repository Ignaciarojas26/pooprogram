package pack.ejercicios;

public class Estudiante {
    String nombreEstudiante;
    int edadEstudiante;
    String rutEstudiante;
    double promedioEstudiante;

    public Estudiante(String nombreEstudiante, int edadEstudiante, String rutEstudiante, double promedioEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.edadEstudiante = edadEstudiante;
        this.rutEstudiante = rutEstudiante;
        this.promedioEstudiante = promedioEstudiante;
    }
    public void mostrarEstudiante() {
        System.out.println("Nombre: " + nombreEstudiante);
        System.out.println("Edad: " + edadEstudiante);
        System.out.println("RUT: " + rutEstudiante);
        System.out.println("Promedio general: " + promedioEstudiante);
    }
    public boolean promovido() {
        return promedioEstudiante > 4.0;
    }

    public double obtenerPromedio() {
        return promedioEstudiante;
    }
}
//Se dejaron afuera detalles como informacion de los padres, notas de asignaturas en general por no ser de utilidad por el momento
