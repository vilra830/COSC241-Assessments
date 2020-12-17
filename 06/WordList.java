package week06;

public class WordList {

    // The first word in this WordList.
    private String first;

    // The remaining words in this WordList.
    private WordList rest;

    // Creates a new empty WordList.
    public WordList(){
        this.first = "";
        this.rest = null;
        
    }

    // Creates a new WordList consisting of `word' joined to the
    // front of `rest'.
    private WordList(String word, WordList rest){
    this.first = word;    
    this.rest = rest;
    
    }
    // Returns a new WordList by adding `word' to this WordList.
    public WordList add(String word){
        return new WordList(word, this);
    }

    // Returns true if this WordList contains `word' otherwise false.
    public boolean contains(String word){
        boolean a = true;
        if (this.first == ""){
            return false;
            
        }else if(this.first.equals(word)) {
            
            return true;
            
        } else {
           return  rest.contains(word);
        } 
    }

    // Returns true if this WordList is empty, otherwise false.
    public boolean isEmpty(){
        return first == "";

    }
    
    

    // Returns how many words are in this WordList.
    public int size(){
        if (isEmpty()){
        return 0;
              
    } else {
        return 1 + rest.size();

    }
    }

    // Returns a String representation of this WordList consisting of
    // each word in the order they were added separated by spaces.
    public String toString(){
        if (isEmpty()){
        return "";
        }else if (size() == 1){
            return first ;
    } else {
              
        return rest.toString() + " " + first;
    }
}
}
