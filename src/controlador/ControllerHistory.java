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
    private static Vista view;

    public ControllerHistory(Modelo model) {
        this.view = view.getInstance();
        this.model = model;

    }

    public static Response updateHistory() {
        try {
            DefaultListModel<String> modelolist = new DefaultListModel<>();
            System.out.println("1");

            System.out.println("2");
            modelolist.removeAllElements();
            System.out.println("3");
            ArrayList array = History.getInstance().getOperations();
            System.out.println("4");

            for (int i = array.size() - 1; i >= 0; i--) {
                modelolist.addElement(array.get(i).toString());
            }
            System.out.println("5");

            SwingUtilities.invokeLater(() -> {
                view.txtHistory.setModel(modelolist);
            });
            System.out.println("6");

            return new Response("Person data updated successfully", Status.OK);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
}
