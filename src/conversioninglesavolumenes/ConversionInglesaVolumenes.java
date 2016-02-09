package conversioninglesavolumenes;

import java.util.Scanner;

public class ConversionInglesaVolumenes{
       public static void main(String[] args){
           Scanner teclado = new Scanner(System.in);
           int gal, pin,cua,taz, onz;//Ingresadas por el usuario
           int gal2, pin2, cua2, taz2, onz2;//utilizadas para el nuevo valor
                    
           do {//hacer 
               System.out.println("Ingrese los galones: ");//pide al usuario el valor
                gal = teclado.nextInt();//guarda valor en variable
           } while (gal<=0 || gal>=1000);//mientras que (***).
                  
           do {//hacer
               System.out.println("Ingrese las cuartas: ");//pide al usuario el valor
                cua = teclado.nextInt();//guarda valor en variable
           } while (cua<=0 || cua>=1000);//mientras que (***).
           
           do {//hacer 
               System.out.println("Ingrese las pintas: ");//pide al usuario el valor
                pin = teclado.nextInt();//guarda valor en variable
           } while (pin<=0 || pin>=1000);//mientras que (***).
           
           do {//hacer
               System.out.println("Ingrese las tazas: ");//pide al usuario el valor
                taz = teclado.nextInt();//guarda valor en variable
           } while (taz<=0 || taz>=1000);//mientras que (***).
           
           do {//hacer
               System.out.println("Ingrese las onzas: ");//pide al usuario el valor
                onz = teclado.nextInt();//guarda valor en variable
           } while (onz<=0 || onz>=1000);//mientras que (***).
           
           /*8 onzas =1taza
           2 tazas = 1 pinta 
           2 pintas = 1 cuarta
            4 cuartas = 1 galon */
          //Comienzan las conversiones 
           taz2= taz+(onz/8);//Realiza una operacion, guardando el resultado en una nueva variable
           onz2= onz%8;//Con el modulo utiliza el residuo y lo guarda en otra varible
           
           pin2= pin+(taz2/2);
           taz2= taz2%2;
           
           cua2 = cua+(pin2/2);
           pin2=pin2%2;
           
           gal2 = gal+(cua2/4);
           cua2=cua2%4;
           
           System.out.println("Galones: "+gal2);//Muestra al usuario los galones
           System.out.println("Cuartas: "+cua2);//Muestra al usuario las cuartas
           System.out.println("Pintas: "+pin2);//Muestra al usuario las pintas
           System.out.println("Tazas: "+taz2);//Muestra al usuario las tazas
           System.out.println("Onzas: "+onz2);//Muestra al usuario las onzas
           
           
           
       }
}
