import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a medida em metros: ");
        double metros = teclado.nextDouble();
        double centimetros = metros * 100;
        System.out.println(metros + " metros equivalem a " + centimetros + " centímetros.");
        teclado.close();
    }
}