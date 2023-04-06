import java.util.Scanner;
public class App{
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = input.nextInt();
        int soma = numero1 + numero2;
        System.out.println("A soma dos dois números é " + soma + ".");
        input.close();
    }
}