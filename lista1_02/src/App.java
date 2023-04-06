import java.util.Scanner;


public class App {
    
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            System.out.println("O número informado foi " + numero + ".");
            teclado.close();
        }
    }






