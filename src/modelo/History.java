
package modelo;

import modelo.Operation;
import java.util.ArrayList;


public class History {
    
    private ArrayList<Operation> operations;
    private static History instance;

    public History() {
        this.operations = new ArrayList<>();
    }
    
    public void addOperation(Operation operation) {
        this.operations.add(operation);
    }

    public ArrayList<Operation> getOperations() {
        return operations;
    }
    
    
    
    
     public static History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }
    
    
}
