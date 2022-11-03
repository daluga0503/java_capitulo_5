/*Realiza una programa que calcule las horas transcurridas entre dos horas de
dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
El día de la semana se puede pedir como un número (del 1 al 7) o como una
cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
los datos correctamente y que el segundo día es posterior al primero. */


package java_capitulo_5.Ejercicio30;
import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un primer dia de la semana: ");
        String dias1 = sc.next();
        int primerdia=0;



        switch (dias1) {
            case "Lunes":
                primerdia=1;
                break;
                case "Martes":
                primerdia=2;
                break;
                case "Miércoles":
                primerdia=3;
                break;
                case "Jueves":
                primerdia=4;
                break;
                case "Viernes":
                primerdia=5; 
                break;
                case "Sábado":
                primerdia=6;
                break;
                case "Domingo":
                primerdia=7;
                break;
            default:
                break;
        }

        System.out.println("Introduzca la hora del primer día (0-23): ");
        int hora1=sc.nextInt();


        System.out.println("Introduzca un segundo dia de la semana: ");
        String dias2 = sc.next();
        int segundodia=0;



        switch (dias2) {
            case "Lunes":
                segundodia=1;
                break;
                case "Martes":
                segundodia=2;
                break;
                case "Miércoles":
                segundodia=3;
                break;
                case "Jueves":
                segundodia=4;
                break;
                case "Viernes":
                segundodia=5; 
                break;
                case "Sábado":
                segundodia=6;
                break;
                case "Domingo":
                segundodia=7;
                break;
            default:
                break;
        }

        System.out.println("Introduzca la hora del segundo día (0-23): ");
        int hora2=sc.nextInt();

        if(segundodia<primerdia){
            System.out.println("Error al introducir los datos, el primer dia tiene que ser anterior al segundo.");
        }

        if(segundodia>primerdia ){
        System.out.print("Entre las " + hora1 + ":00h del " + dias1);
        System.out.print(" y las " + hora2 + ":00h del " + dias2);
        System.out.println(" hay " + ((( segundodia * 24) + hora2) - ((primerdia * 24) + hora1)) + " hora/s.");
        }
        sc.close();

    }
}
