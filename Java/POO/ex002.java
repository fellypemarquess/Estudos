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

        double p = (x.a + x.b + x.c) / 2;
        double p1 = (y.a + y.b + y.c) / 2;

        double area = Math.sqrt((p * (p - x.a) * (p - x.b) * (p - x.c)));
        double area1 = Math.sqrt(p1 * (p1 - y.a) * (p1 - y.b) * (p1 - y.c));


        System.out.printf("Area do triangulo X: %.2f\n", area);
        System.out.printf("Area do triangulo Y: %.2f\n", area1);

        double result = Math.max(area, area1);
        if (result == area1) {
            test = 'Y';
        } else {
            test = 'X';
        }
        System.out.printf("A maior área foi %.2f que representa %c", result, test);


        sc.close();
    }
}
