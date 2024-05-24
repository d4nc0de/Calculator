/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controlador.ControllerAdd;
import controlador.ControllerDivide;
import controlador.ControllerHistory;
import modelo.Modelo;
import vista.Vista;
import controlador.ControllerMultiply;
import controlador.ControllerPower;
import controlador.ControllerSubstract;
import controlador.ViewController;
import javax.swing.DefaultListModel;
/**
 *
 * @author Daniel
 */
public class Main {
    
    
    public static void main(String[] args){
       
     
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
     
     
     
    }
}
