import java.util.Scanner;
public class Ejercicio23{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int total = 0;
        int contador = 0;
        System.out.println("Ingrese un número");
        int n = sc.nextInt();

       while (total+n<=10000){
        total+=n;
        contador ++ ; 
        System.out.println("Ingrese un número");
        n = sc.nextInt();
       }
       System.out.println(" Se han introducido " + contador +" números. La suma total de los número introducidos es de  " + total + " y la media es de " + total/contador);
        sc.close();
    }
}
