/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.Operation;

/**
 *
 * @author Daniel
 */
public class Multiply extends Operation{

    public Multiply(double number1, double number2) {
        super(number1, number2, "Multiplicacion", number1 * number2);
    }

    @Override
    public double operation(double number1, double number2) {
        double resultado;
        resultado = number1*number2;
        this.result = resultado;
        this. operator = "Multiplicacion";
        return result;
    }

   
    
}
