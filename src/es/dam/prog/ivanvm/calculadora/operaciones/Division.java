package es.dam.prog.ivanvm.calculadora.operaciones;

import es.dam.prog.ivanvm.calculadora.OperacionEntera;
import es.dam.prog.ivanvm.calculadora.OperacionReal;

public class Division implements Calculable {

    private final static String MSG_ERROR_DENOM = "Error. El denominador no puede ser 0.";
    // private final static String MSG_ERROR_INPUT = "Error. No se permiten valores que no sean numéricos.";

    public int calcular(OperacionEntera op) throws DivisionException {
        if(op.getOperando2() != 0) {
            return op.getOperando1() / op.getOperando2();
        } else {
            throw new DivisionException(MSG_ERROR_DENOM);
        }
        
    }

    public double calcular(OperacionReal op) throws DivisionException {
        if(op.getOperando2() != 0) {
            return op.getOperando1() / op.getOperando2();
        } else {
            throw new DivisionException(MSG_ERROR_DENOM);
        }
    }
}
