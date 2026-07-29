package POO.entities;

public class Employee {
    public String name;
    public double sal;
    public double tax;

    public double liquiSal(){
        return this.sal - this.tax;
    }

    public void aumentoSal(double porcent){
        sal = (sal * (porcent/100)) + sal;
    }

    public String toString(){
        return "Empregado: " + name + String.format(", $ %.2f",liquiSal());
    }
}
