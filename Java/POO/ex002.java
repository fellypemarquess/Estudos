package POO;
import java.util.Scanner;
import POO.entities.triangle;

public class ex002 {
    public static void main(String[] args) {
        // Testing the POO in java with class entities

        Scanner sc = new Scanner(System.in);
        char test;

        triangle x,y;
        x = new triangle();
        y = new triangle();

        System.out.println("Digite os valores dos lados do triangulo X");
        System.out.print("Lado a: ");
        x.a = sc.nextDouble();
        System.out.print("Lado b: ");
        x.b = sc.nextDouble();
        System.out.print("Lado c: ");
        x.c = sc.nextDouble();

        System.out.println("Digite os valores dos lados do triangulo Y");
        System.out.print("Lado a: ");
        y.a = sc.nextDouble();
        System.out.print("Lado b: ");
        y.b = sc.nextDouble();
        System.out.print("Lado c: ");
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do triangulo X: %.2f\n", areaX);
        System.out.printf("Area do triangulo Y: %.2f\n", areaY);

        double result = Math.max(areaX, areaY);
        if (result == areaY) {
            test = 'Y';
        } else {
            test = 'X';
        }
        System.out.printf("A maior área foi %.2f que representa %c", result, test);

        sc.close();
    }
}
