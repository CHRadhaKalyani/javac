package src;

public class Logical
{
    public static void main(String[] args)
    {
        int x = 5;
        System.out.println (x < 5 &&  x < 10);
        System.out.println (x < 5 || x < 6);
        System.out.println (!(x < 5 && x < 10));
    }
}
