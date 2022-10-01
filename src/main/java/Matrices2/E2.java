package Matrices2;

import java.util.Random;

public class E2 {

    public static void main(String[] args) {
        // KENYI CONDOR TRUCIOS//
        // EJERCICIO: MATRIZ DE 10X1O INGRESADO POR TECLADO MULTIPLIQUE LA DIAGONAL
        // PRIMARIA Y SECUNDARIA //
        Random rd = new Random();
        int i;
        int sumDiagP = 0;
        int sumDiagS = 0;
        int[][] matriz = new int[10][10];
        // rellenamos matrices
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rd.nextInt(19-10+1) + 10;
            }
        }
        // impresion de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        // Suma de Diagonal principal de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    sumDiagP += matriz[i][j];
                }
            }
        }
        // Suma de Diagonal secundaria de la matriz
        for (i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == (matriz.length - 1)) {
                    sumDiagS += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal primaria es: " + sumDiagP);
        System.out.println("La suma de la diagonal secundaria es: " + sumDiagS);
        // Producto de las diagonales
        System.out.println("La multiplicación de las diagonales es: " + (sumDiagP*sumDiagS));
    }
    
}
