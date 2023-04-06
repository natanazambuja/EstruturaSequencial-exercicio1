import java.util.Scanner;

public class App {
    
  
   

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        double altura = teclado.nextDouble();

        System.out.print("Digite seu sexo (M para masculino ou F para feminino): ");
        String sexo = teclado.next();

        double pesoIdeal = 0.0;

        if (sexo.equals("M")) 
            pesoIdeal = 72.7 * altura - 58;
         
            else if (sexo.equals("F")) {
            pesoIdeal = 62.1 * altura - 44.7;
    
            System.out.println("Seu peso ideal é " + pesoIdeal + " kg.");
       
            }
            }
    }

