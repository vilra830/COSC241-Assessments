package week10;


import java.util.*;


/**
 *An interface used by EP.java.
 *
 *@author Rhea Villafuerte
 */


public interface ExamPile {
  
    /** A method that adds an array of integers.
     *@param items int array 
     */
    public void load(int[] items);
    
    /** A method that returns the size of the items.
     *@return int size of the items
     */
    public int size();
    
    /** A method that returns top of the items.
     *@return int top of the items
     */
    public int peek();
    
    /** A method that returns the top of items after being marked. 
     *@return int removed top of the items
     */
    public int mark();

    
    /**A method that moves top of the item to the bottom.
     *
     */
    public void delay();
} 
