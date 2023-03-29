/*
 EJERCICIO 01
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ej01.libropoo;

/**
 *
 * @author Viky
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        libro l1 = new libro ();
        l1.cargaLibro();
        l1.muestraLibro();
        libro l2 = new libro ();
         l2.cargaLibro();
        l2.muestraLibro();
        
    }
    
}
