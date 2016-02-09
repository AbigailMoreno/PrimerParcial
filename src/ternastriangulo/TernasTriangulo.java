package ternastriangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernasTriangulo {
    public static int m,n, t=0;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));//para leer lo ingresado por el usuario
         
        do{
        System.out.println("Dame el valor m...");//pide el valor de m 
        m=Integer.parseInt(bf.readLine());//guarda el valor ingresado en la variable
       }while(m<0 || m>1000);//mientras que no sea menor a 0 y mayor a mil
        
        do{
        System.out.println("Dame el valor n...");//pide el valor de n
        n=Integer.parseInt(bf.readLine());//guarda el valor ingresado en la variable
        }while(n<0|| n>1000);//mientras que no sea menor a 0 y mayor a mil
        
    
            for(int a = m; a <= n; a++){
                for(int b = a; b <= n; b++){
                    for(int c = b;c<=n; c++){
                         if(a+b>c && a+c>b && b+c>a){
                            t++;
                         }
                }
            }
        } System.out.println("Ternas: "+t);
    }    
}
