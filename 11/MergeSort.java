package week11;

/**
 *  A merge sort  implementation which is able to be observed through its
 *  Sorter superclass.
 *
 * @author Rhea Villafuerte
 */
public class MergeSort extends Sorter {


    /**Creates a copy of nums.*/
    private int[] temp;

    /**
     *  Create a new MergeSort sorter with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    public MergeSort(Integer[] nums) {
        super(nums); // pass nums[] to the superclass Sort
    }

    /**
     * Sort the integers (which are stored in the parent Sorter class).
     */

    public void sortNums(){
        this.temp = new int[nums.length];
        comparisons = 0 ;
        mergeSort(0 ,  nums.length-1);
    }
    
    /**Recursive method that uses a divide and conquer strategy.
     *@param left left index
     *@param right right index
     */
    public void  mergeSort(int left , int right) {
        if (left<right){
            comparisons++;
            int mid = (left + right) / 2;
            mergeSort(left , mid);
            mergeSort(mid + 1 , right);
            merge(left, mid +1 , right);
        }
    }
    /**Merges the sorted arrays back together.
     *@param left left index
     *@param mid middle index
     *@param right right index
     */
    public void merge(int left ,  int mid , int right){
        
        for(i = 0; i < nums.length ; i ++){
            this.temp[i] = nums[i];
           
        }
        i = left;
        j = left;
        int k = mid;
        while (i < mid && k <=right){
            comparisons +=2;
            if (temp[i] < temp[k]){
                comparisons++;
                nums[j++] = temp[i++];
            }else {
                comparisons++;
                nums[j++] = temp[k++];
            }
            update();
        }
        while(i < mid){
            comparisons++;
            nums[j++] = temp[i++];
            
        }
        while (j <= right){
            nums[j++] = temp[k++];
            update();

        }
    }
            
                

}
    
