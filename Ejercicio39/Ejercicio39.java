package java_capitulo_5.Ejercicio39;
import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        int num=sc.nextInt();
        int suma=1;
        int numcopia=num;

        for(int i = 1; i <=num; i++){
            suma=suma*i;
            numcopia=1;
            numcopia=numcopia+1;
            System.out.println(i +"! = " + suma);
        }
        sc.close();
    }
}
