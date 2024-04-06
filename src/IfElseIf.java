package src;

import java.util.Scanner;

public class IfElseIf
{
    public static void main (String[] args)
    {
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter your marks:");
        int marks = Scan.nextInt();

        if(marks<35)
        {
            System.out.println("FAIL");
        }
        else if (marks>=35 && marks<45)
        {
            System.out.println("D Grade");
        }
        else if(marks>=45 && marks<55)
        {
            System.out.println("C Grade");
        }
        else if(marks>=55 && marks<65)
        {
            System.out.println("B Grade");
        }
        else if(marks>=65 && marks<75)
        {
            System.out.println("A Grade");
        }
        else
        {
            System.out.println("INVALID");
        }




    }
}
