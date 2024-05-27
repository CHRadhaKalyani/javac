package src;

public class RandomNum
{
    public static void main(String[] args) {

        //Multi - Dimensional Array with Random numbers assigned
        // Math.Random

        int[][] num = new int[3][4];

        for (int j = 0; j < 3; j++)
        {
            for (int k = 0; k < 4; k++)
            {
                num[j][k] = (int) (Math.random() * 100);   // multiplication is done before casting
                                                          //because of operator precedence in Java
            }
            System.out.println();
        }

        for (int j = 0; j < 3; j++)
        {
            for (int k = 0; k < 4; k++)
            {
                System.out.print(num[j][k] + " ");
            }
            System.out.println();
        }


    }
}
