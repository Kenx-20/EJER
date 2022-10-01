package Matrices2;

import java.util.Random;

public class E5 {

    public static void main(String[] args) {
        // KENYI CONDOR TRUCIOS//
        // EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COLUMNAS
        // IMPARES DE LA MATRIZ //
        Random rd = new Random();
        int i;
        int[][] matriz = new int[10][10];
        // rellenamos matrices
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(19 - 10 + 1) + 10;
            }
        }
        // impresion de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        // Suma de columnas impares
        int suma=0;
        int cont=1;
        for (int j = 0; j < matriz.length; j++) {
            for (i = 0; i < matriz.length; i++) {
                if (j%2==0) {
                    suma=suma+matriz[i][j];
                }               
            }
            if (j%2==0) {
                System.out.println("Suma de la columna " + cont + " => " + suma);
            }
            cont++;
            suma=0;
        }
    }  
}
