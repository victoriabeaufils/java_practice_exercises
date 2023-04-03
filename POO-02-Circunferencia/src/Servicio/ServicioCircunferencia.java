/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {
    Circunferencia C0 = new Circunferencia();
    Scanner leer = new Scanner(System.in);
       //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    
    
    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia");
        C0.setRadio(leer.nextDouble());
        //System.out.println("Radio: " + radio);
        return C0;
    }

    //d) Método area(): para calcular el área de la circunferencia (area = pi * radio2).
    public void areaCircunferencia(Circunferencia C0) {

        double area = (Math.PI) * (Math.pow( C0.getRadio(), 2)); // Formula para el área
        System.out.println("Área: " + area);

    }

    //e) Método perimetro(): para calcular el perímetro (perimetro = 2 * pi * radio).
    public void perimetroCircunferencia(Circunferencia C0) {
        double perimetro = 2 * (Math.PI) * C0.getRadio(); // Formula para el perímetro. 
        System.out.println("Perímetro: " + perimetro);
    }
    
}
