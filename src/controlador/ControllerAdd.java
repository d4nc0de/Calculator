/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Add;
import modelo.History;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Daniel
 */
public class ControllerAdd implements ActionListener {
    
    private Vista view;
    private Modelo model;
    
    public ControllerAdd (Vista view, Modelo model){
        
        this.model = model;
        this.view = view;
        this.view.btnAdd.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setPrimerNumero(Double.parseDouble(view.txtPimerNumero.getText()));
        model.setSegundoNumero(Double.parseDouble(view.txtSegundoNumero.getText()));
        Add sumar = new Add(model.getPrimerNumero(), model.getSegundoNumero());
        History.getInstance().addOperation(sumar);
        model.setResultado(sumar.operation(model.getPrimerNumero(), model.getSegundoNumero()));
        view.txtResult.setText(String.valueOf(model.getResultado()));
    }
    
}
