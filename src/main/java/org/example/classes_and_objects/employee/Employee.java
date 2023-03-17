package org.example.classes_and_objects.employee;

public class Employee {
    String id;
    String name;
    String department;
    int age;
    String gender;

    public Employee(String id, String name, String department, int age, String gender){
        this.id= id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;

    }

    void printEmployee(){
        System.out.println("The employee with id number " + id + " is " + name +
                " and is working in the department " + department + ", he/she is " + age +
                " years old" + " and is " + gender + ".");
    }

    public static void main(String[] args){
        Employee e1 = new Employee("256256", "Anna", "Management", 23, "female");
        Employee e2 = new Employee("256257", "John", "Accountancy", 26, "male");
        Employee e3 = new Employee("256258", "Greg", "Management", 23, "male");
        e1.printEmployee();
        e2.printEmployee();
        e3.printEmployee();
    }

}