package com.mycompany.practice;
import objects.Car;



public class Practice {

    public static void main(String[] args) {
        Car v1 = new Car();
        v1.setColor("green");
        
        System.out.printf("%s" , v1.getColor());
    }
}

