package src;

public class Conversion
{
    public static void main(String[] args)
    {
       // widening type casting
       byte b = 127;
       int a = 320;
       a = b ;
       System.out.println(a);

       // narrow type casting
       double d = 3.14;
       int i = (int) d;
       System.out.println(i);//decimal values will be lost

        // int to byte
        byte num1 = 127;
        int num2 = 320;
        byte num3 = (byte) num2;
        System.out.println(num3);

        // type promotion
        byte x = 10;
        byte y = 30;
        int result = x * y;
        System.out.println(result);

    }
}
