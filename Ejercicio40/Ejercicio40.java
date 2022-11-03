package java_capitulo_5.Ejercicio40;
import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Intrduzca la altura del rombo: ");
        int altura=sc.nextInt();
        int filas=altura;
        int espacios;
        int asteriscos;
        int espacioslaterales;

            for(int i = 1; i<=altura; i++){
                for(espacios=1 ; espacios<= altura/2; espacios--){
                    System.out.print(" ");
                }
                for(asteriscos=1; i<=altura;asteriscos++){
                    System.out.print("*");
                }

            }


    }
}

