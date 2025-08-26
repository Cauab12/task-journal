package pucrs.semana2;

import java.util.*;

public class Clube {
    private SocioAtleta[] socios;
    private int contador;

    public Clube(int capacidade) {
        socios = new SocioAtleta[capacidade];
        contador = 0;
    }

    public void inscreveSocio() {
        if (contador >= socios.length) {
            System.out.println("Não há mais espaço para novos sócios!");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite a altura: ");
        double altura = sc.nextDouble();

        SocioAtleta novo = new SocioAtleta(nome, idade, altura);
        socios[contador] = novo;
        contador++;

        System.out.println("Sócio inscrito com sucesso!");
    }

    public void exameDeSaude() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < contador; i++) {
            System.out.print("Digite a nova altura de " + socios[i].getNome() + ": ");
            double novaAltura = sc.nextDouble();
            socios[i].atualizarAltura(novaAltura);
        }
    }


}
