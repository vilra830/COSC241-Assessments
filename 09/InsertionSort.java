package week09;

/**
 *  A silly sort implementation which is able to be observed through its
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
        super(nums); // pass nums[] to the superclass Sort
    }

    /**
     * Sort the integers (which are stored in the parent Sorter class).
     */
    public void sortNums() {
        // int i, j, comparisons, and nums[] are all protected datafields in
        // the superclass Sort so we can use them without declaring them
        
        for (int p = 1; p < nums.length; p++) {
            int key = nums[p];
            i = p - 1;
            while (i >=0 &&nums[i]> key){
                nums[i+1]=nums[i];
                i --;
                update();
                           
            }
            nums[i+1] = key;
              
        }

    }
}

