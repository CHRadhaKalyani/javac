package src;
class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return model + " : " + price;
    }
    public boolean equals(Laptop that)
    {
//        if(this.model.equals(that.model) && this.price==that.price)
//			return true;
//		else
//			return false;

        return this.model.equals(that.model) && this.price == that.price;
    }
}
public class ObjectClassDemo
{
    public static void main(String[] args)
    {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 5000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 5000;

        boolean result = obj1.equals(obj2);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(result);
    }

}
