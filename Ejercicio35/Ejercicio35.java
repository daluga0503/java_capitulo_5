package java_capitulo_5.Ejercicio35;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Realiza un programa que pinte una X hecha de asteriscos.");
        System.out.print("Sabiendo que la altura debe ser un número impar mayor que 3, introduzca la altura de la X: ");
        int altura=sc.nextInt();
        int espacios = 0;

        for(int i= 0; i <= altura; i++){
        System.out.println("*");
            for(espacios = 0; espacios < altura; espacios++){
            System.out.println(" ");
        }
        System.out.println("*");
        }
    }
}
