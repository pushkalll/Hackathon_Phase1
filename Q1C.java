package Hackathon;

import java.util.Scanner;

public class Q1C
{
    static int calculateTotal(int morningUsage,int eveningUsage)
    {
        return morningUsage+eveningUsage;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int morningUsage,eveningUsage;

        System.out.print("Enter morning water consumption in litres: ");
        morningUsage=sc.nextInt();

        System.out.print("Enter evening water consumption in litres: ");
        eveningUsage=sc.nextInt();

        System.out.println("Total water consumption = "+calculateTotal(morningUsage,eveningUsage)+" litres");
        sc.close();
    }
}