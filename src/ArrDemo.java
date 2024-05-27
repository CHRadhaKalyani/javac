package src;

public class ArrDemo
{
    public static void main(String[] args)

    {
        //Single - Dimensional Array

        int[] nums = new int [5];
        nums [0]=10;
        nums [1]=20;
        nums [2]=30;

        for(int i=0;i<=4;i++)
        {
            System.out.println(nums[i]);
        }


        //Multi - Dimensional Array

        int[][] nums1 = new int [3][4];

        for(int j=0;j<3;j++)
        {
           for(int k=0;k<4;k++)
           {
               System.out.print(nums1[j][k] + " " );
           }
           System.out.println();
        }
        

    }
}
