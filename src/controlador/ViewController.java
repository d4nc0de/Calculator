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
public class ViewController {

    private Vista view;
    private Modelo model;

    public ViewController(Vista view, Modelo model) {

        this.view = view;
        this.model = model;

    }

    public void start() {

        view.setTitle("Calculadora");
        view.setLocationRelativeTo(null);

    }
}
