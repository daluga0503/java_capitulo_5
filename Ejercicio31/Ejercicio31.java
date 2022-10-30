package java_capitulo_5.Ejercicio31;
import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args){

        System.out.println("Introduzca la altura de la L deseada: ");
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        int base = (altura/2)+1;
        for(int i = 1; i<altura;i ++){
        System.out.println("*");
        }

        for(int j = 1 ; j<=base; j ++){
            System.out.print("* ");
        }
        sc.close();
    }
}
