package com.simple;

interface MyInterface1 {
    int num = 100;

    default void display() {
        System.out.println("display method of MyInterface1");
    }

    public static void testMethod(){
        System.out.println("test method called");
    }
}

interface MyInterface2 {
    int num = 1000;

    default void display() {
        System.out.println("display method of MyInterface2");
    }
}

public class InterfaceExample implements MyInterface1, MyInterface2 {
    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.display();
    }

    public void display() {
        MyInterface1.super.display();
        MyInterface1.testMethod();
        //or,
        MyInterface2.super.display();
    }
}