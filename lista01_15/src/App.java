import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite quanto você ganha por hora: ");
        double valorHora = teclado.nextDouble();

        System.out.print("Digite quantas horas você trabalhou no mês: ");
        double horasTrabalhadas = teclado.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double ir = salarioBruto * 0.11;
        double inss = salarioBruto * 0.08;
        double sindicato = salarioBruto * 0.05;
        double descontos = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - descontos;

        System.out.println("+ Salário Bruto : R$ " + salarioBruto);
        System.out.println("- IR (11%) : R$ " + ir);
        System.out.println("- INSS (8%) : R$ " + inss);
        System.out.println("- Sindicato (5%) : R$ " + sindicato);
        System.out.println("= Salário Líquido : R$ " + salarioLiquido);


    }







}
