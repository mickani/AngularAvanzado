/*Realizar un programa que permita la carga de 10 números en un vector. Una vez 
cargados, se necesita que el programa determine cual es el mayor y cuál es el menor de ellos.*/
package tarea2;

import java.util.Scanner;

public class NewClass {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void mayorMenor() {
        
        int array[] = new int[5];
        int mayor = 0;
        int menor = 999999999;
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Valor " + i + ": ");
            array[i] = leer.nextInt();
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            } else if (array[i] < menor) {
                menor = array[i];
            }
        }
        
        System.out.println("Mayor: " + mayor);
        
        System.out.println("Menor: " + menor);
    }

    /*Llevar a cabo un programa que permita completar con números 1 toda la diagonal principal de una matriz de 6 x 6. 
    Entiéndase por diagonal principal aquella que comienza en [0,0] y termina en [6,6].*/
    public void diagonal() {
        int matriz[][] = new int[6][6];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[0][j]=1;
            }
        }
    }
    
}
