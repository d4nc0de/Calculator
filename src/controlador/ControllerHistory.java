/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import controlador.util.Response;
import controlador.util.Status;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import modelo.History;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Daniel
 */
public class ControllerHistory {

    private Modelo model;
    public static Vista view;

    public ControllerHistory() {
        this.view = Vista.getInstance();
        this.model = null;

    }

    public static Response updateHistory(DefaultListModel modelolist) {
        try {
            System.out.println("1");
            modelolist.removeAllElements();
            ArrayList array = History.getInstance().getOperations();
            for (int i = array.size() - 1; i >= 0; i--) {
                modelolist.addElement(array.get(i).toString());
            }
            return new Response("Person data updated successfully", Status.OK);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
