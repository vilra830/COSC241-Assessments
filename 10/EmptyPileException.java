package week10;
/**
 * ExamPile exception.
 *
 * @author Rhea Villafuerte
 *
 */

public class EmptyPileException extends RuntimeException{
    /**
     * Constructor for PileExceptions.
     *Pass the message up to the parent class (the Runtime Exception) to get
     *Runtime Exception behaviour accompanied by the pass up message
     *@param message 
     */
    public EmptyPileException(String message) {
        
        super(message);
    }
    /**serialVersionUID declared.*/
    final static long serialVersionUID = 123;  

}
