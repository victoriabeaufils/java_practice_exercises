/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Viky
 */
public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in);
    Rectangulo r0 = new Rectangulo();

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base y la altura");
        r0.setBase(leer.nextDouble());
        r0.setAltura(leer.nextDouble());

        return r0;
    }

    //Calcular superficie.
    public double calcularSuperficie() {
        return (r0.getAltura() + r0.getBase());
    }

    //Calcular perímetro. 
    public double calcularPerimetro() {
        return 2 * (r0.getBase() + r0.getAltura());
    }

    //Dibujar rectángulo.
    public void dibujarRectangulo() {
        for (int i = 0; i < r0.getAltura(); i++) {
            for (int j = 0; j < r0.getBase(); j++) {
                if (i == 0 || i == (r0.getAltura() - 1) || j == 0 || j == (r0.getBase() - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


    
