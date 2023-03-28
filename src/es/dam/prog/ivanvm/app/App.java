package es.dam.prog.ivanvm.app;

import java.util.Scanner;

import es.dam.prog.ivanvm.calculadora.operaciones.Calculable;

public class App {

    private static int inputInt(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextInt();
    }

    private static double inputDouble(String msg) {
        Scanner input = new Scanner(System.in);
        System.out.print(msg);
        return input.nextDouble();
    }

    private static int imprimirMenu() {
        final String MENU_FORMAT = "[1]. Sumar naturales.\n[2]. Sumar reales.\n[3]. Restar reales.\n[4]. Multiplicar reales.\n[5]. Dividir reales.\n\nElige una opción: ";
    
        return inputInt(MENU_FORMAT);
    }

    
    public static void main(String[] args) {
        final String INPUT_INT      = "Introduce un número entero: ";
        final String INPUT_DOUBLE   = "Introduce un número double: ";
        final String DESPEDIDA      = "¡Adiós!";
        
        Calculable calc = new Calculadora();

        int opcion = imprimirMenu();

        switch(opcion) {
            case 1:
                calc.sumar(inputInt(INPUT_INT), inputInt(INPUT_INT));
                break;
            case 2:
                calc.sumar(inputDouble(INPUT_DOUBLE), inputDouble(INPUT_DOUBLE));
                break;
            case 3:
                calc.restar(inputDouble(INPUT_DOUBLE), inputDouble(INPUT_DOUBLE));
                break;
            case 4:
                calc.multiplicar(inputDouble(INPUT_DOUBLE), inputDouble(INPUT_DOUBLE));
                break;
            case 5:
                calc.dividir(inputDouble(INPUT_DOUBLE), inputDouble(INPUT_DOUBLE));
                break;
            default:
                System.out.println(DESPEDIDA);
                break;
        }
    }
}
