import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[3];
        int[] original = new int[3];

        for (int i = 0; i < 3; i++) {
            numeros[i] = input.nextInt();
            original[i] = numeros[i];
        }

        //Ordena os elementos em ordem crescente por padrão
        Arrays.sort(numeros);

        for (int num : numeros) {
            System.out.println(num);
        }

        System.out.println();

        for (int num : original) {
            System.out.println(num);
        }

        input.close();
    }
}