package java_capitulo_5.Ejercicio36;
import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        int numcopia=num;
        int volteado = 0;

        while(numcopia>0){
            volteado=(volteado * 10) + (numcopia % 10);
            numcopia=numcopia/10;
        }

        if(volteado==num){
            System.out.println("El número introducido es capicua.");
        }else{
            System.out.println("El número introducido no es capicua.");
        }
        sc.close();
    }
    
}
