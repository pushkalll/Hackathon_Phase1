package Hackathon;

import java.util.Scanner;

public class Q1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int members;
        double water;
        int house;
        char status;

        System.out.print("Enter family members: ");
        members = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        water = sc.nextDouble();

        System.out.print("Enter house number: ");
        house = sc.nextInt();

        System.out.print("Enter water status (L-Low, M-Medium, H-High): ");
        status = sc.next().charAt(0);

        System.out.println("Family members = " + members);
        System.out.println("Water consumed = " + water + " litres");
        System.out.println("House number = " + house);
        System.out.println("Water status = " + status);
    }
}