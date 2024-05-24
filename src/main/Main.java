/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controlador.ControllerAdd;
import controlador.ControllerHistory;
import modelo.Modelo;
import vista.Vista;
import controlador.ControllerMultiply;
import controlador.ViewController;
import javax.swing.DefaultListModel;
/**
 *
 * @author Daniel
 */
public class Main {
    
    
    public static void main(String[] args){
       
     
     Modelo mod = new Modelo();
     Vista view = new Vista();  
     
     ViewController ctrlView = new ViewController(view, mod);
     ControllerMultiply ctrlMulty = new ControllerMultiply( view, mod);
     ControllerAdd crtAdd = new ControllerAdd(view, mod);
     ControllerHistory crtHis = new ControllerHistory(view, mod);
     
     
     
     
     ctrlView.start();
     view.setVisible(true);
     
     
     
    }
}
