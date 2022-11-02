package java_capitulo_5.Ejercicio38;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.");
        System.out.print("\nSabiendo que la altura tiene que ser un número impar mayor que 3, introduce la altura deseada:");
        int altura=sc.nextInt();
        altura=1;
        int asteriscos=altura;
        int espacios=0;

        if((altura<3) && (altura%2==0)){
            System.out.println("Error al introducir los datos.");
        }else{
            while(asteriscos < altura / 2 + 1){
                for(int i = 1; i<=espacios; i ++){
                    System.out.print(" ");
                }
                for(int i = 0; i<asteriscos;i ++){
                    System.out.print("*");
                }
                System.out.print("");
                altura++;
                espacios++;
                asteriscos -=2;
            }
            espacios=altura/2;
            altura=1;
            while(asteriscos<=altura/2+1){
                for(int i = 1; i<= espacios; i++){
                    System.out.print(" ");
                }
                for(int j = 0; j<asteriscos; j++){
                    System.out.print("*");
                }
                System.out.print("");
                altura++;
                espacios--;
                asteriscos +=2;
            }
        }
    }
}

