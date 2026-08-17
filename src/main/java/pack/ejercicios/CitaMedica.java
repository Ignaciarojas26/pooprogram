package pack.ejercicios;

public class CitaMedica {
    String nombrePaciente;
    String fechaCita;
    String horaCita;
    String estadoAtencion;

    public CitaMedica(String nombrePaciente, String fechaCita, String horaCita) {
        this.nombrePaciente = nombrePaciente;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.estadoAtencion = "En espera";
    }
    public void mostrarDatos() {
        System.out.println("Nombre paciente: " + nombrePaciente);
        System.out.println("Fecha proxima cita: " + fechaCita);
        System.out.println("Hora de atencion: " + horaCita);
        System.out.println("Estado de atención: " + estadoAtencion);
    }
    public void actualizarEstado(String nuevoEstado) {
        this.estadoAtencion = nuevoEstado;
    }

    public boolean estaAtendida() {
        return estadoAtencion.equals("Atendida");
    }
}
