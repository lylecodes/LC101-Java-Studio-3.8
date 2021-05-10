package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius;
        do {
            System.out.println("Enter a (positive number) radius: ");
            while(!input.hasNextDouble()) {
                System.out.println("That's not a valid number.");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        double result = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is: " + result);
    }
}
