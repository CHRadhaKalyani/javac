package src;

public class Main
{
   public static void main(String a[])
   {
       AdvCalc obj = new AdvCalc();
       int r1 = obj.add(5,5);
       int r2 = obj.sub(15,10);
       int r3 = obj.multi(7,3);
       int r4 = obj.div(15,3);

       System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);


   }
}
