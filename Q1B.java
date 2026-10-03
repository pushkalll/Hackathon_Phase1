package Hackathon;

import java.util.Scanner;

public class Q1B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double water;
        int bill;
        String status;

        System.out.print("Enter water consumption in litres: ");
        water = sc.nextDouble();

        if (water <= 500)
        {
            bill = 100;
            status = "Normal";
        }
        else
        {
            bill = 200;
            status = "High";
        }

        System.out.println("Water consumed = " + water + " litres");
        System.out.println("Usage status = " + status);
        System.out.println("Water bill = Rs." + bill);
    }
}