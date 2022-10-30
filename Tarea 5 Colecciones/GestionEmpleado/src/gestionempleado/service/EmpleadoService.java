package gestionempleado.service;

import gestionempleado.entidad.Empleado;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EmpleadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Set<Empleado> empleados = new HashSet<>();

    //CREAR
    public Empleado crearEmpleado() {
        System.out.println("---------------------\nCREAR EMPLEADO");
        Empleado e = new Empleado();
        System.out.print("-Nombre: ");
        e.setNombre(leer.next());

        System.out.print("-Legajo: ");
        e.setLegajo(leer.nextInt());

        System.out.print("-DNI: ");
        e.setDNI(leer.nextInt());

        System.out.print("-Sueldo: ");
        e.setSueldo(leer.nextDouble());

        System.out.println("<EMPLEADO CREADO>\n");

        return e;
    }

    //MOSTRAR
    public void mostrarEmpleados(Set<Empleado> empleados) {
        if (empleados.size() == 0) {
            System.err.println("LISTA VACÍA!\n");
        } else {
            System.out.println("---------------------\nMOSTRAR TODOS LOS EMPLEADOS");
            int cont = 1;
            for (Empleado empleado : empleados) {
                System.out.println("Empleado n°: " + cont + "\n" + empleado.toString() + "\n...................");
                cont++;
            }
        }
    }

    public void mostrarUnEmpleado(Set<Empleado> empleados) {

        if (empleados.size() == 0) {
            System.err.println("LISTA VACÍA!");
        } else {
            System.out.println("---------------------\nMOSTRAR EMPLEADO");
            System.out.print("*BUSCAR POR LEGAJO: ");
            int legajo = leer.nextInt();
            boolean bandera = false;

            for (Empleado empleado : empleados) {
                if (empleado.getLegajo() == legajo) {
                    System.out.println("\n-Empleado: \n" + empleado + "\n");
                    bandera = true;
                }
            }
            if (!bandera) {
                System.err.println("NO SE ENCONTRÓ EMPLEADO!\n");
            }
        }
    }

    //MODIFICAR
    public void modificarSueldo(Set<Empleado> empleados) {

        if (empleados.size() == 0) {
            System.err.println("LISTA VACÍA!");
        } else {
            System.out.println("---------------------\nMODIFICAR SUELDO");
            System.out.print("*BUSCAR POR LEGAJO: ");
            int legajo = leer.nextInt();
            boolean bandera = false;

            for (Empleado empleado : empleados) {
                if (empleado.getLegajo() == legajo) {
                    System.out.println("\n-Empleado: " + empleado.getNombre() + "\n-N° Legajo: " + empleado.getLegajo() + "\n-Sueldo: " + empleado.getSueldo());
                    System.out.println("-Nuevo sueldo: ");
                    empleado.setSueldo(leer.nextDouble());
                    System.out.println("-SUELDO MODIFICADO.\n-Sueldo actual: " + empleado.getSueldo() + "\n");
                    bandera = true;;
                }
            }
            if (!bandera) {
                System.err.println("NO SE ENCONTRÓ EMPLEADO!\n");
            }
        }
    }

    //ELIMINAR
    public void eliminarEmpleado(Set<Empleado> empleados) {
        if (empleados.size() == 0) {
            System.err.println("LISTA VACÍA!");
        } else {
            System.out.println("---------------------\nELIMINAR EMPLEADO");
            System.out.print("*BUSCAR POR LEGAJO: ");
            int legajo = leer.nextInt();
            boolean bandera = false;

            for (Empleado empleado : empleados) {
                if (empleado.getLegajo() == legajo) {
                    System.out.println("\n-Empleado: " + empleado.getNombre() + "\n-N° Legajo: " + empleado.getLegajo() + "\n-Sueldo: " + empleado.getSueldo());
                    empleados.remove(empleado);
                    System.out.println("-EMPLEADO ELIMINADO\n");
                    bandera = true;
                    break;
                }
            }
            if (!bandera) {
                System.err.println("NO SE ENCONTRÓ EMPLEADO!\n");
            }
        }
    }

    //MENÚ
    public void menu() {
        System.out.println("--------------------------\n***GESTIÓN DE EMPLEADOS***\n--------------------------");

        String operacion = "s";
        while (operacion.equalsIgnoreCase("s")) {
            System.out.println("\nMENÚ: "
                    + "\na) Agregar Empleado."
                    + "\nb) Eliminar Empleado."
                    + "\nc) Actualizar Sueldo."
                    + "\nd) Ver lista completa de empleados."
                    + "\ne) Ver datos de un empleado."
                    + "\nf) SALIR.\n");
            String opcion = leer.next();
            switch (opcion.toLowerCase()) {
                case "a":
                    empleados.add(crearEmpleado());
                    System.out.print("Desea realizar otra operación? S/N: ");
                    operacion = leer.next();
                    break;
                case "b":
                    eliminarEmpleado(empleados);
                    System.out.print("Desea realizar otra operación? S/N: ");
                    operacion = leer.next();
                    break;
                case "c":
                    modificarSueldo(empleados);
                    System.out.print("Desea realizar otra operación? S/N: ");
                    operacion = leer.next();
                    break;
                case "d":
                    mostrarEmpleados(empleados);
                    System.out.print("Desea realizar otra operación? S/N: ");
                    operacion = leer.next();
                    break;
                case "e":
                    mostrarUnEmpleado(empleados);
                    System.out.print("Desea realizar otra operación? S/N: ");
                    operacion = leer.next();
                    break;
                case "f":
                    operacion = "n";
                    break;
                default:
                    System.err.println("Esa opción no existe");
            }
        }
    }

}
