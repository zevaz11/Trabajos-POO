package code;

public class Empleado {
    int ID;
    int cedula;
    String nombre;
    String puesto;
    int salario;

    public void cambiarSalario(int nuevoSalario) {
        this.salario = nuevoSalario;
    }

    public void cambiarPuesto(String nuevoPuesto) {
        this.puesto = nuevoPuesto;
    }
}
