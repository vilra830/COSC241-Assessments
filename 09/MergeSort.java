package week11;

/**
 *  A silly sort implementation which is able to be observed through its
 *  Sorter superclass.
 *
 * @author Iain Hewson
 */
public class MergeSort extends Sorter {

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

    
   public void  MergeSort(int left , int rights) {
        if (left<right){
            int mid = (left + right) / 2;
            mergeSort(left , mid);
            mergeSort(mid + 1 , right);
            merge(left, mid +1 , right);
        }
    }
    
    public void merge(int left ,  int mid , int right){
        int[] temp = new int[right-left];
        for(i = 0; i < nums.length ; i ++){
            nums[i] = temp[i];
            i = left;
            j = left;
            int k = mid;
        }
        while (i < mid and k <=right){
            if (temp[i] < temp[k]){
                nums[j++] = temp[i++];
            }else {
                nums[j++] = temp[k++];
            }
        }
        while(i < mid){
            nums[j++] = temp[i++];
        }
        while (j <= right){
            nums[j++] = temp[k++];

        }
    }
            
                

}
    
