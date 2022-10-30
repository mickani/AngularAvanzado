package hrenciapolimofirmoencapsulamiento.Service;

import hrenciapolimofirmoencapsulamiento.entidades.Flor;
import java.util.Scanner;

public class FlorService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String crearFlor() {
        System.out.println("CREAR FLOR");

        Flor f = new Flor();

        System.out.print("\n-Nombre: ");
        f.setNombre(leer.next());

        System.out.print("-Alto Tallo: ");
        f.setAltoTallo(leer.nextDouble());

        System.out.print("-Tiene Hojas?: ");
        f.setTieneHojas(leer.nextBoolean());

        System.out.print("-Clima Ideal: ");
        f.setClimaIdeal(leer.next());

        System.out.print("-Color de Pétalos: ");
        f.setColorPetalo(leer.next());

        System.out.print("-Cant de Pétalos: ");
        f.setCantPetalo(leer.nextInt());

        System.out.print("-Color Pistillo: ");
        f.setColorPistillo(leer.next());

        System.out.print("-Variedad: ");
        f.setVariedadFlor(leer.next());

        System.out.print("-Estacion en la que Florece: ");
        f.setEstacionFlorece(leer.next());

        System.out.println("\nHOLA, SOY UNA FLOR Y ESTAS SON MIS CARACTERÍSTICAS: ");

        return f.toString();
    }

}
