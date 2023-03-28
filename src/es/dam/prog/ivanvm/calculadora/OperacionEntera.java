package es.dam.prog.ivanvm.calculadora;

public class OperacionEntera extends Operando {
    private int operando1 = 0;
    private int operando2 = 0;

    public OperacionEntera(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }
    
    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
