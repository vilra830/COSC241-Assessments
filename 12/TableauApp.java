

package week12;

import java.util.ArrayList;

/**
 *  Practical test 2 - Part A
 *
 *  An array based implementation of Young's tableau.
 *
 * @author Iain Hewson
 */
public class TableauApp {

    /**
     * The main method is just used for testing.
     *
     * @param args command line arguments are not used.
     */
    public static void main(String[] args) {
        final int[][] valid = {{1, 4, 5, 10, 11}, {2, 6, 8}, {3, 9, 12}, {7}};
        System.out.println(TableauApp.toString(valid));
    }

    /**
     * Determines whether the array passed to it is valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean isTableau(int[][] t){
        return rowLengthsDecrease(t) && rowValuesIncrease(t) &&
            columnValuesIncrease(t) && isSetOf1toN(t);
    }

    /**
     *  Returns a string representation of a tableau.
     *
     * @param t a two-dimensional array which should be a tableau.
     *
     * @return a string representation of a tableau.
     */
    public static String toString(int[][] t) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                result.append(String.format("%-4s", t[i][j]));
            }
            if (i < t.length-1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    /**
     * Determines whether the array passed to it is valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean rowLengthsDecrease(int[][] t) {
        for(int row = 0 ; row<t.length-1 ; row++){
            if(t[row].length <  t[row+1].length){
                return false;
            }
        }
        return true;
        
    }

    /**
     * Determines whether the array passed to it is valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean rowValuesIncrease(int[][] t) {
        boolean a = true;
        for(int row = 0 ;  row<t.length ; row++){
            for(int col = 0 ; col < t[row].length-1; col++){
                if(t[row][col] <  t[row][col+1]){
                    a = true;
                }else {
                    a = false;
                }
            }
        }
        return a;               

    }

    /**
     * Determines whether the array passed to it is valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean columnValuesIncrease(int[][] t) {
        for(int col  = 0 ;  col < t[0].length ; col++){
            for(int row  = 0 ; row <t.length-1 ; row++){
                if (col < t [row+1].length ){
                    if(t[row][col] >= t[row+1][col]){
                        return false;
        
                    }
                }
            }
        }
        return true;
    }

    /**
     * Determines whether the array passed to it is valid tableau or not.
     *
     * @param t a two-dimensional array to test for tableau-ness.
     *
     * @return true if the parameter is a valid tableau, otherwise false
     */
    public static boolean isSetOf1toN(int[][] t) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int row = 0 ; row<t.length ; row++){
            for(int col = 0 ; col<t[row].length ; col++){
                arr.add(t[row][col]);
                if(!arr1.contains(t[row][col])){
                        arr1.add(t[row][col]);
                    }
            }
        }
                    for(int i = 0 ; i < arr.size() ; i++){
                        if(arr.size() != arr1.size()){
                            return false;
                        } else if (arr.get(i) == 0 || arr.get(i) > arr.size()){
                            return false;

                        }
                    }
                    return true;
    }
}
