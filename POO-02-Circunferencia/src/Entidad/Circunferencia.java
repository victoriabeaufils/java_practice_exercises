package Entidad;

import java.util.Scanner;

public class Circunferencia { //ENTIDADES

    Scanner leer = new Scanner(System.in);
    //ATRIBUTOS
    private double radio;

    //CONSTRUCTORES
    //a) Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    //METODOS
    //b) Métodos get y set para el atributo radio de la clase Circunferencia.
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }



}
