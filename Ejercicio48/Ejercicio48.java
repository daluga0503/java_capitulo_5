package java_capitulo_5.Ejercicio48;
import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero: ");
        int num=sc.nextInt();
        int aux;
    boolean find;

    System.out.print("Dígitos que aparecen en el número: ");
    
    for (int i = 0; i < 10; i++) {
        find = false;
        aux = num;
        while (aux > 0 && !find) {
        if (aux % 10 == i) {
            find = true;
        }
        aux /= 10;
        }
        if (find) {
        System.out.print(i + " ");
        }
    }

    System.out.print("\nDígitos que no aparecen: ");
    
    for (int i = 0; i < 10; i++) {
        find = false;
        aux = num;
        while (aux > 0 && !find) {
        if (aux % 10 == i) {
            find = true;
        }
        aux /= 10;
        }
        if (!find) {
        System.out.print(i + " ");
        }
    }

    }
}
