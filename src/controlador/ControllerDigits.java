/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Daniel
 */
public class ControllerDigits {

    public Modelo model;
    public static Vista view;

    public ControllerDigits() {
        this.view = Vista.getInstance();
        this.model = null;

    }

    public static double digitsVef(double num) {
        String veri = String.valueOf(num);
        char c;
        int cont = 0;
        int i = 0;
        StringBuilder resultado = new StringBuilder();
        boolean sw = true;
        while (cont < veri.length()) {
            c = veri.charAt(cont);
            if (c == '.') {
                sw = false;
            }
            if (sw) {
                resultado.append(c);
            } else {
                if (i <= 3) {
                    resultado.append(c);
                    i++;
                }
            }
            cont++;
        }
        return Double.parseDouble(resultado.toString());
    }

}
