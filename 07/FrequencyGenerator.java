package week07;

import java.util.*;
import java.io.*;


/**A class that generates new word using letter frequencies.
 * @author Rhea Villafuerte
 */
public class FrequencyGenerator implements WordGenerator {
    /** datafield for pseudorandom.*/
    private Random random;
  
    /** array of weights of letters of alphabet.*/
    private double [] w  ; 

    /** letters of the alphabet.*/
    private final int alphalen = 26;
  
    /**Constructor of new word generator using letter-frequencies.
     * @param r - pseudorandom
     */
    public FrequencyGenerator(Random r) {
        random = r;
        File file = new File("letter-frequencies.txt");
    
        try{
            Scanner sc = new Scanner(file);
            w = new double[alphalen];
            for(int i = 0 ; sc.hasNextDouble() ; i++){
                w[i] = sc.nextDouble();
            }
            sc.close();
      
      
        } catch (FileNotFoundException e){
            System.out.println("File Not Found. Please try again.");
        }
    
    }
  
    /**Gnerates new word using random.
     * @param n length of word
     * @return new word
     */
    public String nextWord(int n) {
       
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < n; i++) {
            char c = (char) ('a' + chooseIndex());
            result.append(c);
        }
        return result.toString();
    }
  
  
    /**Choosing index of letter using instance of random.
     *@return letter index
     */
    public double chooseIndex(){
        int i = 0 ;
        double r = random.nextDouble();
    
        while (r > w[i]){
            r = r - w[i];
            i++;
        }
        return i;
    }
}

  
