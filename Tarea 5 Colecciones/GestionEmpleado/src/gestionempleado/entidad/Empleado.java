package gestionempleado.entidad;

public class Empleado {

    private int legajo;
    private String nombre;
    private int DNI;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(int legajo, String nombre, int DNI, double sueldo) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return ".Legajo=" + legajo + ", \n.Nombre=" + nombre + "\n.DNI=" + DNI + "\n.Sueldo=" + sueldo;
    }
    
}
