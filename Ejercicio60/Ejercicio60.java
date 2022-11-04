package java_capitulo_5.Ejercicio60;
import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Vamos a hacer dos calcetines de Papa Noel.");
        System.out.print("Introduzca la altura(mínimo 4): ");
        int altura = sc.nextInt();

        if(altura<4){
            System.out.println("Error al introducir la altura.");
        }

        if(altura>=4){
            for(int i = 1 ; i<=altura-2; i++){
                System.out.println("***      ***");
            }
            for (int i =1; i<=2;i++){
                System.out.println("******   ******");
            }
        }

    }
}
