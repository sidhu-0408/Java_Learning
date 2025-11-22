package com.day5;



public class Day5Main {
    public static void main(String[] args) {
        System.out.println("--- Employee Static Example ---");
        Employee e1 = new Employee("Sidhu");
        Employee e2 = new Employee("Kumar");
        e1.show();
        e2.show();
        Employee.showTotalEmployees();

        System.out.println("\n--- this + super Example ---");
        Student s = new Student();
        s.printTypes();

        System.out.println("\n--- Inner Class Example ---");
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.show();

        System.out.println("\n--- Anonymous Inner Class Example ---");
        AnonymousExample ae = new AnonymousExample();
        ae.runAnonymous();
    }
}
