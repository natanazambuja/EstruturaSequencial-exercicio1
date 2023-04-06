import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
      
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o peso dos peixes em kg: ");
        double peso = teclado.nextDouble();

        double excesso = peso - 50.0;
        double multa = 0.0;

        if (excesso > 0) {
            multa = excesso * 4.0;
            System.out.println("João deverá pagar R$ " + multa + " de multa.");
        }
        else {
            System.out.println("João não precisará pagar nenhuma multa.");
        }
    }
}