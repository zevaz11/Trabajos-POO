package code;

public class Supermercado {
    int ID;
    String nombre;
    String ubicacion;
    int numeroTelefono;
    int trabajadores;
    boolean abierto;

    public void cerrarAbrirTienda(){
        if(!this.abierto)
            this.abierto = true;
        else
            this.abierto = false;
    }

    private void contratarPersonal(){
        this.trabajadores++;
    }

}
