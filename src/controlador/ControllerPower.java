
package controlador;

import controlador.util.Response;
import controlador.util.Status;
import modelo.History;
import modelo.Modelo;
import modelo.Power;
import vista.Vista;

public class ControllerPower {

    private Vista view;
    private Modelo model;

    public ControllerPower(Vista view, Modelo model) {

        this.model = model;
        this.view = view;
        

    }

   

    public static Response createPower(String numero1, String numero2) {
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
            history.addOperation(new Power(DoubleN1,DoubleN2));
            System.out.println("Se agrego la potencia a la lista");
            return new Response("Addition created successfully", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}
