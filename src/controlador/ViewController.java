
package controlador;

import modelo.Modelo;
import vista.Vista;


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
