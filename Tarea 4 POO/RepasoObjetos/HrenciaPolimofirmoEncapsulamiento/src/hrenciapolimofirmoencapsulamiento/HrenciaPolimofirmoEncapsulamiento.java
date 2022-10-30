package hrenciapolimofirmoencapsulamiento;

import hrenciapolimofirmoencapsulamiento.Service.ArbolService;
import hrenciapolimofirmoencapsulamiento.Service.ArbustoService;
import hrenciapolimofirmoencapsulamiento.Service.FlorService;

public class HrenciaPolimofirmoEncapsulamiento {

    public static void main(String[] args) {
        ArbolService arbolS= new ArbolService();
        FlorService florS=new FlorService();
        ArbustoService arbustoS=new ArbustoService();
        
        
//        System.out.println(arbolS.crearArbol());
        System.out.println(florS.crearFlor());
        System.out.println(arbustoS.crearArbusto());
    }
}
