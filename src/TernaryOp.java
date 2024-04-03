package src;

public class TernaryOp
{
    public static void main(String[] args)
    {
        int num1 = 20;
        int num2 = 10;

        int res1 = (num1 > num2) ? (num1 + num2) : (num1 - num2);

        String res2 = (num1%2==0) ? "even" : " odd ";

        System.out.println(res1);
        System.out.println(res2);
    }
}
