/*public class Primeiro{

    public static void main(String[] args){
        System.out.println("Ola mundo");
    }
}*/

/*void main(){
    IO.println("Ola mundo");
}*/

/// Definindo algumas variaveis
/// int idade = 15;
/// double altura = 1.75;
/// char sexo = 'F';
/// Pode mudar o tipo de variavel tambem
/// int x;
/// double y;
///  x = 5;
/// y = (double) x;

import java.util.Locale;

public class Primeiro{
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        System.out.print("Ola mundo! ");
        System.out.println("Tudo bem?");
        int teste = 15;
        double x = 10.3568;
        String nome = "Maria";
        System.out.println(teste);
        System.out.printf("Antes tinhamos %.4f%n", x);
        System.out.println("Agora "+ x + " Temos isso");
        System.out.printf("%s tem em conta %.2f\n",nome,x);
    }
}