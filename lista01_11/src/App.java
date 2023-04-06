import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = entrada.nextInt();

        System.out.print("Digite um número real: ");
        double num3 = entrada.nextDouble();

        double resultado1 = (2 * num1) * (num2 / 2);
        double resultado2 = (3 * num1) + num3;
        double resultado3 = Math.pow(num3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);
        System.out.println("O terceiro elevado ao cubo é: " + resultado3);
    }
}