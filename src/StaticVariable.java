package src;

public class StaticVariable {

    static class Mobile {
        String brand;
        int price;
        static String name;

        public void show() {
            System.out.println(brand + " : " + price + " : " + name);
        }
    }

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;

        Mobile.name = "Phone"; // (value of name changes in both objects)

        obj1.show();
        obj2.show();
    }
}
