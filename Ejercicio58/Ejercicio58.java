package java_capitulo_5.Ejercicio58;
import java.util.Scanner;

public class Ejercicio58 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        int num = sc.nextInt();
        int cont=0;
        int suma=0;
        

        while(num>0){
            suma=suma+num%10;
            num/=10;
            cont++;

    }

            System.out.println("La media de sus dígitos es de: " + suma/cont);
}
}
