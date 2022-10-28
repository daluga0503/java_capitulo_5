package java_capitulo_5.Ejercicio28;
import java.util.Scanner;
public class Ejercicio28 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero positivo para realizar su factorial: ");
        int num = sc.nextInt();
        int suma = num;

        if(num == 0){
            System.out.println("E factorial de 0 vale 1.");
        }

        if(num< 0){
            System.out.println("Introduzca un número positivo.");
        }
        
        if(num>0){
            for(int i= 1; i<=num -1;i ++){
                suma = suma*i;
            }
        }sc.close();

        System.out.println(num + "! = " + suma);

    }
}
