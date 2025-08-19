import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String vendedor = input.nextLine();

        System.out.println("Digite seu salário fixo: ");
        double salario = input.nextDouble();

        System.out.println("Digite o total de vendas: ");
        double vendas = input.nextDouble();

        double calculoComissao = vendas * 0.15;
        double comissao = salario + calculoComissao;

        System.out.printf("TOTAL = %.2f", comissao, vendedor);

        input.close();
    }
}

