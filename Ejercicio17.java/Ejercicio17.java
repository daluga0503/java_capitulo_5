import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("En este programa vamos a sumar los 100 números siguientes a un número entero y positivo introducido por teclado.");
    int n;
    int i = 1;
    int suma = 0;
    n = sc.nextInt();
        if(n<0){
            System.out.println("No se puede realizar el programa con números negativos.");
    } else {
        System.out.println("Número introducido correcto.");
    }
                while(  i <=100 ){
                suma = suma + i + n;
                i = i + 1;
                }

                System.out.println("La suma de los siguientes 100 números es de: " + suma + ".");
    sc.close();
            }
    }
