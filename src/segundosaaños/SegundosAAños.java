package segundosaaños;

import java.util.Scanner;

public class SegundosAAños {

    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
        int hora =60 ,dia =24, mes =30, anio =365, min =60,seg, x;
                
        System.out.println("CONVERTIDOR");
        System.out.println("Segundos a convertir:\n");
        seg=teclado.nextInt();
            
        x = (((((seg/min)/hora)/dia)/mes)/anio);
        System.out.println("Los años son:\n"+x);
    }
    
}
