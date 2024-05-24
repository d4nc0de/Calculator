
package controlador;

import controlador.util.Response;
import controlador.util.Status;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.History;
import modelo.Modelo;
import modelo.Multiply;
import vista.Vista;


public class ControllerMultiply {

    private Vista view;
    private Modelo model;

    public ControllerMultiply(Vista view, Modelo model) {

        this.view = view;
        this.model = model;
   
        

    }
    
     public static Response createMultiplication(String numero1, String numero2) {
        try {
            int intN1, intN2;
            try {
                intN1 = Integer.parseInt(numero1);
            } catch (NumberFormatException ex) {
                return new Response("Id must be numeric", Status.BAD_REQUEST);
            }
            try {
                intN2 = Integer.parseInt(numero2);
            } catch (NumberFormatException ex) {
                return new Response("Id must be numeric", Status.BAD_REQUEST);
            }
            History history = History.getInstance();
            history.addOperation(new Multiply(intN1,intN2));
            return new Response("Multiplication created successfully", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}
