package beecrowd;

import java.util.Scanner;

public class ValidacaoNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p1 = sc.nextDouble();
        double p2 = sc.nextDouble();

        double media = (p1 + p2) / 2;

        if (p1 > 10 || p1 < 0 || p2 > 10 || p2 < 0) {
            System.out.println("nota invalida");
        } else if (media >= 7) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }

        System.out.println("media = " + media);
    }
}
