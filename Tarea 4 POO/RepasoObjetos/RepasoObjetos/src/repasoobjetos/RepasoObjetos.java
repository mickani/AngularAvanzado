package repasoobjetos;

import repasoobjetos.entidad.VideoJuego;
import repasoobjetos.service.VideoJuegoService;

public class RepasoObjetos {

    public static void main(String[] args) {
        VideoJuegoService s= new VideoJuegoService();
        
        VideoJuego[] videoJuegos = new VideoJuego[3];
        System.out.println("\nALMACENAR JUEGOS...");
        s.almacenarJuegos(videoJuegos);
        
        System.out.println("\nMOSTRAR JUEGOS...");
        s.mostrarJuegos(videoJuegos);
        
        System.out.println("\nMODIFICAR JUEGOS...");
        s.modificar(videoJuegos);
        
        System.out.println("\nMOSTRAR JUEGOS 'Nintendo 64'...");
        s.mostrarJuegosNintendo64(videoJuegos);
    }

}
