
package controlador;

import controlador.util.Response;
import controlador.util.Status;
import modelo.Divide;
import modelo.History;
import modelo.Modelo;
import vista.Vista;

public class ControllerDivide {

    private Vista view;
    private Modelo model;

    public ControllerDivide(Vista view, Modelo model) {

        this.model = model;
        this.view = view;

    }

    public static Response createDivition(String numero1, String numero2) {
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
            
            if( DoubleN2 == 0){
                return new Response ("Divider can't be 0", Status.BAD_REQUEST);
            }
            History history = History.getInstance();
            Divide div = new Divide(DoubleN1,DoubleN2);
            history.addOperation(div);
            System.out.println("Se agrego la division a la lista");
            return new Response("Divition created successfully", Status.CREATED, div);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}
