package java_capitulo_5.Ejercicio69;
import java.util.Scanner;

public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("En este programa vamos arealuzar una pirámide maya");
        System.out.print("Introduca la altura deseada(mayor que 5): ");
        int altura = sc.nextInt();

        for(int i=1;i<=altura;i++){
            for(int k=1;k<=altura-i;k++){
                System.out.print(" ");
            }
            if(i%2!=0){
                System.out.print("******");
                for(int j=1;j<=(i-1)*2;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.print("    ");
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        
    }
}
