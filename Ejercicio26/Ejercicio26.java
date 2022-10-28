package java_capitulo_5.Ejercicio26;
import java.util.Scanner;

public class Ejercicio26 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();
        System.out.println("Introduzca un dígito: ");
        int digito = sc.nextInt();

        int numcopia=num;
        int volteado = 0;
        int longitud = 0;
        int posición = 1;

        while (numcopia > 0) {
            volteado = (volteado * 10) + (numcopia % 10);
            numcopia /= 10;
            longitud++;
        }

        if(numcopia == 1);
        longitud = 1;

        while (volteado != 1) {
            if ((volteado % 10) == digito) {
            System.out.print(posición + " ");
            }
            volteado /= 10;
            posición++;
        } 
        sc.close();
    }
    
}
