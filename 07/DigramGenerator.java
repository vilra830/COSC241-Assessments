package week07;

import java.util.*;
import java.io.*;
/**A class that generates word.
 * Uses random among the subsequent letters associated
 * with the previous letter of the randomly chosen first letter
 * @author Rhea Villafuerte
 */
public class DigramGenerator implements WordGenerator {
  
    /** datafield for pseudorandom.*/
    private Random random;
  
    /** Array of chars firstletters.txt.*/
    private char[] firstletters;
  
    /** Array of String continuations.txt.*/
    private String [] continuations;

    /** letters of the alphabet.*/
    private final int alphalen = 26;
  
    /**Word generator using random letters of associated with previous letter.
     * First letter randomly chosen using instance of random.
     * @param r - pseudorandom
     */
    public DigramGenerator(Random r) {
        random = r;
    
        File file = new File("first-letters.txt");
    
        try{
            Scanner sc = new Scanner(file);
            String text = sc.nextLine();
            sc.close();
            firstletters = new char[text.length()];
            for(int i = 0; i < text.length() ; i++){
                firstletters[i] = text.charAt(i);
        
            }
        } catch (FileNotFoundException e){
      
            System.out.println("File Not Found. Please try again.");
        }
    
        File file1 = new File("continuations.txt");
        
        try{
            Scanner sc1 = new Scanner(file1);
            continuations = new String [alphalen];
            for(int i = 0 ; sc1.hasNextLine() ; i++){
                
                continuations[i] = sc1.nextLine();
            }
      
        }catch (FileNotFoundException e){
      
            System.out.println("File Not Found. Please try again.");
        }
    
    
    
    
    
    
    }
  
    /**generates new word from random.
     * @param n length of word
     * @return new word
     */
    public String nextWord(int n) {
    
        
        StringBuilder result = new StringBuilder();
        int index = random.nextInt(firstletters.length);
        char firstletter = firstletters[index];
        result.append(firstletter);
        char firstletter1 = firstletter;
    
    
        for(int i = 1 ; i < n ; i++){
            int index1 =random.nextInt(continuations[firstletter-'a'].length());
            char nextletter = continuations[firstletter - 'a'].charAt(index1);
            result.append(nextletter);
            firstletter = nextletter;
      
      
        }
    
    
        return result.toString();
    }
  
}
