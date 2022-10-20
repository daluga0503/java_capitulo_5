import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        System.out.println("Introduza un número: ");
        Scanner sc = new Scanner(System.in);
        long numleido = sc.nextLong();
        long num = numleido;
        int cont = 0;
        do{
            cont ++;
            num/=10;
        } while (num !=0);
        System.out.printf("El número %d tiene %d dígitos", numleido, cont);
        sc.close();
    }
}