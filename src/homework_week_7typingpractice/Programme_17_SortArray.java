package homework_week_7typingpractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Programme_17_SortArray {
    public static void main(String[] args) {
        // Numeric Array declartion
        int [] numArray = {
                1789,  2035,  1899 , 2040, 1950  , 2255 ,  7897 , 1455 , 787 };
         // String Array declaration
        String [] strArray = {
                " Alhes ", "Bravo" ," Delta" , " Hotel", "Mike" ,  "Sierra", " Peter" , " Killo"};
        System.out.println(" Actual Numerical Array was: " +  Arrays.toString(numArray));
        // Sorting the array
          Arrays.sort(numArray);
        System.out.println( " Sorted Numerical Array is; " + Arrays.toString(numArray));
        System.out.println(" ");
        System.out.println(" Acutal String Array was: " + Arrays.toString(strArray));
        // Sorting the array
        Arrays.sort(strArray);
        System.out.println(" Sorted String is; " +Arrays.toString(strArray));
        }
    }

