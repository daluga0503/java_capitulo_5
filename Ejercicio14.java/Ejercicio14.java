import java.util.Scanner;
import java.lang.Math;

public class Ejercicio14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una base: ");
        int base;
        base = sc.nextInt();
        System.out.println("Introduzca un exponente al que quieras elevar la base introducida: ");
        int exponente;
        exponente = sc.nextInt();
        System.out.printf("El resultado de la potencia es de: " + Math.pow(base,exponente));
        sc.close();
    }
}
