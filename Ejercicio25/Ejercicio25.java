import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int num = sc.nextInt();
        int numerocopia=num;
        int volteado = 0;
        while(numerocopia>0){
            volteado = (volteado * 10) + (numerocopia % 10);
            numerocopia/=10;
        }
        System.out.println("El número volteado es: " + volteado);
        sc.close();
    }
}