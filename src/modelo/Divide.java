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
public class Divide extends Operation {

    public Divide(double number1, double number2) {
        super(number1, number2, "Division", number1 / number2);
    }

    @Override
    public double operation(double number1, double number2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
