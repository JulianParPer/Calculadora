package es.dam.prog.ivanvm.calculadora.operaciones;

import es.dam.prog.ivanvm.calculadora.OperacionEntera;
import es.dam.prog.ivanvm.calculadora.OperacionReal;

public class Resta implements Calculable {
    public int calcular(OperacionEntera op) {
        return op.getOperando1() - op.getOperando2();
    }

    public double calcular(OperacionReal op) {
        return op.getOperando1() - op.getOperando2();
    }
}
