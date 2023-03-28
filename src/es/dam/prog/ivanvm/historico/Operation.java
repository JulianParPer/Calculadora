package es.dam.prog.ivanvm.historico;

public class Operation {
    private int oper1       = 0;
    private int oper2       = 0;
    private String operando = "";
    
    public Operation(int oper1, int oper2, String operando) {
        this.oper1 = oper1;
        this.oper2 = oper2;
        this.operando = operando;
    }

    public int getOper1() {
        return oper1;
    }

    public void setOper1(int oper1) {
        this.oper1 = oper1;
    }

    public int getOper2() {
        return oper2;
    }

    public void setOper2(int oper2) {
        this.oper2 = oper2;
    }

    public String getOperando() {
        return operando;
    }

    public void setOperando(String operando) {
        this.operando = operando;
    }
}
