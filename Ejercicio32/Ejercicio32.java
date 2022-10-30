package java_capitulo_5.Ejercicio32;
import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un programa que, dado un número entero positivo, diga cuáles son y cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha.");
        System.out.println("Introduzca un número entero positivo: ");
        long num = sc.nextLong();
        long numcopia=num;
        long volteado=0;
        int digito;
        int longitud=0;
        int sumapares=0;

        while(numcopia>0){
            volteado = (volteado * 10) + (numcopia % 10);
            numcopia /= 10;
            longitud++;
        }
        for (int i = 0; i < longitud; i++) {

        digito = (int)(volteado % 10);

        if ((digito % 2) == 0) {
          System.out.print(digito + " ");
          sumapares=sumapares + digito;
        }
  
        volteado /= 10;
    }
    sc.close();

    System.out.println("\nLa suma de los dígitos pares es : " + sumapares);
    }
}
