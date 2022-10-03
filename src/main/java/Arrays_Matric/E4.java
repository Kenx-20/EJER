package Arrays_Matric;
import java.util.Arrays;

public class E4 {

    public static void main(String[] args) {
        //KENYI CONDOR TRUCIOS//
        int[][] matriz = new int[7][7];
        int f;
        
        //Relleno la diagonal principal con 1
        //Solo tengo que recorrer las casillas en las que el número de fila es
        //igual que el número de columna:  matriz[0][0]=matriz[1][1]...=matriz[6][6]=1
        for (f=0 ; f < matriz.length ; f++){
            matriz[f][f]=1;                           
        }
        
        //Muestro las filas de la matriz haciendo uso de la libreria "Arrays"
        for (f=0 ; f < matriz.length ; f++){
            System.out.println(Arrays.toString(matriz[f]));
        }
    }
}