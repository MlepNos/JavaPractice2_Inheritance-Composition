// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Employee tom = new Employee("kaan","21/10/1999","14/03/2022");
        System.out.println(tom);
        System.out.println(tom.getAge());
        System.out.println(tom.collectPay());

        SalariedEmployee duke = new SalariedEmployee("remzi","29/10/1992","24/07/2021", 20000);
        System.out.println(duke);
        System.out.println(duke.getAge());
        System.out.println(duke.collectPay());
        duke.retire();
        System.out.println(duke.collectPay());


    }


    /* 1_Inheritance Challange

Your challenge is to create the Worker class, the Employee class, and either the SalariedEmployee, or the HourlyEmployee class.
For each class, create the attributes and methods shown on this diagram.
Create a main method that will create either a SalariedEmployee or HourlyEmployee,
and call the methods, getAge, collectPay, and the method shown for the specific type of class you decide to implement.
So if you implement SalariedEmployee, then execute retire().
If you implement HourlyEmployee, then execute getDoublePay().
For the employee class, we have specific Employee attributes, employeeId, and hireDate.
For simplicity's sake, we haven't included any methods specific to an Employee.
It's time to build a more specific type of Employee, one that's Salaried.
A salaried employee, is paid based on some percentage of his or her salary.
It this person is retired, then the salary may be 100 percent, but it is generally reduced somewhat.


 Employee tom = new Employee("kaan","21/10/1999","14/03/2022");
        System.out.println(tom);
        System.out.println(tom.getAge());
        System.out.println(tom.collectPay());

        SalariedEmployee duke = new SalariedEmployee("remzi","29/10/1992","24/07/2021", 20000);
        System.out.println(duke);
        System.out.println(duke.getAge());
        System.out.println(duke.collectPay());
        duke.retire();
        System.out.println(duke.collectPay());


*/
}