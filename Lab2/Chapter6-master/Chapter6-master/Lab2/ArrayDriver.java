package Lab2;

public class ArrayDriver
{
    // instance variables - replace the example below with your own

    public static void main(String[] args)
    {
        int[][] arr = {{1, 1, 1}, {1, 1, 1}};
        System.out.println(ArrayCalculations.averageArray(arr));
        
        int [] a = ArrayCalculations.sumColumns(arr);
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        
        
        
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
        int [][] b = ArrayCalculations.squareArray(arr2);
            for (int row = 0; row < b.length; row++){
            for (int col = 0; col < b[0].length; col++){
                System.out.println(b[row][col]);
            }
        }
    }

}
