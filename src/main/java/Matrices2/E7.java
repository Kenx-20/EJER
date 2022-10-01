package Matrices2;

import java.util.Random;

public class E7 {

    public static void main(String[] args) {
        // KENYI CONDOR TRUCIOS//
        // EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA FILAS
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
        // Suma de filas impares
        int suma=0;
        int conta=1;
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i%2==0) {
                    suma=suma+matriz[i][j];
                }
            }
            if (i%2==0) {
                System.out.println("Suma de la fila " + conta + " => " + suma);
            }
            conta++;
            suma=0;
        }
    }
    
}
