package POO;
import POO.entities.Bank;

import java.util.Objects;
import java.util.Scanner;

public class ex009 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bank client;
        System.out.print("Account number: ");
        int account = sc.nextInt();
        sc.nextLine();
        System.out.print("Account name: ");
        String name = sc.nextLine();

        System.out.print("Want deposite some money? (y/n): ");
        String choice = sc.nextLine();

        if (Objects.equals(choice, "y")) {
            System.out.print("Digit the value: ");
            double cash = sc.nextDouble();
            client = new Bank(account, name, cash);
        } else {
            client = new Bank(account, name);
        }

        System.out.println(client);

        System.out.print("Enter a deposit value: ");
        double deposite = sc.nextDouble();
        client.addCash(deposite);
        System.out.println("\nUpdate data: " + client);


        System.out.print("\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        client.removCash(withdraw);
        System.out.println("\nUpdate data: " + client);
        sc.close();
    }
}
