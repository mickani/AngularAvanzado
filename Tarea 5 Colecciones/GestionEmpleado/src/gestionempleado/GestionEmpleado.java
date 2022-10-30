package gestionempleado;

import gestionempleado.service.EmpleadoService;

public class GestionEmpleado {

    public static void main(String[] args) {
        EmpleadoService es = new EmpleadoService();
        es.menu();
    }

}
