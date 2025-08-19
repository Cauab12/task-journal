import java.util.*;
public class DistanciaEntrePontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double calculoDistancia = Math.pow(x2 - x1, 2);
        double calculoDistancia2 = Math.pow(y2 - y1, 2);

        double soma = calculoDistancia + calculoDistancia2;

        double distancia = Math.sqrt(soma);

        System.out.printf("%.4f", distancia);

        input.close();
    }
}
