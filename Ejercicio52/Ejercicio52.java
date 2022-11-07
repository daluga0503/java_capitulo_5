package java_capitulo_5.Ejercicio52;
import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        int num = sc.nextInt();  
        int longitud=0;
        
        while(num>0){
            num/=10;
            longitud++;
        }
        int primero = (int)(num / Math.pow(10, longitud-1));
        int resto =  (int)(num % Math.pow(10, longitud-1));
        System.out.printf("El número resultante es %d\n", resto*10+primero);  
        sc.close();

    }
}
