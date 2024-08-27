public class Stringbuff
{
    public static void main(String[] args)
    {
        StringBuffer str = new StringBuffer("Hello");

        System.out.println(str.length());

        System.out.println(str.append(" world"));

        System.out.println(str.insert(5, " Java"));

        System.out.println(str.replace(5,10," Programming"));

        System.out.println(str.delete(6,17));

        System.out.println(str.reverse());

        System.out.println(str.toString());


    }
}
