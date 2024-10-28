package code;

public class Main {
    public static void main(String[] args) {

        Supermercado super1 = new Supermercado();

        super1.nombre = "Walmart";

        //pruebas
        System.out.printf(super1.nombre);
        System.out.print("\n");
        System.out.printf(String.valueOf(super1.abierto));
        System.out.print("\n");
        super1.cerrarAbrirTienda();
        System.out.printf(String.valueOf(super1.abierto));


    }
}