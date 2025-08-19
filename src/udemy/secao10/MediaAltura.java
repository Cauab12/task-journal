package udemy.secao10;

import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }

        double media = soma / n;
        System.out.printf("media = %.2f%n", media);
    }
}