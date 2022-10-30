package repasoobjetos.service;

import java.util.Scanner;
import repasoobjetos.entidad.VideoJuego;

public class VideoJuegoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    VideoJuego[] videoJuegos = new VideoJuego[3];

    public void almacenarJuegos(VideoJuego[] videoJuegos) {
        for (int i = 0; i < videoJuegos.length; i++) {
            VideoJuego vj = new VideoJuego();
            System.out.println("CARGAR JUEGO NÚM " + (i + 1));
            System.out.print("-Código: ");
            vj.setCodigo(leer.nextInt());

            System.out.print("-Título: ");
            vj.setTitulo(leer.next());

            System.out.print("-Consola: ");
            vj.setConsola(leer.next());

            System.out.print("-Jugadores: ");
            vj.setCantidadJugadores(leer.nextInt());

            System.out.print("-Categoría: ");
            vj.setCategoría(leer.nextInt());

            videoJuegos[i] = vj;
            System.out.println("----------------------");
        }
    }

    public void mostrarJuegos(VideoJuego[] videoJuegos) {
        for (int i = 0; i < videoJuegos.length; i++) {
            System.out.println("JUEGO NÚM " + (i + 1));
            System.out.println("-Titulo: " + videoJuegos[i].getTitulo() + "\n-Consola: " + videoJuegos[i].getConsola() + "\n-Jugadores: " + videoJuegos[i].getCantidadJugadores());
            System.out.println("------------------");
        }
    }

    public void modificar(VideoJuego[] videoJuegos) {
        System.out.println("-Solo puede modificar 2 juegos.");
        
        int opcion;
        String opcion2 = "s";
        int cont = 0;

        while (cont != 2 && opcion2.equalsIgnoreCase("s")) {
            System.out.println("-Qué juego desea modificar? \n-N°1.\n-N°2.\n-N°3.");
            opcion = leer.nextInt()-1;
            System.out.println("\nMODIFICAR JUEGO NÚM. " + (opcion+1));
            System.out.print("-Modificar título: ");
            videoJuegos[opcion].setTitulo(leer.next());

            System.out.print("-Modificar cant. jugadores: ");
            videoJuegos[opcion].setCantidadJugadores(leer.nextInt());

            cont++;

            if (cont != 2) {
                System.out.print("-Desea modificar otro juego? S/N: ");
                opcion2 = leer.next();
            } else {
                System.out.println("-Se modificaron 2 juegos.");
            }
        }
        mostrarJuegos(videoJuegos);
    }
    
    public void mostrarJuegosNintendo64(VideoJuego[] videoJuegos){
        int cont=0;
        for (int i = 0; i < videoJuegos.length; i++) {
            if (videoJuegos[i].getConsola().equalsIgnoreCase("Nintendo 64")) {
                System.out.println(videoJuegos[i].toString());
                cont++;
            }
        }
        if (cont==0) {
            System.out.println("No se registran juegos de consola 'Nintendo 64'");
        }
    }

}
