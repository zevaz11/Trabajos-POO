import controller.CalculatorController;
import model.Calculator;
import view.menuCalculadora;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.getInstance();
        menuCalculadora display = new menuCalculadora();
        calculator.addObserver(display); // Registrar la vista como observadora
        new CalculatorController(calculator, display); // Crear el controlador

        display.setVisible(true);
    }
}