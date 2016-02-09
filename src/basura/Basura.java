package basura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Basura {

    public static void main(String[] args) throws IOException {
        //variables<tipo dato><nombre variable> = <inicializacion>
        int entero = 10;
        //float, String(char),boolean,double
        //prefijos= long/short/unsigned
        
        //% residuo de la division
        int x= 20;
        int y = 3;
        
        System.out.println(x/y);
        System.out.println("Residuo: "+x%y);
        
        //Jerarquia de operadores
        //{} -- [] -- () -- pow,sqrt -- * -- / -- +,-
        
        System.out.println("Dame una variable....");
        BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
        String variable = bf.readLine();
        int z = Integer.parseInt(variable);
        //System.out.println(x + z);
        
        //If --- if(condicion(true))
        
        if(x%2 ==0){ //==(COMPARACION), =(ASIGNACION)
            System.out.println("ES PAR");
        }
        
        //If-ELSE --- if(condicion(true)){}else{}
        if(x%2 ==0){ //==(COMPARACION), =(ASIGNACION)
            System.out.println("ES PAR");
        }
        else{//Negacion o lo que no ocurrio en el else
            System.out.println("ES IMPAR");
        }
        
        //anidar if-else
        
        if(z==1){
            System.out.println("Es uno");
        }
        else{
            if(z==2){
                System.out.println("Es dos");
            }
            else{
                if(z==3){
                    System.out.println("Es tres");
                }
                else{
                    if(z==4){
                        System.out.println("Es cuatro");
                    }
                    else{
                        System.out.println("Es cinco");
                    }
                }
            }
        }
        
        //switch --- switch(variable){casos;}
        switch(z){
            case 1://cada case es un if
                System.out.println("Es uno");
                break;
            case 2:
                System.out.println("Es dos");
                break;
            case 3:
                System.out.println("Es tres");
                break;
            case 4:
                System.out.println("Es cuatro");
                break;
            case 5:
                System.out.println("Es cinco");
                break;
            default://negacoin de todos los anteriores
                System.out.println("No hay mas!");
        }
        
        //WHILE ---while(condicion){}
        while(z <= 20)
            
            
         System.out.println("************");   
        //DO-WHILE ---do{}while(condicion);
            do{
                System.out.println("Dame un password...");
//                pass = bf.readLine();
//                z++;
//            }while(!pass.equals("pass"));
//            
        //FOR --- for(inicializacion; limite; incremento){}
        for(int i =1; i<=20; i++){
            System.out.print(i+", ");
        }    
        
        System.out.println("");
        int j = 1;
        
        while (j <=20){
            System.out.print(j+", ");
            j++;
        }
        
        //ARRAYS
        int[] vector = new int [20];//ipo[] nombre = new tipo[tamaño];
        int[]vector2 = new int[20];
        vector[0] = 12; //vector_nombre[indice];
        
        for(int i=0; i <20;i++){
            vector[i] = i+1;
            System.out.println(vector[i]+", ");
        }
        System.out.println("");
        for(int i=19;i>=0;i--){
            vector2[i]= i+1;
            System.out.println(vector[i]+", ");
        }
        System.out.println("");
        for(int i=0;i<20;i++){
            System.out.println((vector[i]+vector2[i]) + ", ");
        }
  //  }
    
//}
