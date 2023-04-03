/*
EJERCICIO 02
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi * radio2).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 * pi * radio).
 */
package ej02.circunferencia;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCircunferencia Sc = new ServicioCircunferencia();

        Circunferencia C1 = Sc.crearCircunferencia(); 
         System.out.println("Radio: " + C1.getRadio());
        Sc.areaCircunferencia(C1);
        Sc.perimetroCircunferencia(C1);

    }

}
