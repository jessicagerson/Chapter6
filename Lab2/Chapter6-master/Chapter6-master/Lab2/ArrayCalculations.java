package Lab2;


public class ArrayCalculations
{
    // instance variables - replace the example below with your own
    
    /**
     * Constructor for objects of class ArrayCalculations
     */
    public static double averageArray(int[][] nums)
    {
        double sum = 0;
        for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[0].length; col++){
                sum += nums[row][col];
            }
        }
        return sum/(nums.length*nums[0].length);
    }

  
    
    public static int[] sumColumns(int[][] nums){
        int[] result = new int[nums[0].length];
        
        for (int col = 0; col < nums[0].length; col++){
            int sum = 0;
            for (int row = 0; row < nums.length; row++){
                sum += nums[row][col];
            }
            result[col] = sum;
        }
        return result;
    }
    
    public static int[][] squareArray(int[][] nums){
        int[][] result = new int[nums.length][nums[0].length];
        
            for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[0].length; col++){
                result[row][col] = nums[row][col]*nums[row][col];
            }
        }
        return result;
    }
}
