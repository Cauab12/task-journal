import java.util.Scanner;

public class TipoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int codigo;

        while (true) {
            System.out.println("Digite o código do combustível:");
            System.out.println("1. Álcool | 2. Gasolina | 3. Diesel | 4. Fim");
            codigo = sc.nextInt();

            if (codigo == 4) {
                break;
            }

            switch (codigo) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Código inválido! Digite novamente.");
                    break;
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}

