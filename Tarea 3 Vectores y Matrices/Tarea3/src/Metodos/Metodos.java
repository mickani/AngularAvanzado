package Metodos;

import java.util.Scanner;

public class Metodos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//VECTORES:
    /*EJERCICIO 1: a. Llevar a cabo un programa que incluya un vector que almacene los nombres: 
Alejandra, Leonardo, Rosa, Guillermo, Daniel, María y Ana. Realizar un recorrido del vector para
cargar los datos y otro recorrido para mostrar los mismos por pantalla.*/
    public void nombres() {
        String nombres[] = new String[7];

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduzca nombre n° " + (i + 1));
            nombres[i] = leer.next();
        }

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre n° " + (i + 1) + ": " + nombres[i]);
        }
    }

    /*EJERCICIO 2: Realizar un programa que permita la carga de 10 números en un vector. 
Una vez cargados, se necesita que el programa cuente e informe por pantalla cuántas veces se
cargó el número 3.*/
    public void num() {
        int num[] = new int[5];
        int cont = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduzca num n° " + (i + 1));
            num[i] = leer.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 3) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("El núm 3 apareció " + cont + " veces.");
        } else {
            System.out.println("El núm 3 no se encontró.");
        }
    }

    /*EJERCICIO 3:Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir de esto,
necesita un programa que determine y muestre por pantalla la suma total de sus 12 sueldos
y el promedio de sueldo que tuvo en el año.*/
    public void sueldos() {
        float sueldo[] = new float[3];
        float promedioSueldo = 0;
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println("-Sueldo n° " + (i + 1));
            sueldo[i] = leer.nextFloat();
            promedioSueldo += sueldo[i];
        }
        System.out.println("Promedio sueldo: " + promedioSueldo / sueldo.length);
    }

    /*EJERCICIO 4:En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas de
5 ciudades de la provincia de San Juan. En el primer vector se guardan los nombres de las
ciudades, en el segundo las temperaturas mínimas alcanzadas y en el tercero las
temperaturas máximas alcanzadas en la última semana. Se necesita un programa que
permita la carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá
poder informar por pantalla cual fue la ciudad con la temperatura más baja y cual con la
temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
     */
    public void tempSanjuan() {

        String ciudad[] = new String[3];
        float tempMin[] = new float[3];
        float tempMax[] = new float[3];

        float tMin = 200;
        float tMax = 0;

        String ciudadTempMin = "";
        String ciudadTempMax = "";

        for (int i = 0; i < ciudad.length; i++) {
            System.out.print("\n-Ciudad n°" + (i + 1) + ": ");
            ciudad[i] = leer.next();
            System.out.print("-Temp. max.: ");
            tempMax[i] = leer.nextFloat();
            System.out.print("-Temp. min.: ");
            tempMin[i] = leer.nextFloat();
        }

        for (int i = 0; i < tempMax.length; i++) {
            if (tMax < tempMax[i]) {
                tMax = tempMax[i];
                ciudadTempMax = ciudad[i];
            }
            if (tMin > tempMin[i]) {
                tMin = tempMin[i];
                ciudadTempMin = ciudad[i];
            }
        }
        System.out.println("\nMAX TEMP.\n-Ciudad: " + ciudadTempMax + " (" + tMax + "C°)");

        System.out.println("\nMIN TEMP.\n-Ciudad: " + ciudadTempMin + " (" + tMin + "C°)");
    }

//MATRICES:
    /*EJERCICIO 1:Llevar a cabo un programa que permite cargar completamente con números 5 una matriz
de 4x5 (4 filas, 5 columnas).*/
    public void matrizCinco() {
        int matriz[][] = new int[4][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = 5;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    /*EJERCICIO 2:  Llevar a cabo un programa que permita cargar mediante teclado una matriz de 3 x 3 
(3 filas, 3 columnas) con razas de perros. Una vez cargada, se debe permitir al usuario
ingresar por teclado una raza de perro que quiera buscar; el programa deberá poder
encontrarla y mostrar un mensaje con la posición (fila, columna) donde la encontró.
En caso de que la raza de perro no se encuentre en la matriz, se deberá informar la
situación mediante un mensaje por pantalla.*/
    public void razasPerros() {
        String razas[][] = new String[2][2];
        int cont = 1;
        for (int i = 0; i < razas.length; i++) {
            for (int j = 0; j < razas[0].length; j++) {
                System.out.print("Ingrese Raza n°" + cont);
                razas[i][j] = leer.next();
                cont++;
            }
        }
        System.out.print("-Buscar raza: ");
        String buscarRaza = leer.next();
        boolean bandera = false;
        for (int i = 0; i < razas.length; i++) {
            for (int j = 0; j < razas[0].length; j++) {
                if (buscarRaza.equalsIgnoreCase(razas[i][j])) {
                    bandera = true;
                    System.out.println("La raza " + buscarRaza + " se encuentra en la posición " + i + ":" + j);
                    break;
                }
            }
        }
        if (!bandera) {
            System.out.println("No se encontró la raza.");
        }

    }

    /*EJERCICIO 2:En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos de secundario.
Cada fila corresponde a las notas y al promedio de cada alumno.
i. Se necesita un programa que permita a un profesor cargar en las 3 primeras posiciones
de cada fila las notas del alumno y que en la última columna se calculen los promedios.
ii. Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el
promedio correspondiente recorriendo la matriz. */
    public void notas() {
        float notas[][] = new float[4][4];
        int longitud=notas.length;
        String alumnos[]={"Mica", "Juan", "Marcela", "Jorge"};
        int cont = 1;
        float aux=0;
        

        for (int i = 0; i < notas.length; i++) {
            System.out.println("\nALUMNO: "+alumnos[i].toUpperCase());
            cont=1;
            aux=0;
            for (int j = 0; j < notas.length - 1; j++) {
                System.out.print("-Ingrese nota n°" + cont+": ");
                notas[i][j] = leer.nextFloat();
                aux+=notas[i][j];
                notas[i][longitud-1]=aux/(notas.length - 1);
                cont++;
                System.out.println(notas[i][j]+" ");
            }
            System.out.println("\n.....................\n*PROMEDIO: "+notas[i][longitud-1]);
        }
    }
    
    
    
    
    

}
