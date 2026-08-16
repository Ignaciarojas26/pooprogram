package pack.ejercicios;

public class Curso {
    String nombreCurso;
    int cuposCurso;
    int inscritosCurso;
    String nombreProfesor;

    public Curso(String nombreCurso, int cuposCurso, String nombreProfesor) {
        this.nombreCurso = nombreCurso;
        this.cuposCurso = cuposCurso;
        this.inscritosCurso = 0;
        this.nombreProfesor = nombreProfesor;
    }

    public void datosCurso() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Cupos disponibles: " + cuposCurso);
        System.out.println("Inscritos: " + inscritosCurso);
        System.out.println("Profesor: " + nombreProfesor);
    }

    public boolean hayCupos() {
        return cuposCurso > inscritosCurso;
    }

    public void inscribirEstudiante() {
        this.inscritosCurso = this.inscritosCurso + 1;
    }

}
