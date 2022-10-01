package Matrices2;

import java.util.Random;

public class E6 {

    public static void main(String[] args) {
        // KENYI CONDOR TRUCIOS//
        // EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COLUMNAS
        // PARES DE LA MATRIZ //
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
        // Suma de columnas pares
        int suma=0;
        int conta=1;
        for (int j = 0; j < matriz.length; j++) {
            for (i = 0; i < matriz[j].length; i++) {
                if (j%2==1) {
                    suma = suma + matriz[i][j];
                }
            }
            if (j%2==1) {
                System.out.println("Suma de la columna " + conta + " => " + suma);
            }
            conta++;
            suma=0;    
        }
    }
}
