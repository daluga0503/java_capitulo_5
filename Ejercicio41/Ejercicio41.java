package java_capitulo_5.Ejercicio41;
import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num=sc.nextInt();
        int numcopia=num;
        int volteado=0;
        int longitud=0;
        int digitos=0;
        int pares=0;
        int impares=0;

        while(numcopia>0){
            volteado=(volteado * 10) + (numcopia % 10);
            numcopia=numcopia/10;
            longitud++;
        }

        for(int i = 0; i<longitud; i ++){
            digitos=volteado%10;
            volteado=volteado/10;
            if(digitos%2==0){
                pares++;
            }else{
                impares++;
            }
    }
    System.out.println("El" + num + " contiene " + pares + " dígitos pares y " + impares + " dígitos impares");
    sc.close();
    }
}

