package com.class20HomeWork;

public class Employee {

    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class FullTime extends Employee {

    String lastName;
    double weight;

    FullTime(String name, int age, String lastName, double weight) {
        super(name, age);
        this.lastName = lastName;
        this.weight = weight;
    }


    void happy() {
        System.out.println();
    }

}

class PartTime extends Employee {

    int salary;

    PartTime(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    void display() {
        System.out.println("Name is " + name + " age is " + age + " salary is " + salary);
    }

    public static void main(String[] args) {

        PartTime pt = new PartTime("Alex", 20, 95000);
        pt.display();

    }


}