package es.dam.prog.ivanvm.calculadora;

public class OperacionReal extends Operando {
    private double operando1 = 0;
    private double operando2 = 0;

    public OperacionReal(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }
    
    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }
}
