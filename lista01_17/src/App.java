
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
         Scanner teclado = new Scanner(System.in);

        // Pedindo o tamanho da área a ser pintada
        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double tamanho = teclado.nextDouble();

        // Calculando a quantidade de tinta necessária
        double litros = Math.ceil(tamanho / 6.0 * 1.1); // acrescentando 10% de folga e arredondando para cima

        // Calculando a quantidade de latas e galões necessários
        int latas = (int) Math.ceil(litros / 18.0);
        int galoes = (int) Math.ceil(litros / 3.6);

        // Calculando os preços
        double precoLatas = latas * 80.0;
        double precoGaloes = galoes * 25.0;

        // Mostrando os resultados
        System.out.printf("Quantidade de tinta necessária: %.2f litros%n", litros);
        System.out.printf("Opção 1 - Comprar apenas latas de 18 litros: %d latas - Preço total: R$ %.2f%n", latas, precoLatas);
        System.out.printf("Opção 2 - Comprar apenas galões de 3,6 litros: %d galões - Preço total: R$ %.2f%n", galoes, precoGaloes);

        // Calculando a quantidade de latas e galões misturados necessários
        int latasMisturadas = (int) (litros / 18.0);
        int galoesMisturados = (int) Math.ceil((litros % 18.0) / 3.6);

        // Calculando os preços das latas e galões misturados
        double precoLatasMisturadas = latasMisturadas * 80.0;
        double precoGaloesMisturados = galoesMisturados * 25.0;

        // Mostrando os resultados das latas e galões misturados
        System.out.printf("Opção 3 - Misturar latas e galões: %d latas e %d galões - Preço total: R$ %.2f%n",
                latasMisturadas, galoesMisturados, precoLatasMisturadas + precoGaloesMisturados);
        
        teclado.close();
    }
}
