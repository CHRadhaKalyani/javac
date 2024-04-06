package src;

import java.util.Scanner;

public class IfElseStatement
{
    public static void main (String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter your number:");
        int number = Scan.nextInt();

        if(number %2==0)
            {
            System.out.println("number is EVEN");
            }
        else
            {
                System.out.println("number is ODD");
            }

    }

}
