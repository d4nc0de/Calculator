/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.History;
import modelo.Modelo;
import modelo.Multiply;
import vista.Vista;

/**
 *
 * @author Daniel
 */
public class ControllerMultiply implements ActionListener {

    private Vista view;
    private Modelo model;

    public ControllerMultiply(Vista view, Modelo model) {

        this.view = view;
        this.model = model;
        this.view.btnMultiply.addActionListener(this);
        

    }
    
    public void actionPerformed(ActionEvent e){
    
        model.setPrimerNumero(Double.parseDouble(view.txtPimerNumero.getText()));
        model.setSegundoNumero(Double.parseDouble(view.txtSegundoNumero.getText()));
        Multiply multiplicacion = new Multiply(model.getPrimerNumero(), model.getSegundoNumero());
        History.getInstance().addOperation(multiplicacion);
        model.setResultado(multiplicacion.operation(model.getPrimerNumero(),model.getSegundoNumero() ));
        view.txtResult.setText(String.valueOf(model.getResultado()));
    }

}
