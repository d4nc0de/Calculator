
package controlador;

import controlador.util.Response;
import controlador.util.Status;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Add;
import modelo.History;
import modelo.Modelo;
import vista.Vista;

public class ControllerSubstract implements ActionListener {

    private Vista view;
    private Modelo model;

    public ControllerSubstract(Vista view, Modelo model) {

        this.model = model;
        this.view = view;
        this.view.btnAdd.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setPrimerNumero(Double.parseDouble(view.txtPimerNumero.getText()));
        model.setSegundoNumero(Double.parseDouble(view.txtSegundoNumero.getText()));
        Add sumar = new Add(model.getPrimerNumero(), model.getSegundoNumero());
        History.getInstance().addOperation(sumar);
        model.setResultado(sumar.operation(model.getPrimerNumero(), model.getSegundoNumero()));
        view.txtResult.setText(String.valueOf(model.getResultado()));
    }

    public static Response createAddition(String numero1, String numero2) {
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
            history.addOperation(new Add(intN1,intN2));
            return new Response("Addition created successfully", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

}
