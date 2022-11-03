package java_capitulo_5.Ejercicio42;
import java.util.Scanner; 


public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num=sc.nextInt();
        boolean primo=true;

        for(int i=num ; i<=num+4; i++ ){
            if(i%2==0){
                primo=true;
                System.out.println(i + " es primo. ");
            } else {
                primo=false;
                System.out.println(i + " no es primo. ");
            }
        }
    }
}
