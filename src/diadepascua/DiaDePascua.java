package diadepascua;

import java.util.Scanner;

public class DiaDePascua {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A,B,C,E,F,G,H,I,J;
        
        do{
        System.out.println("Ingrese el año:");
        A=teclado.nextInt();
        }while(A<1583 || A>9999);
                
        B=A/100+1;
        C=(3*B)/4-12;
        E=(A%19)+1;
        F=(((8*B)+5)/25)-(5+C);
        G=((5*A)/4)-(C+10);
        H=((11*E)+20+F)%30;
        
        if(H!=25){
                H+=1;
        }else{
            if(E>11){
                H+=1;
            }
        }
        I=44-H;
        if(I<21){
            I= I+30;
        }
        J=I+7-((G+I)%7);
        
        if(J<=31){
            System.out.println("Pascua es el "+J+" de marzo");
        }else{
            System.out.println("Pascua es "+(J-31)+" de abril");
        }
    }
    
}
