import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("En este programa vamos a introducir un número por teclado es o no primo. ");
        System.out.println("Introduzca un número: ");
        int n;
        int i=0;
        boolean primo = true;
        n = sc.nextInt();
        for( i = 2; i <n; i ++);
            if ((n%i)==0){
                primo=false;
            System.out.println("Número primo.");
            }else{
                System.out.println("Número no primo.");
            }

            sc.close();
    }
}
