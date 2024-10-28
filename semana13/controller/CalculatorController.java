package controller;

import model.Calculator;
import view.menuCalculadora;

public class CalculatorController {
    private Calculator calculator;
    private menuCalculadora display;

    public CalculatorController(Calculator calculator, menuCalculadora display){
        this.calculator = calculator;
        this.display = display;

    }


}
