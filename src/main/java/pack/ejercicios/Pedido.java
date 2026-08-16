package pack.ejercicios;

public class Pedido {
    String nombreCliente;
    double totalProducto;
    String estadoPedido;
    int numeroPedido;

    public Pedido(String nombreCliente, int numeroPedido) {
        this.nombreCliente = nombreCliente;
        this.totalProducto = 0.0;
        this.estadoPedido = "Registrado";
        this.numeroPedido = numeroPedido;
    }
    public void mostrarDetalles() {
        System.out.println("Nombre cliente: " + nombreCliente);
        System.out.println("Numero de pedido: " + numeroPedido);
        System.out.println("Total a pagar: " + totalProducto);
        System.out.println("Estado de pedido: " + estadoPedido);
    }

    public void agregarProducto(double precio) {
        this.totalProducto = this.totalProducto + precio;
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estadoPedido = nuevoEstado;
    }
}
//Se dejo afuera los datos de direccion de entrega, metodo de pago o tiempo de entrega, al no ser necesarios segun lo que se pide
