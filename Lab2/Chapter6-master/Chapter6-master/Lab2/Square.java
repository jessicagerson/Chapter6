package Lab2;

// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.util.Scanner;
public class Square
{
    int[][] square;
    int [] totals;
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square()
    {
       //
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        int sumRows = 0;
        for (int col = 0; col < square[0].length; col++){
                sumRows += square[row][col];
        }
        return sumRows;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        int sumCols = 0;
        for (int row = 0; row < square[0].length; row++){
            sumCols += square[row][col];
        }
        return sumCols;
    }
    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        int MainDiagSum = 0;
    
        for (int row = 0; row < square.length; row++)
        {
            
                MainDiagSum += square[row][row];
            
        }
    
        return MainDiagSum;
    }
    
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
         int OtherDiagSum =0;
         for (int row = 0; row <square.length ; row++)
        {
            
                OtherDiagSum += square[row][(square.length - 1) - row];
            
        }
         return OtherDiagSum;
    }
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        //Change to work correctly
        //Test all row values
        int index =0;
        for(int row = 0; row < square.length; row++) {
            int total1 = sumRow(row);
            totals[index] = total1;
            index++;
        }
        for(int col = 0; col < square[0].length; col++) {
            int total2 = sumCol(col);
            totals[index] = total2;
            index++;
        }
        totals[index] = sumMainDiag();
        index++;
        totals[index] = sumOtherDiag();
        
        boolean isMagic = true;
        int first = totals[0];
        
        //Check total values:
        for(int val : totals) {
            System.out.print(val + ", ");
        }
        for(int i = 0; i < totals.length; i++) {
            if(first != totals[i]) {
                isMagic = false;
            }
        }
        return isMagic;
    }
    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
     public void setSquare(int[][] sq)
    {
        this.square = sq;
        totals = new int[sq.length*2 + 2];
    }
   
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for(int row = 0; row < square.length; row++) {
            for(int col =0; col < square[0].length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
        
     }
}
