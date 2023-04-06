import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    
    System.out.print("Digite o valor da sua hora de trabalho: ");
    double valorHora = input.nextDouble();
    
    System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
    double horasTrabalhadas = input.nextDouble();
    
    double salarioMensal = valorHora * horasTrabalhadas;
    
    System.out.printf("Seu salário mensal é R$ %.2f", salarioMensal);
    
    input.close();
  }
}

