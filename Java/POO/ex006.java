package POO;
import POO.entities.Aluno;
import java.util.Scanner;

public class ex006 {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.name = sc.nextLine();
        System.out.print("Digite a primeira nota (max 30): ");
        aluno.n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota (max 35): ");
        aluno.n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota (max 35): ");
        aluno.n3 = sc.nextDouble();

        System.out.printf("Nota final: %.2f\n", aluno.notaMax());

        if (aluno.notaMax()>60){
            System.out.println("Aprovado!");
        } else {
          System.out.println("Reprovado!");
          System.out.printf("Faltaram "+ aluno.restant() + " pontos");
        }

        sc.close();
    }
}
