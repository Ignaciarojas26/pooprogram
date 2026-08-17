package pack.ejercicios;

public class Paciente {
    String nombrePaciente;
    String rutPaciente;
    int edadPaciente;
    String alergiasPaciente;

    public Paciente(String nombrePaciente, String rutPaciente, int edadPaciente, String alergiasPaciente) {
        this.nombrePaciente = nombrePaciente;
        this.rutPaciente = rutPaciente;
        this.edadPaciente = edadPaciente;
        this.alergiasPaciente = alergiasPaciente;
    }
    public void mostrarDatos() {
        System.out.println("Nombre paciente: " + nombrePaciente);
        System.out.println("RUT: " + rutPaciente);
        System.out.println("Edad: " + edadPaciente);
        System.out.println("Alergias: " + alergiasPaciente);
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public String getAlergiasPaciente() {
        return alergiasPaciente;
    }
}
//Se dejo fuera historial medico, contactos de emergencia, sistema de salud ya que no son necesarios para el caso