package java_capitulo_5.Ejercicio29;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número positivo entero: ");
        int num = sc.nextInt();
        System.out.println("Introduzca un núemro divisor: ");
        int div= sc.nextInt();
        if(num == 0 ){
            System.out.println("No hay números enteros positivos menores que 0.");
        }

        if(num < 0 ){
            System.out.println("Error al introducir el valor. Por favor introduzca un número entero positivo.");
        }

        if(num > 0 ){
            int i;
            System.out.print("Los números enteros positivos menores al número introducido son: ");
            for( i= num-1 ; i>=0 ;i -- ){
                if((i%div)!=0){
                System.out.print(i + " ");
                }
            }
        }
        sc.close();
    }
}
