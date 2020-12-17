/* Coins.java coded on 08/03/2019.*/

package week02;

import java.util.Random;

/**An application that represents the results of a serie of coin tosses.
 * @author Rhea Villafuerte
 */

public class Coins{

    /** Boolean datafield HEADS.*/
    public static final boolean HEADS = true;
    /** Boolean datafield TAILS.*/
    public static final boolean TAILS = false;

    /** Boolean[] datafield coins.*/

    private boolean[] coins;


    /**Main method creates a boolean array to pass to the  constructor.
    @param args Command line arguments*/  
    public static void main(String[] args) {
        boolean[] b = {HEADS, TAILS, HEADS, HEADS, TAILS};
        Coins c = new Coins(b);
      
        System.out.println(c.countHeads());
        System.out.println(c.toString());
        
    }
    /**A Constructor cointained in an array. 
       @param coins */
    public Coins(boolean[] coins) {
        this.coins = coins;
    }
    /**A Constructor of Coins.
       @param c String*/
    public Coins(String c){
        coins = new boolean[c.length()];
       
            
        for (int i = 0 ; i < c.length() ; i++){

            if  (c.charAt(i) == 'H') {

                coins[i] = HEADS ;
            } else {
                coins[i] = TAILS;
        
            }
      


        }
    }
    /**A Constructor of Coins.
       @param length */
    public Coins(int length){
        coins = new boolean[length] ;
        Random rand = new Random();
                   
        for(int i = 0 ; i < length ; i++){
            coins[i] = rand.nextBoolean();
        }
    }

    /** a method that returns an int number of faces of the coin.
        @return numberOfHeads*/
    public int countHeads(){

        
        int numberOfHeads = 0;

        for (int i = 0 ; i < coins.length; i++){
            
            if  (coins[i] == HEADS){
                numberOfHeads++;
            }
        }
        return numberOfHeads;
        
    }

    /**A  method to return a String of Hs or Ts.
       @return CoinToss*/
    public String toString(){
        String coinToss = "";
    
        for (int i = 0 ; i < coins.length ; i++){
      

            if  (coins[i] == HEADS){

                coinToss += "H";
        
            } else{
                
                coinToss +=  "T";
            }
        }
        return coinToss; 
    }
    


    /**A  method that counts the runs of heads and tails.
       @return finalCount*/
    public int countRuns(){
     
        boolean currentOutcome = true;
        
        int finalCount = 1;
        
    
  
  
        for (int i = 1 ; i < coins.length; i++){

            
            if (coins[i] != coins[i-1]){ 
        
                finalCount++;
       
        
            } else {
                finalCount = finalCount;
               
               
            }
        }
        

       
        
     
      
        return finalCount;
    }

   
}


