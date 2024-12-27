package src;

class Car
{
    public Car()
    {
        System.out.println("In constructor, Object Created");
    }
    public void show()
    {
        System.out.println("Car is starting");
    }
}
public class Vehicle
{
    public static void main(String[] args)
    {
       Car obj = new Car();     //Normal Object Creation
       obj.show();


        new Car().show();      //Anonymous Object

    }
}
