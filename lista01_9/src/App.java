import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
        double celsius = 5 * (fahrenheit - 32) / 9;
        
        System.out.printf("A temperatura em graus Celsius é: %.2f", celsius);
        
        input.close();
      }
    }



