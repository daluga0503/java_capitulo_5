package java_capitulo_5.Ejercicio33;
import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la alatura de la U: ");
        int altura=sc.nextInt();
        int base = altura-2;

        for(int i = 1; i<=altura; i++){
            System.out.print("* ");
            for(int j = 2; j<= altura; j++){
            System.out.print(" ");
        }
        System.out.println("*");
    }

    for(int k = 1; k<=base; k ++)
        System.out.print(" *");

        sc.close();
    }
}
