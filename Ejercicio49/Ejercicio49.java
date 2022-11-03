package java_capitulo_5.Ejercicio49;
import java.util.Scanner;

public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número primo. Este último número no se tendrá en cuenta en los cálculos.");
        int num;
        int suma=0;
        int cont=0;
        boolean primo;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        System.out.println("Introduzca números enteros positivos, para terminar introduzca un número primo. ");

    do {
        num=sc.nextInt();
        primo=true;
            for(int i = 2; i<num; i++){
                if((num%i)==0){
                primo=false;
            }
        }

        if(!primo){
            suma=suma+num;
            cont++;

            maximo = num > maximo ? num : maximo;
            minimo = num < minimo ? num : minimo;

            }
    } while (!primo);

    System.out.println("Se han introducido " + cont + " números no primos.");
    System.out.println("Máximo: " + maximo);
    System.out.println("Mínimo: " +minimo );
    System.out.println("La media de los números introducidos es de: " + (float)suma/cont);

}
} 
        
    

