import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner (System.in);

        System.out.print("Digite o tamanho do arquivo (em MB): ");
        double tamanhoArquivo = teclado.nextDouble();

        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
        double velocidadeInternet = teclado.nextDouble();

        // Cálculo do tempo em segundos
        double tempoSegundos = (tamanhoArquivo * 8) / velocidadeInternet;

        // Cálculo do tempo em minutos
        int minutos = (int) Math.ceil(tempoSegundos / 60);

        System.out.printf("Tempo aproximado de download: %d minutos", minutos);

        
    }
}

