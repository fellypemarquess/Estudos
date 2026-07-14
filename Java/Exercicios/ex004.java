package Exercicios;

public class ex004 {
    public static void main(String[] args){
       double x = 3.5, y = 4.0, z = -5.0, A, B, C;
       A = Math.sqrt(x);

       System.out.printf("Raiz Quadrada de %.2f = %.2f \n",x,A);

       B = Math.pow(x,y);
       System.out.printf("O valor de %.2f elevado a %.2f = %.2f \n",x,y,B);

       C = Math.abs(z);
       System.out.printf("O valor absoluto de %.2f é %.2f\n",z,C);

       System.out.printf("Calulando a Bhaskara desses caras x e y\n");
       double delta = Math.pow(y,2.0) - 4*x*z;
       double x1 = (-y + Math.sqrt(delta))/ 2.0*x;
       double x2 = (-y - Math.sqrt(delta))/ 2.0*x;

       System.out.printf("O resultados foram os seguintes: x1 = %.2f e x2 = %.2f",x1,x2);
    }
}
