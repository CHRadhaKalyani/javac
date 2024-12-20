package src;

class Animal
{
    int age;
    String name;
    public Animal()
    {}
    public Animal(int age, String name)
    {
        this.age = age;
        this.name = name;
    }
    public void makeNoise()
    {
        System.out.println("Hello, I am an Animal");
    }
    public void eat()
    {
        System.out.println("Much , Much , Much");
    }

    protected void doSomethingPrivate()
    {
        System.out.println("Hey this method is private");
    }

}

class Cat extends Animal{
    String catFood;

    public Cat(int age, String name, String catFood)
    {
        super(age, name);
        this.catFood = catFood;
    }
    @Override
    public void makeNoise()
    {
        super.makeNoise();
        System.out.println("Meow!");

        eat(); // or super.eat(); to call eat method from superclass
        super.doSomethingPrivate();


    }
}

public class SuperDuper
{
    public static void main(String[] args)
    {
        Cat mycat = new Cat(3, "Blacky", "Tuna");
        mycat.makeNoise();
        mycat.eat();



    }
}
