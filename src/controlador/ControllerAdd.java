
package controlador;

import controlador.util.Response;
import controlador.util.Status;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Add;
import modelo.History;
import modelo.Modelo;
import vista.Vista;

public class ControllerAdd{

    private Vista view;
    private Modelo model;

    public ControllerAdd(Vista view, Modelo model) {

        this.model = model;
        this.view = view;

    }

    
    public static Response createAddition(String numero1, String numero2) {
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
            history.addOperation(new Add(DoubleN1,DoubleN2));
            System.out.println("Se agrego la suma a la lista");
            return new Response("Addition created successfully", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}
