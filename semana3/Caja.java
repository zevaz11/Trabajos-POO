package code;

public class Caja { //las cajas donde se paga
    int numeroCaja;
    String encargadoCaja;
    String tipoCaja; //caja rápida, etc
    boolean cajaAbierta;

    public void cambioTurno(String nuevoEncargado){
        this.encargadoCaja = nuevoEncargado;
    }

    public void abrirCerrarCaja(){
        if(!this.cajaAbierta)
            this.cajaAbierta = true;
        else
            this.cajaAbierta = false;
    }
}
