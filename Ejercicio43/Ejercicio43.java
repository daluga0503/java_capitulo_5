package java_capitulo_5.Ejercicio43;
import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una número entero positivo: ");
        int num = sc.nextInt();
        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        int posición = sc.nextInt();
        int longitud = 1;
        int volteado=0;
        int numcopia= num;
        
        while(num>=1){
          volteado=(volteado*10)+(num%10);
          num /=10;
        }
            System.out.print("Los numero partidos son el ");
          
          while(volteado>0){

            if(longitud==posición){
                System.out.print(" y el ");
            }
            System.out.print((volteado%10));
            volteado/=10;
            longitud++;

        }
      }
    }

