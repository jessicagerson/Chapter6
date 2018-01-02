package Lab1;

// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//          
// ****************************************************************
import java.util.Scanner;
public class IntegerList{
    int[] list; //values in the list
    Scanner scan = new Scanner(System.in);
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;
        }
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++){
            System.out.println(i + ":\t" + list[i]);
        }
    }
    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
       for (int i = 0; i < list.length; i++){
           if (list[i] == target){
               return i;
            }
            
        }
        return -1;
    }
    //-------------------------------------------------------
    //sort the list into ascending order using the selection sort algorithm
    //-------------------------------------------------------
    public void selectionSort()
    {
        int smallest;
        for (int i=0; i < list.length-1; i++)
            {
                //find smallest element in list starting at location i
                smallest = i;
                for(int j = i; j < list.length - 1; j++) {
                    if (list[j] < list[i]){
                        smallest = j;
                    }
                }

                //swap list[i] with smallest element
                int temp = list[i];
                list[i] = list[smallest];
                list[smallest] = temp;
                
            }
    }
    
    public void replaceFirst(int oldVal, int newVal){
        int loc = search(oldVal);
        if(loc != -1) {
            list[loc] = newVal;
        }
        
        
    }
    
    public void replaceAll(int oldVal, int newVal){
        int loc = search(oldVal);
        while(loc != -1) {
            replaceFirst(oldVal, newVal);
            loc = search(oldVal);
        }
        
    }
}