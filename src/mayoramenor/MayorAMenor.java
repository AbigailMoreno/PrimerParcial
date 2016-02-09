package mayoramenor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MayorAMenor {

    public static  int a,b,c,d,e,p,q;
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        do{
            System.out.println("Dame el valor de a..");
            a= Integer.parseInt(bf.readLine());
        }while(a<-1000 ||a>1000);
        
        p=a;
        
        do{
            System.out.println("Dame el valor de b..");
            b= Integer.parseInt(bf.readLine());
        }while(b<-1000 ||b>1000);
        
        if(b>p){
            p=b;
            q=a;
        }
        
        do{
            System.out.println("Dame el valor de c..");
            c= Integer.parseInt(bf.readLine());
        }while(c<-1000 ||c>1000);
        
        if(c>p){
            p=c;
            if(a<b)
                q=a;
            else
                q=b;
        }
        
        do{
            System.out.println("Dame el valor de d..");
            d= Integer.parseInt(bf.readLine());
        }while(d<-1000 ||d>1000);
        
        if(d>p){
            p=d;
            if(c<q)
                q=d;
        }
        
        do{
            System.out.println("Dame el valor de e..");
            e= Integer.parseInt(bf.readLine());
        }while(e<-1000 ||e>1000);
        
        if(e>p){
            p=e;
            if(d<q)
                q=d;
        }
        
        System.out.println(p+" "+q);
    }
    
}
