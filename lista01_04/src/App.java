import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
               Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media;

        System.out.print("Digite a nota do 1º bimestre: ");
        nota1 = teclado.nextDouble();

        System.out.print("Digite a nota do 2º bimestre: ");
        nota2 = teclado.nextDouble();

        System.out.print("Digite a nota do 3º bimestre: ");
        nota3 = teclado.nextDouble();

        System.out.print("Digite a nota do 4º bimestre: ");
        nota4 = teclado.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média das notas é %.2f", media);

        teclado.close();

    }
}
