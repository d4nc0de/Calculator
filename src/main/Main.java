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
       
     
     Modelo mod = new Modelo();
     Vista view = new Vista();  
     
     ViewController ctrlView = new ViewController(view, mod);
     ControllerMultiply ctrlMulty = new ControllerMultiply( view, mod);
     ControllerAdd crtAdd = new ControllerAdd(view, mod);
     ControllerSubstract crtRes = new ControllerSubstract(view, mod);
     ControllerDivide crtDiv = new ControllerDivide(view, mod);
     ControllerPower crtPow = new ControllerPower(view, mod);
     ControllerHistory crtHis = new ControllerHistory(view, mod);
     
     
     ctrlView.start();
     view.setVisible(true);
     
     
     
    }
}
