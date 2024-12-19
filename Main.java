class Human
{
    private int age;
    private String name;

    public Human()
    {
        // Default constructor
    }

    // Parameterized constructor
    public Human(int age, String name)
    {
        this.age = age;   // Assign age to the object
        this.name = name; // Assign name to the object
    } // Parameterized constructor

    // Getter and Setter methods
    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}

public class Main
{
    public static void main(String[] a)
    {
        // Creating Human objects
        Human obj = new Human(); // Default constructor
        Human obj1 = new Human(25, "kalyani"); // Parameterized constructor

        // Printing obj (default constructor) - Expected: null : 0
        System.out.println(obj.getName() + " : " + obj.getAge());

        // Printing obj1 (parameterized constructor) - Expected: kalyani : 25
        System.out.print(obj1.getName() + " : " + obj1.getAge());
    }
}
