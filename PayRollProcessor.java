abstract class Employee{
    public abstract void calculatePay();
}
class SalariedEmployee extends Employee{
    String name;
    double salary;
    public void calculatePay(){
        int sal = (int) (this.salary*12);
        System.out.println(sal);
}}
class HourlyEmployee extends Employee{
    String name;
    double hourlyRate;
    double hoursWorked;
    public void calculatePay(){
        int wage = (int) (this.hourlyRate*this.hoursWorked);
        System.out.println(wage);
    }
   
}
public class PayRollProcessor {
    public static void main(String[] args) {
        SalariedEmployee salE = new SalariedEmployee();
        HourlyEmployee hourE = new HourlyEmployee();
        salE.name="Daksanya";
        salE.salary=100000;
        hourE.name="Daksha";
        hourE.hourlyRate=2000;
        hourE.hoursWorked=100;
        salE.calculatePay();
        hourE.calculatePay();
    }
    
}
