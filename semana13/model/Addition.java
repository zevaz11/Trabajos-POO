package model;

public class Addition extends Operation {
    @Override
    public double execute(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public Operation clone() {
        return new Addition();
    }

}
