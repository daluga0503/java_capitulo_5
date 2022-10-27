import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        System.out.println("Introduce una contraseña de 4 dígitos: ");
        Scanner sc = new Scanner(System.in);
        int intentos = 4;
        int contraseña = 1234;
        int numeroIntroducido;
        numeroIntroducido= sc.nextInt();
        boolean correcto = false;
        
        if(numeroIntroducido==contraseña){
            correcto=true;
        }else{
            System.out.println("Clave incorrecta. ");
        }
        intentos --;

        while((intentos > 0) && (!correcto)){
            System.out.println("Introduce una contraseña de 4 dígitos: ");
            numeroIntroducido= sc.nextInt();
            if(numeroIntroducido==contraseña){
                correcto=true;
            }
            intentos--;
        }
        if(correcto)
        {
            System.out.println("La contraseña es correcta. ");
        }
        else{
            System.out.println("La contraseña es incorrecta.");
        }
        sc.close();
    }
}
