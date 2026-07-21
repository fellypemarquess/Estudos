package POO;
import java.util.Scanner;
// Testando um programa sem o POO

public class ex001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char test;

        System.out.println("Digite os valores dos lados do triangulo X");
        System.out.print("Lado a: ");
        double a = sc.nextDouble();
        System.out.print("Lado b: ");
        double b = sc.nextDouble();
        System.out.print("Lado c: ");
        double c = sc.nextDouble();

        System.out.println("Digite os valores dos lados do triangulo Y");
        System.out.print("Lado a: ");
        double a1 = sc.nextDouble();
        System.out.print("Lado b: ");
        double b1 = sc.nextDouble();
        System.out.print("Lado c: ");
        double c1 = sc.nextDouble();

        double p = (a+b+c)/2;
        double p1 = (a1+b1+c1)/2;

        double area = Math.sqrt((p*(p-a)*(p-b)*(p-c)));
        double area1 = Math.sqrt(p1*(p1-a1)*(p1-b1)*(p1-c1));


        System.out.printf("Area do triangulo X: %.2f\n",area);
        System.out.printf("Area do triangulo Y: %.2f\n",area1);

        double result = Math.max(area,area1);
        if (result == area1){
            test = 'Y';
        }
        else {
            test = 'X';
        }
        System.out.printf("A maior área foi %.2f que representa %c", result,test);


        sc.close();
    }
}
