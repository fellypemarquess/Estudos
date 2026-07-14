package Exercicios;
import java.util.Scanner;

public class ex002 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String x;
        x = sc.next();
        System.out.println("Você digitou o valor "+ x);

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou "+ y);

        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou " + z);
        System.out.printf("Você digitou %.2f", z);
        sc.close();

    }
}
