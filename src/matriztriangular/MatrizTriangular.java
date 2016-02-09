package matriztriangular;

import java.util.Scanner;

public class MatrizTriangular {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int Filas, Columnas, valores, sum1 = 0,sum2= 0, inf, sup;
        
        
        System.out.println("Dame el tamaño de la matriz");
        Filas = teclado.nextInt();
        Columnas=Filas;
        int matriz[][]=new int[Filas][Columnas];
   for(int i=0;i<Columnas;i++){
            for(int j=0;j<Filas;j++){
                System.out.println("Dame la posicion: "+i+","+j);
                matriz[i][j]= teclado.nextInt();
            }
            
        }
   
        for(int i=0;i<Columnas;i++){
            for(int j=0;j<Filas;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println(); //para que brinque de fila
        } System.out.println();
        for(int i=0;i<Filas-1;i++){
            for(int j=i+1;j<Columnas; j++){
                System.out.print(matriz[i][j]+"  ");
            }
        }
        
        System.out.println();
        for(int i=1;i<Filas;i++){
            for(int j=0;j<=i-1; j++){
                System.out.print(matriz[i][j]+"  ");
            }
        }
    }
    
}

