
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
    
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = input.nextDouble();
        
        double fahrenheit = (celsius * 1.8) + 32;
        
        System.out.printf("A temperatura em graus Fahrenheit é: %.2f", fahrenheit);
        
        input.close();
      }
    }