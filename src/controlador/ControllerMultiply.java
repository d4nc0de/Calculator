
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
            double DoubleN1, DoubleN2;
            try {
                DoubleN1 = Double.parseDouble(numero1);
            } catch (NumberFormatException ex) {
                return new Response("Id must be numeric", Status.BAD_REQUEST);
            }
            try {
                DoubleN2 = Double.parseDouble(numero2);
            } catch (NumberFormatException ex) {
                return new Response("Id must be numeric", Status.BAD_REQUEST);
            }
            History history = History.getInstance();    
            Multiply multi = new Multiply(DoubleN1,DoubleN2);
            history.addOperation(multi);
            System.out.println("Se agrego la multiplicacion a la lista");
            return new Response("Multiplication created successfully", Status.CREATED, multi);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}
