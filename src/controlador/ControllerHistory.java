/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import modelo.History;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Daniel
 */
public class ControllerHistory implements ActionListener {
    
    private Modelo model;
    private Vista view;
    
    
     public ControllerHistory (Vista view, Modelo model){
        
        this.model = model;
        this.view = view;
        this.view.btnUpdate.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel modelolist = new DefaultListModel();
        view.txtHistory.setModel(modelolist);
        modelolist.removeAllElements();
        
        ArrayList array = new ArrayList<>();
        array = History.getInstance().getOperations();
        
        
        int cont = 0;
        for (int i =  array.size() - 1; i >= 0 ; i--) {
            
            modelolist.addElement(array.get(i)) ;
            cont += 1;
        }
    }
}
