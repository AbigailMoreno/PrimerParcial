package diadelasemena;

import java.util.Scanner;

public class DiaDeLaSemena {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int dia, mes, anio,c,b,f,e,f0,f2;
        
        do{//hacer
            System.out.println("Ingresa el año\n");
            anio=teclado.nextInt();//guarda el valor ingresado de año
        }while(anio<=0 || anio>=100000);//mientras que 0<años<100000
        
        do{//hacer
            System.out.println("Ingresa el mes\n");
            mes=teclado.nextInt();//guarda el valor ingresado de mes
        }while(mes<1 || mes>12);//mientras que 1<mes<12
        
        do{//hacaer
            System.out.println("Ingresa el dia\n");
            dia=teclado.nextInt();//guarda el valor ingresado de dia
        }while(dia<1 || dia>31);//mientras que 1<dias<31
        
        if(mes>2){//si mes es mayor que 2
            mes=mes-2;//hace cambios enla misma variable, restandole 2 al mes 
        }else{//si no
            mes=mes+10;//se le agrega 10 a mes y se guarda en la misma variable
            anio=anio-1;
            
        }//algoritmo
            c=anio/100;
            e=anio%100;
            b=(((13*mes)-1)/5) +(e/4)+(c/4);
            f=(b+e+dia-(2*c))%7;//dia en que cae la fecha dada
            
            f0=f-1;//dia antes
            f2=f+1;//dia despues
                
        System.out.println(+f0+" "+f+" "+f2);//imprime dia antes/dia de la fecha/dia siguiente
        
        switch(f){//Imprimira el día segun el numero que de
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 0:
                System.out.println("Domingo");
                break;
        }
    }
    
}
