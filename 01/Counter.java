/* Counter.java coded on 01/03/2019.
 */


package week01;


import java.util.Scanner;

/** An application that counts the number of words and line of a given input.
  @author Rhea Villafuerte 
 */
public class Counter{
    /**method that prints out no. of lines and words
       @param args Command Line argumets. Not used.
    */
    
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int lineCount = 0 , wordCount = 0;

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            lineCount++;
            Scanner words = new Scanner(line);
            while(words.hasNext()){
                wordCount++;
                words.next();
            }
          
        }
        
        System.out.println("lines: "+ lineCount);
        System.out.println("words: "+ wordCount);
        
        
    }
}
