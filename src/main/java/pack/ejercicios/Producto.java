package pack.ejercicios;

public class Producto {
    String nombreProducto;
    double precioProducto;
    int stockProducto;
    String categoriaProducto;

    public Producto(String nombreProducto, double precioProducto, int stockProducto, String categoriaProducto){
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.categoriaProducto = categoriaProducto;
    }

    public void mostrarProductos() {
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio: " + precioProducto);
        System.out.println("Stock: " + stockProducto);
        System.out.println("Categoria: " + categoriaProducto);
    }

    public void venderProducto(int cantidad) {
        this.stockProducto = this.stockProducto - cantidad;
    }

    public boolean hayStock() {
        return stockProducto > 0 ;
    }

}
//deje afuera informacion como la garantia, el peso o descripcion detallada ya que no era importante
