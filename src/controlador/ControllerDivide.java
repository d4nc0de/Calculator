
package controlador;

import controlador.util.Response;
import controlador.util.Status;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Add;
import modelo.Divide;
import modelo.History;
import modelo.Modelo;
import vista.Vista;

public class ControllerDivide implements ActionListener {

    private Vista view;
    private Modelo model;

    public ControllerDivide(Vista view, Modelo model) {

        this.model = model;
        this.view = view;
        this.view.btnAdd.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent DIV) {
        model.setPrimerNumero(Double.parseDouble(view.txtPimerNumero.getText()));
        model.setSegundoNumero(Double.parseDouble(view.txtSegundoNumero.getText()));
        Divide division = new Divide(model.getPrimerNumero(), model.getSegundoNumero());
        History.getInstance().addOperation(division);
        model.setResultado(division.getResult());
        view.txtResult.setText(String.valueOf(model.getResultado()));
        System.out.println(model.getResultado());
    }

    public static Response createDivision(String numero1, String numero2) {
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
            if( intN2 == 0){
                return new Response ("Divider can't be 0", Status.BAD_REQUEST);
            }
            History history = History.getInstance();
            history.addOperation(new Divide(intN1,intN2));
            return new Response("Division created successfully", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}
