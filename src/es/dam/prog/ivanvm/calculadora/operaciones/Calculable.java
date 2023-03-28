package es.dam.prog.ivanvm.calculadora.operaciones;

import es.dam.prog.ivanvm.calculadora.OperacionEntera;
import es.dam.prog.ivanvm.calculadora.OperacionReal;

public interface Calculable {
    public int calcular(OperacionEntera op) throws DivisionException;
    public double calcular(OperacionReal op) throws DivisionException;
}
