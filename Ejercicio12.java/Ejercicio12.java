

    import java.util.Scanner;
	public class Ejercicio12 {
        public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
            System.out.println(" Vamos a realizar el proceso Fibonacci");
            System.out.print("¿Cuántos números de la serie Fibonacci quieres?");
            int a=0;
            int b=1;
            int c=0;
            int n = sc.nextInt();
                for(int i=1; i<=n; i++){
                    System.out.print(c+ " ");
                    a=b;
                    b=c;
                    c=a+b;
                }
        sc.close();
        }
    
        }
    