
package modelo;

import controlador.ControllerDigits;

public abstract class Operation {
    
    protected double number1;
    protected double number2;
    protected String operator;
    protected double result;

    public Operation(double number1, double number2, String operator, double result) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.result = result;
    }

    @Override
    public String toString() {
        return number1 + " " + operator + " " + number2 + " = " + ControllerDigits.digitsVef(result);
    }

    public double getResult() {
        return result;
    }

    
    
}
