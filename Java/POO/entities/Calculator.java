package POO.entities;

public class Calculator {

    public static final double PI = 3.14159;

    public static double area(double raio){
        return raio * PI * 2.0;
    }

    public static double volume(double raio){
        return (4.0 * PI * Math.pow(raio,3))/3;
    }

}
