package udemy.secao10;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroPensionato[] quartos = new RegistroPensionato[10];

        System.out.println("Qtd de estudantes que vao alugar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Quarto #" + i + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            quartos[quarto] = new RegistroPensionato(nome, email);
        }

        System.out.println();
        System.out.println("\nQuartos alugados:");

        for (int i = 0; i < 10; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i]);
            }
        }
    }
}

