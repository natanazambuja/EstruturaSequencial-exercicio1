
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        
            Scanner input = new Scanner(System.in);
            System.out.print("Digite o lado do quadrado: ");
            double lado = input.nextDouble();
            double area = lado * lado;
            double dobroArea = 2 * area;
            System.out.println("A área do quadrado é " + area + " e o dobro da área é " + dobroArea + ".");
           
        }
    }