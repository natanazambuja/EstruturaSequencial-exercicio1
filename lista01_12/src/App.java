import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
       
      
            Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a altura da pessoa em metros: ");
        double altura = teclado.nextDouble();

        double peso_ideal = (72.7 * altura) - 58;

        System.out.println("O peso ideal para uma pessoa com altura de " + altura + " metros é " + peso_ideal + " kg.");
    }
}
