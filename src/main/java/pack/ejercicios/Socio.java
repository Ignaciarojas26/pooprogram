package pack.ejercicios;

public class Socio {
    String nombreSocio;
    String plan;
    int diasAsistidos;
    boolean pagoVigente;

    public Socio(String nombreSocio, String plan, boolean pagoVigente) {
        this.nombreSocio = nombreSocio;
        this.plan = plan;
        this.diasAsistidos = 0;
        this.pagoVigente = pagoVigente;
    }

    public void mostrarDatos() {
        System.out.println("Nombre " + nombreSocio);
        System.out.println("Tipo de plan: " + plan);
        System.out.println("Asistencia: " + diasAsistidos);
        System.out.println("Pago al dia: " + pagoVigente);
    }
    public void registrarAsistencia() {
        this.diasAsistidos =diasAsistidos + 1;
    }

    public boolean isPagoVigente() {
        return pagoVigente;
    }
}
//se dejaron afuera datos como fecha de inscripcion, precio del plan, entrenador, ya que no son necesarios