class Human1
{
    private int age;
    private String name;

    public int getAge()
    {
        return age;
    }

// if you declared int age inside the method, then it becomes a local variable of that method.
//            public int getAge()
//            {
//                int age=20;
//                return age;
//            }   then you can't use the variable age in setAge method, because it's not a class method anymore.
    public void setAge(int a)
    {
        age = a;
    }
//    setters usually return void, This emphasizes that the method’s purpose
//    is to perform an action (setting a value) rather than producing a result.
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
}
public class Demo
{
  public static void main(String[] args)
  {
     Human1 obj = new Human1();
     obj.setAge(20);
     obj.setName("Radha");
     System.out.println(obj.getName() + ":" + obj.getAge());
  }
}
