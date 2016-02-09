package ejercicio.pkg3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int fila, columna;
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Tamaño de la matriz");
        columna= teclado.nextInt ();
        
        int[][] matriz = new int[columna] [columna];
        int[] vector = new int [columna];
        
        for(int i = 0; i < columna; i++){
            vector [i] = teclado.nextInt ();
        }
        for (int i = 0; i < columna; i++){
            for (int j = 0; j < columna; j++){
            matriz [i] [j] = teclado.nextInt ();
            }
        }
        for(int i = 0; i < columna; i++){
            for(int j = 0; j < columna; j++){
                System.out.print(matriz [i][j]+vector [i]+"  ");
            }
            System.out.println();
        }
    }
    
}
