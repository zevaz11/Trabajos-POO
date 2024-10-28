package model;

import controller.CalculatorController;
import observer.calculatorObserver;
import observer.calculatorSubject;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static Calculator instance;
    private List<calculatorObserver> observers = new ArrayList<>();

    private Calculator() {
        // Inicializar el estado de la calculadora
    }

    public void addObserver(calculatorObserver observer) {
        observers.add(observer);
    }
    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public double performOperation(String operation, double num1, double num2) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("División por cero no permitida");
                }
            default:
                throw new UnsupportedOperationException("Operación no soportada: " + operation);
        }// Implementar lógica para operaciones
    }


}
