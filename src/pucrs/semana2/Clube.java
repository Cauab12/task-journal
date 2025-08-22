package pucrs.semana2;

import java.util.Scanner;

public class Clube {
    Scanner scanner = new Scanner(System.in);

    private SocioAtleta[] socios;
    private int contador;


    public Clube(int tamanho) {
        this.socios = new SocioAtleta[tamanho];
        this.contador = 0;
    }

    public void inscreveSocio() {
        if (contador >= socios.length) {
            System.out.println("Não há espaço para novos sócios.");
            return;
        }

        System.out.print("Nome do Sócio Atleta: ");
        String nome = scanner.nextLine();
        System.out.print("Idade do Sócio Atleta: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Altura do Sócio Atleta (em metros): ");
        double altura = Double.parseDouble(scanner.nextLine());

        SocioAtleta socio = new SocioAtleta(nome, idade, altura, 0);

        socios[contador] = socio;
        contador++;
        System.out.println("Sócio Atleta " + nome + " inscrito com sucesso!");
    }


    public void exibirSocios() {
        if (contador == 0) {
            System.out.println("Não há sócios cadastrados.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(socios[i]);
            }
        }
    }

    public void exameDeSaude() {

    }
}
