// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        SmartKitchen smart = new SmartKitchen();
        smart.setKitchenState(true,false,true);
        smart.doKitchenWork();


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

    /* 2_Cylinder
1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
In case the radius parameter is less than 0 it needs to set the radius field value to 0.
Write the following methods (instance methods):
-Method named getRadius without any parameters, it needs to return the value of radius field.
-Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.

2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
The class needs to have one constructor with two parameters radius and height both of type double.
It needs to call parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
-Method named getHeight without any parameters, it needs to return the value of height field.
-Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.

TEST EXAMPLE
→ TEST CODE:
Circle circle = new Circle(3.75);
System.out.println("circle.radius= " + circle.getRadius());
System.out.println("circle.area= " + circle.getArea());
Cylinder cylinder = new Cylinder(5.55, 7.25);
System.out.println("cylinder.radius= " + cylinder.getRadius());
System.out.println("cylinder.height= " + cylinder.getHeight());
System.out.println("cylinder.area= " + cylinder.getArea());
System.out.println("cylinder.volume= " + cylinder.getVolume());

→ OUTPUT:
circle.radius= 3.75
circle.area= 44.178646691106465
cylinder.radius= 5.55
cylinder.height= 7.25
cylinder.area= 96.76890771219959
cylinder.volume= 701.574580913447



3_Pool Area
The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.

1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.
The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
In case the width parameter is less than 0 it needs to set the width field value to 0.
In case the length parameter is less than 0 it needs to set the length field value to 0.
Write the following methods (instance methods):
-Method named getWidth without any parameters, it needs to return the value of width field.
-Method named getLength without any parameters, it needs to return the value of length field.
-Method named getArea without any parameters, it needs to return the calculated area (width * length).

2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable) with name height of type double.
The class needs to have one constructor with three parameters width, length, and height all of type double. It needs to call parent constructor and initialize a height field.
In case the height parameter is less than 0 it needs to set the height field value to 0.
Write the following methods (instance methods):
-Method named getHeight without any parameters, it needs to return the value of height field.
-Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.

TEST EXAMPLE
→ TEST CODE:
Rectangle rectangle = new Rectangle(5, 10);
System.out.println("rectangle.width= " + rectangle.getWidth());
System.out.println("rectangle.length= " + rectangle.getLength());
System.out.println("rectangle.area= " + rectangle.getArea());
Cuboid cuboid = new Cuboid(5,10,5);
System.out.println("cuboid.width= " + cuboid.getWidth());
System.out.println("cuboid.length= " + cuboid.getLength());
System.out.println("cuboid.area= " + cuboid.getArea());
System.out.println("cuboid.height= " + cuboid.getHeight());
System.out.println("cuboid.volume= " + cuboid.getVolume());

→ OUTPUT:
rectangle.width= 5.0
rectangle.length= 10.0
rectangle.area= 50.0
cuboid.width= 5.0
cuboid.length= 10.0
cuboid.area= 50.0
cuboid.height= 5.0
cuboid.volume= 250.0

4_ Composition Challange
In this challenge, you need to create an application for controlling a smart kitchen.Your smart kitchen will have several appliances.
Your appliances will be Internet Of Things (IoT) devices, which can be programmed
It's your job to write the code, to enable your Smart Kitchen application, to execute certain jobs.

Methods on your SmartKitchen class, will determine what work needs to be done:
-addWater() will set the Coffee Maker's hasWorkToDo field to true.
-pourMilk() will set Refrigerator's hasWorkToDo to true.
-loadDishwasher() will set the hasWorkToDo flag to true, on that appliance.
-Alternately, you could have a single method, called setKitchenState, that takes three boolean values, which could combine the three methods above

To execute the work needed to be done by the appliances, you'll implement this in two ways:
First, your application will access each appliance (by using a getter), and execute a method.
The appliance methods are orderFood() on Refrigerator, doDishes() on DishWasher, and brewCoffee() on CoffeeMaker.
These methods should check the hasWorkToDo flag, and if true, print a message out, about what work is being done.
Second, your application won't access the appliances directly.
It should call doKitchenWork(), which delegates the work, to any of its appliances.

Test Code:
   SmartKitchen smart = new SmartKitchen();
   smart.setKitchenState(true,false,true);
   smart.doKitchenWork();

→ OUTPUT:
   Brewing Coffee
   Doing Dishes

*/
}