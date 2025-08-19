package pucrs.semana1;

import java.util.Scanner;

public class appCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(2, 3, 4);

        System.out.println("=== Testando construtores ===");
        System.out.println("C1: " + c1);
        System.out.println("C2: " + c2);

        System.out.println("\n=== Testando métodos ===");
        c1.move(5, 6);
        System.out.println("C1 depois de mover: " + c1);

        c2.zoom(2);
        System.out.println("C2 depois de zoom: " + c2);

        System.out.println("Área de C1: " + c1.area());
        System.out.println("Área de C2: " + c2.area());

        System.out.println("\n=== Array de círculos ===");
        Circulo[] circulos = new Circulo[3];
        circulos[0] = c1;
        circulos[1] = c2;
        circulos[2] = new Circulo(10, 10, 5);

        for (int i = 0; i < circulos.length; i++) {
            System.out.println("circulos[" + i + "] = " + circulos[i]
                    + " | área = " + circulos[i].area());
        }
    }
}
