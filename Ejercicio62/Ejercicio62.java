package java_capitulo_5.Ejercicio62;
import java.util.Scanner;

public class Ejercicio62 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        int num=sc.nextInt();
        int contsuerte=0;
        int contnosuerte=0;

        while(num>0){
            if(num%10==3  || num%10==7 || num%10==8 || num%10==9 ){
                contsuerte++;
            }else{
                contnosuerte++;
            }
            num=num/10;
        }

        if(contsuerte>contnosuerte){
            System.out.println("El número introducido es un número afortunado.");
        }else{
            System.out.println("El número introducido es un número  no afortunado.");
        }
    }
}
