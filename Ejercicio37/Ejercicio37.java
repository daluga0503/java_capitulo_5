package java_capitulo_5.Ejercicio37;
import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num = sc.nextInt();
        int numcopia=num;
        int longitud=0;
        int volteado = 0;
        int digitos = 0;

        System.out.print("El " + num + " en decimal es = ");

        while(numcopia>0){
            volteado=(volteado * 10) + (numcopia % 10);
            numcopia=numcopia/10;
            longitud++;
        }

        for(int i = 0; i<longitud; i ++){
            digitos=volteado%10;
            volteado=volteado/10;

            for(int j=0; j<digitos;j++){
                System.out.print("|");
            }
            if(i<longitud);
        System.out.print("-");

        }
        sc.close();
    }
}
