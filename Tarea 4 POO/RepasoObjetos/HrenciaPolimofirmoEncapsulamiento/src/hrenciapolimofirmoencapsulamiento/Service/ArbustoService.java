package hrenciapolimofirmoencapsulamiento.Service;

import hrenciapolimofirmoencapsulamiento.entidades.Arbusto;
import java.util.Scanner;

public class ArbustoService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String crearArbusto() {
        System.out.println("CREAR ARBUSTO");
        
        Arbusto a = new Arbusto();
        
        System.out.print("\n-Nombre: ");
        a.setNombre(leer.next());
        
        System.out.print("-Alto Tallo: ");
        a.setAltoTallo(leer.nextDouble());
        
        System.out.print("-Tiene Hojas?: ");
        a.setTieneHojas(leer.nextBoolean());
        
        System.out.print("-Clima Ideal: ");
        a.setClimaIdeal(leer.next());

        System.out.print("-Ancho Arbusto: ");
        a.setAnchoArbusto(leer.nextDouble());

        System.out.print("-Es Doméstico?: ");
        a.setDomestico(leer.nextBoolean());

        System.out.print("-Variedad: ");
        a.setVariedadArbusto(leer.next());

        System.out.print("-Color de Hojas: ");
        a.setColorHojas(leer.next());
        
        System.out.print("-Se Poda?: ");
        a.setSePoda(leer.nextBoolean());
        
        System.out.println("\nHOLA, SOY UN ARBUSTO Y ESTAS SON MIS CARACTERÍSTICAS: ");
        

        return a.toString();
    }

}
