package code;

public class Producto {
    int ID;
    String nombre;
    String marca;
    String tipo;
    int precio;
    int cantidad;

    public void cambiarPrecio(int nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public void aumentarCantidad() {
        this.cantidad++;
    }
}
