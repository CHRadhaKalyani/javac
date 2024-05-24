package src;

class Computer
{
    public void playMusic()
    {
        System.out.println("playing music");
    }
    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "pen";
        else
            return "Nothing";
    }
}
public class MethodDemo
{
    public static void main(String [] args)
    {
       Computer com = new Computer();
       com.playMusic();
       String str = com.getMeAPen(5);
        System.out.print(str);
    }

}
