package es.dam.prog.ivanvm.calculadora;

public class Calculadora implements Calculable {
    @Override
    public int sumar(int x, int y) {
        return x+y;
    }

    @Override
    public double sumar(double x, double y) {
        return x+y;
    }

    @Override
    public double restar(double x, double y) {
        return x-y;
    }

    @Override
    public double multiplicar(double x, double y) {
        return x*y;
    }

    @Override
    public double dividir(double x, double y) {
        return x/y;
    }
}
