package conversioninglesas;

import java.util.Scanner;

public class ConversionInglesas {
    
    public static int millas, furlongs, yardas,pies, auxiliar, q ;//Hacer accesible a todos los metodos en la clase
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{ //Hacer lo siguiente,
            System.out.println("Dame las pulgadas a convertir:\n");
            q= sc.nextInt();
        }while(q<=0 || q>=2000000000); //Mientras que un num sea menor a cero ó mayor a 2millones me volvera a pedir un numero
        
        millas =q/63360;
        auxiliar = q%63360;//Modulo de ***(decimales)
        
        furlongs = auxiliar/7920;//El residuo de lo anterior se divide entre 17920
        auxiliar = auxiliar%7920; //Modulo de ***(decimales)
        
        yardas = auxiliar/36;//El residuo de lo anterior se divide entre 36
        auxiliar = auxiliar%36; //modulo de ***(deicmales)
        
        pies = auxiliar/12;//El residuo de lo anterior se divide entre 12
        auxiliar = auxiliar%12;//Modulo de ***(decimales)
        
        System.out.println("Millas: "+millas);
        System.out.println("Furlongs: "+furlongs);
        System.out.println("Yardas: "+yardas);
        System.out.println("Pies: "+pies);
        System.out.println("Pulgadas: "+auxiliar);
        
    }
    
}
