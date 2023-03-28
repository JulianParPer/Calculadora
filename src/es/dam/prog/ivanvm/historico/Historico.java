package es.dam.prog.ivanvm.historico;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    List<Operation> historial = new ArrayList<Operation>();

    public void add(Operation newOp) {
        historial.add(newOp);
    }

    public void remove(Operation op) {
        historial.remove(op);
    }
}
