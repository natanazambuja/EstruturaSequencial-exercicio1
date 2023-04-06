
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception{
       
        
       
            Scanner input = new Scanner(System.in);
       
            System.out.print("Digite o raio do círculo: ");
       
            double raio = input.nextDouble();
       
            double area = Math.PI * Math.pow(raio, 2);
        
            System.out.println("A área do círculo é " + area + ".");
   
   

    }
}