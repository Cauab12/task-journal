package udemy.secao8;

import java.util.Scanner;

public class AppRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rec = new Rectangle(0, 0);

        System.out.println("Enter rectangle width and height: ");
        rec.setWidth(sc.nextDouble());
        rec.setHeight(sc.nextDouble());

        System.out.println("AREA = " + rec.area());
        System.out.println("PERIMETER = " + rec.perimeter());
        System.out.println("DIAGONAL = " + rec.diagonal());
    }
}
