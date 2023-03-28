package es.dam.prog.ivanvm.ioutil;

import java.util.Scanner;

public class TecladoUtil {
    public int inputInt(String msg) throws IOUtilException {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }

    public int inputInt(String msg, int min, int max) throws IOUtilException {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextInt();
    }

    public double inputDouble(String msg) throws IOUtilException {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextDouble();
    }

    public double inputDouble(String msg, int min, int max) throws IOUtilException {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextDouble();
    }

    public char inputChar(String msg) throws IOUtilException {
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine().charAt(0);
    }
}
