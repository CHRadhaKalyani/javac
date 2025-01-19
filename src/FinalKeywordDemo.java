package src;

//final class Lecturer
//{
//    public void show()
//    {
//        System.out.println("By Radha");
//    }
//}

class Lecturer
{
    public void show()                   // public final void show()
    {
        System.out.println("By Radha");
    }
}
class Lecturer1 extends Lecturer
{
    public void show()
    {
        System.out.println("By Kalyani");
    }
}
public class FinalKeywordDemo
{
    public static void main(String[] args)
    {
//        final int max_num = 100;
//        max_num = 200;
//        System.out.println(max_num);

//        Lecturer obj = new Lecturer();
//        obj.show();

        Lecturer1 obj1 = new Lecturer1();
        obj1.show();
    }
}
