package ej01.libropoo;

import java.util.Scanner;

public class libro {
    public String ISBN;
    public String Titulo;
    public String Autor;
    public int nPag;

    public libro (String ISBN, String Titulo, String Autor, int nPag) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.nPag = nPag;
    }

public libro () {
    
}
    /**
     * Metodo Carga de datos
     */
    public void cargaLibro () {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.print("Ingrese código ISBN -> " );
        ISBN = leer.next();
        System.out.println("");
        System.out.print("Ingrese título -> " );
        Titulo = leer.next();
        System.out.println("");
        System.out.print("Ingrese autor -> " );
        Autor = leer.next();
        System.out.println("");
        System.out.print("Ingrese número paginas -> " );
        nPag = leer.nextInt();
        
    }

    /**
     * Metodo impresión de los datos cargados
     */
public void muestraLibro(){
    System.out.println("ISBN:" + ISBN + "\n"
            + "Título:"+ Titulo +"\n" 
            +"Autor:"+ Autor + "\n" 
           +  "npag:"+ nPag);
}    

    
}


