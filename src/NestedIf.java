package src;

import java.util.Scanner;

public class NestedIf
{
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = Scan.nextInt();

        System.out.println("Enter weight:");
        int weight = Scan.nextInt();

        if (age >= 18)
        {
            if (weight > 50)
            {
                System.out.println("You are eligible to donate blood");
            }
        }
        else
        {
            System.out.println("You are not eligible to donate blood");
        }
    }
}



