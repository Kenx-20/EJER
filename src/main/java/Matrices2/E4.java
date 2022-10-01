package Matrices2;

import java.util.Random;

public class E4 {

    public static void main(String[] args) {
        // KENYI CONDOR TRUCIOS//
        // EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO QUE SUME TODAS LA COMUNAS DE
        // LA MATRIZ //
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
        // Suma de columnas
        for (i = 0; i < matriz.length; i++) {
            int sumacol = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumacol += matriz[j][i];
            }
            System.out.println("La suma de la columna " + (i + 1) + " es: " + sumacol);
        }
    }
    
}
