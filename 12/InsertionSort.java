package week12;

/**
 *  An insertion sort implementation which is able to be observed through its
 *  Sorter superclass.
 *
 * @author Iain Hewson
 */
public class InsertionSort extends Sorter {

    /**
     *  Create a new InsertionSort sorter with the given integers to sort.
     * 
     * @param nums the integers to sort.
     */
    public InsertionSort(Integer[] nums) {
        super(nums);
    }

    /**
     *  Sort the integers (which are stored in the parent Sorter class)
     *  using insertion sort.
     */
    public void sortNums() {
        for(int p = 1 ; p < nums.length ; p++){
            int key = nums[p];
            i = p-1;
            while(i >= 0 && nums[i] > key){
                nums[i+1] = nums[i];
                update();
                i--;
               
                
            }
            
            nums[i+1] = key;
           
            
    }

}
}



       
   
       
    
