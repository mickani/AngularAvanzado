package Metodos;

import java.util.Scanner;
import tarea2.NewClass;

public class Metodo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    

    /*Ejercicio N° 1: 
Sumar los 10 primeros números naturales (1+2+3+4+…+10), 
mostrando por consola el resultado parcial obtenido por cada suma.*/
//    public void sumaNumNaturales() {
//        int resultado = 0;
//        for (int i = 1; i < 11; i++) {
//            System.out.println(resultado + " + " + i + " = " + (resultado + i));
//            resultado += i;
//        }
//    }

    /*Ejercicio N° 2: 
Escriba un programa que calcule el sueldo de un empleado basado en lo siguiente: 
- Se debe solicitar el ingreso del nombre, edad y sueldo base del empleado. 
- Habrá una bonificación (más dinero) según la edad del empleado:
o Si tiene 45 años o más, se agregará un 20% a su sueldo base.
o Si es menor de 45 años, sólo recibirá 5% de bonificación.
Finalmente, se debe mostrar un mensaje con el nombre del empleado y el sueldo que cobrará.*/
//    public void sueldo() {
//        System.out.print("-Nombre: ");
//        String nombre = leer.next();
//
//        System.out.print("-Edad: ");
//        int edad = leer.nextInt();
//
//        System.out.print("-Sueldo base: ");
//        float sueldoBase = leer.nextFloat();
//
//        if (edad >= 45) {
//            sueldoBase += (sueldoBase * 20 / 100);
//        } else if (edad < 45) {
//            sueldoBase += (sueldoBase * 5 / 100);
//        }
//
//        System.out.println("El sueldo de " + nombre + " es $" + sueldoBase);
//    }

    /*Ejercicio N° 3:
Escribir un programa en JAVA que sirva para calcular la suma de una serie de 
números que serán ingresados por el usuario.
Se ingresarán números enteros, hasta que el usuario ingrese un CERO para salir del ciclo.
Al finalizar, mostrar el resultado de la suma de los números.*/
//    public void sumaNumeros() {
//        System.out.print("-Ingrese núm: ");
//        int num = leer.nextInt();
//        int aux = 0;
//        if (num != 0) {
//            while (num != 0) {
//                aux = aux + num;
//                System.out.println("-Suma de núm ingresados= " + aux);
//                System.out.println("-Vuelva a ingresar un núm.: ");
//                num = leer.nextInt();
//            }
//        }
//        System.out.println("Ingresó '0', fin ejecución.");
//    }

/*Ejercicio N° 4:
Escribir un programa en JAVA que pida 10 números enteros al usuario.
Esta carga de datos debe realizarse a través de un ciclo FOR.
Lo que se espera del programa es que nos informe lo siguiente: 
- ¿Cuántos números IMPARES se ingresaron?
- ¿Cuántos números PARES se ingresaron*/    
    
//    public void numParesImpares(){
//        int pares=0;
//        int impares=0;
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Núm "+(i+1)+": ");
//            int num=leer.nextInt();
//            if (num%2==0) {
//                pares+=1;
//            }else{
//                impares+=1;
//            }
//        }
//        System.out.println("-Pares: "+pares+"\n-Impares: "+impares);
//    }
            
        

    
    
}
