package javapooejercicio3;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in);
    private double numero1;
    private double numero2;

    //a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }

    //c) Métodos get y set.
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
    //en los atributos del objeto.
    public void crearOperacion() {
        System.out.println("Ingrese dos numeros");
        numero1 = leer.nextDouble();
        numero2 = leer.nextDouble();
    }

    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public double sumar() {
        double sumar = numero1 + numero2;

        return sumar;
    }

    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public double restar() {
        double restar = numero1 - numero2;

        return restar;
    }

    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    //fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    public double multiplicacion() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("E R R O R");
            return 0;
        } else {
            double multiplicacion = numero1 * numero2;
            return multiplicacion;
        }

    }

    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    //una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    //informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public double division() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("E R R O R");
            return 0;
        } else {
            double division = numero1 / numero2;
            return division;
        }

    }
}
