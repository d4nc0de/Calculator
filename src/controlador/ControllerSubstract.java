
package controlador;

import controlador.util.Response;
import controlador.util.Status;
import modelo.History;
import modelo.Modelo;
import modelo.Substract;
import vista.Vista;

public class ControllerSubstract {

    private Vista view;
    private Modelo model;

    public ControllerSubstract(Vista view, Modelo model) {

        this.model = model;
        this.view = view;
     

    }

    

    public static Response createSubstraction(String numero1, String numero2) {
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
            Substract resta = new Substract(DoubleN1,DoubleN2);
            history.addOperation(resta);
            System.out.println("Se agrego la resta a la lista");
            return new Response("Substraction created successfully", Status.CREATED,resta);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}
