package Exercicios;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = 0;
        System.out.print("Olá digite números e veja a soma deles (para encerrar digite 0): ");
        int x = sc.nextInt();
        y += x;

        if (x == 0){
            System.out.println("Programa finalizado!");
        }
        else{
            while (x!=0){
                System.out.print("Digite o próximo número (Digite 0 para interroper): ");
                x = sc.nextInt();
                y += x;
            }
        }
        System.out.printf("A soma dos números digitados foi %d",y);

        sc.close();
    }
}
