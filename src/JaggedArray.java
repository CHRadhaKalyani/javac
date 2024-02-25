package src;

public class JaggedArray {

        public static void main(String[] args) {
            int[][] nums = new int[3][]; // jagged

            nums[0] = new int[4];
            nums[1] = new int[2];
            nums[2] = new int[3];

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {

                    nums[i][j] = (int) (Math.random() * 10);

                }
            }
            // loop through each row of the jagged array
            for (int[] num : nums) {
                // loop through each column of the current row
                for (int j = 0; j < num.length; j++) {
                    System.out.println(num[j]);
                }
            }
        }}