package src;
public class StaticBlock
{
    static class Mobile
    {
        String brand;
        int price;
        static String name;

        static
        {
            name="Phone";
            System.out.println("in static block");  // name is set to "Phone" when class is first loaded.
        }

        public Mobile()
        {
            brand="";
            price=200;
          //name="Phone";    // Cannot access static variable in constructor like this
                             // Uncommenting this line would cause an error because name is static
            System.out.println("in constructor");
        }
        public void show()
        {
            System.out.println(brand+" : "+price+" : "+name);
        }

    }

        public static void main(String[] args) {
            Mobile obj1 = new Mobile();
            obj1.brand = "Apple";
            obj1.price = 1500;
            Mobile.name = "Smartphone";  // Static variable, accessed via the class  // Static field `name` is updated to "Smartphone", so it applies globally
            obj1.show();

            Mobile obj2 = new Mobile();
            obj2.show(); //output:-  : 200 : Smartphone (default values brand,price and updated value name is printed)

//            Mobile obj2 = new Mobile();  // Triggers the static block again
//            obj2.brand = "Samsung";     // Update obj2's brand
//            obj2.price = 1200;
//            obj2.show();
        }


}
