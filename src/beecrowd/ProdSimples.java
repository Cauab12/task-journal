import java.util.*;

public class ProdSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros: ");
        int v1 = input.nextInt();
        int v2 = input.nextInt();

        int PROD = v1 * v2;

        System.out.println("PROD = " + PROD);

        input.close();
    }
}
