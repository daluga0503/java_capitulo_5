import java.util.Scanner;
public class Ejercicio19 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Vamos a realizar una pirámide");
	System.out.println("¿De cuánta altura deseas la pirámide?");
	int altura = sc.nextInt();
		for(int i = 1; i<=altura; i++){
			for(int espacio = altura-i; espacio >= 1; espacio--){
				System.out.print(" ");
			}
			for(int asteriscos = (i*2)-1; asteriscos>=1; asteriscos--){
				System.out.print( "*" );
			}
			System.out.println("");
		}
	sc.close();
	}
}
