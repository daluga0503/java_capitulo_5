package java_capitulo_5.Ejercicio52;
import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        int num = sc.nextInt();
        int volteado=num;  
        int contador=0;
        int primero=0;
        
        while(num>0){
            volteado=(volteado*10)+(num%10);
            num/=10;
            contador++;
        }
        int volteado2=volteado;
        
        for(int i=0;i<contador;i++){
            
            if(i==0){
                primero=volteado%10;
            }
            volteado/=10;
        }
        
        for(int i=1;i<=contador;i++){
            volteado2/=10;
            if(contador!=i){
                if(volteado2%10!=0){
                System.out.print(volteado2%10);
                }
            }
        }      
        System.out.print(primero);
        sc.close();

    }
}
