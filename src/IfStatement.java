package src;

import java.util.Scanner;

public class IfStatement
{
    public static void main(String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("whats the range");
        int range = Scan.nextInt();

        if (range > 90)
        {
            System.out.println("I AM HAPPY");
        }
    }
}
