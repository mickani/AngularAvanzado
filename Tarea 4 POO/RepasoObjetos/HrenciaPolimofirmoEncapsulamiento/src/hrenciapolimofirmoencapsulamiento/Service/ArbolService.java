package hrenciapolimofirmoencapsulamiento.Service;

import hrenciapolimofirmoencapsulamiento.entidades.Arbol;
import java.util.Scanner;

public class ArbolService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//    public String crearArbol() {
    private String crearArbol() {
        System.out.println("CREAR ÁRBOL");
        Arbol a = new Arbol();

        System.out.print("\n-Nombre: ");
        a.setNombre(leer.next());

        System.out.print("-Alto Tallo: ");
        a.setAltoTallo(leer.nextDouble());

        System.out.print("-Tiene Hojas?: ");
        a.setTieneHojas(leer.nextBoolean());

        System.out.print("-Clima Ideal: ");
        a.setClimaIdeal(leer.next());

        System.out.print("-Variedad: ");
        a.setVariedad(leer.next());

        System.out.print("-Tipo Tronco: ");
        a.setTipoTronco(leer.next());

        System.out.print("-Radio Tronco: ");
        a.setRadioTronco(leer.nextDouble());

        System.out.print("-Tipo Hojas: ");
        a.setTipoHoja(leer.next());

        System.out.println("\nHOLA, SOY UN ÁRBOL Y ESTAS SON MIS CARACTERÍSTICAS: ");

        return a.toString();
    }
   
}
