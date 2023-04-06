import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho em metros quadrados da área a ser pintada: ");
        double area = teclado.nextDouble();

        // Cálculo da quantidade de litros de tinta necessários
        double litrosTinta = area / 3;

        // Cálculo da quantidade de latas de tinta necessárias
        int latasTinta = (int) Math.ceil(litrosTinta / 18);

        // Cálculo do preço total das latas de tinta
        double precoTotal = latasTinta * 80;

        // Exibição dos resultados
        System.out.println("Quantidade de latas de tinta a serem compradas: " + latasTinta);
        System.out.println("Preço total das latas de tinta: R$ " + precoTotal);
    }
}
    

