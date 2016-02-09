package ejerciciocaracol;

import java.util.Scanner;

public class EjercicioCaracol {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int p,s,r,d=0, s2=0;
        
        System.out.println("Ingrese la profundidad\n");
        p=teclado.nextInt();
        System.out.println("Ingrese los metros que sube por dia\n");
        s=teclado.nextInt();
        System.out.println("Ingrese los metros que baja por noche\n");
        r=teclado.nextInt();
        
        if(s>r){
            do{ 
                s2 = (s2+s) - r;
                d++;
                System.out.println(s2);
            }while(s2<p);
        }
           System.out.println("Tarda "+(d-1)+" dias en salir");
        
    }
    
}
