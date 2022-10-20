import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        float suma = 0;
        float valor = 0;
        int cont = 0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Introduzca un número: ");
            valor = sc.nextFloat();
            if(valor >= 0){
            cont ++;
            suma+=valor;
            }
        } while (valor >=0);
        System.out.println("la media es de: " + (suma/cont));
        System.out.printf("la media es %.1f \n", suma/cont);
        sc.close();

    }
}
