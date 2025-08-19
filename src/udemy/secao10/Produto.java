package udemy.secao10;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Prod[] vetor = new Prod[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vetor[i] = new Prod(nome, preco);
        }

        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPreco(); // .getPreco() p pegar somente o preco
        }

        double media = soma / vetor.length;

        System.out.printf("MEDIA DE PRECO: %.2f%n", media);
    }
}
