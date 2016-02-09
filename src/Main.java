import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int num1, num2, suma;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño 1");
        num1 = leer.nextInt();
        
        
        System.out.println("Ingresa el tamaño ");
        num2 = leer.nextInt();
       int[][] matriz = new int[num1][num1];
       int[][] matriz2 = new int[num2][num2];
       
       if (num1 == num2){
           System.out.println("Son cuadradas, podemos continuar");
           
           for (int i = 0 ; i < matriz.length ; i++ ){
           for(int j = 0 ; j < matriz[0].length ; j++){
               
               System.out.println("Ingresa la pos"+i+","+j);
               matriz[i][j] = leer.nextInt();
           }
       }
           
           for (int i = 0 ; i < matriz2.length ; i++ ){
           for(int j = 0 ; j < matriz2[0].length ; j++){
               
               System.out.println("Ingresa la pos"+i+","+j);
               matriz2[i][j] = leer.nextInt();
           }
       }
           
           for (int i = 0 ; i < num1 ; i++ ){
           for(int j = 0 ; j < num1 ; j++){
               
               System.out.print(matriz[i][j] + matriz2[i][j]+"  ");
               
           }
           
               System.out.println("");
       }
           
           
           
       }
       else{
           System.out.println("No son iguales, exit");
       }
       
       
        
    }
    
}
