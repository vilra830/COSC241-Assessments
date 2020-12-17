package week11;

/**
 *  A quick sort  implementation which is able to be observed through its
 *  Sorter superclass.
 *
 * @author Rhea Villafuerte
 */
public class QuickSort extends Sorter {

    /**
     *  Create a new QuickSort sorter  with the given integers to sort.
     *
     * @param nums the integers to sort.
     */
    public QuickSort(Integer[] nums) {
        super(nums); // pass nums[] to the superclass Sort
    }
    
    /**
     * Sort the integers (which are stored in the parent Sorter class).
     */
    public void sortNums() {
        comparisons = 0;
        quickSort(0, nums.length-1);
    }

    /**Recursive QuickSort method.
     *@param left left index
     *@param right right index
     */
    public void quickSort(int left, int right){
        if (left < right){
            int p = partition(left , right);
            quickSort(left, p);
            quickSort(p+1 , right);
        }
    }
    /**Partitions the array.
     *@param left left index of pivot
     *@param right right index of pivot
     *@return hole hole index
     */      
    public int partition(int left, int right){
        int pivot = nums[left];
        int hole = left;
        i = left+1;
        j = right;
        while(true){
            while(j > hole && nums[j] >= pivot){
                comparisons+=2;
                j--;
            }
            if(j == hole){
                comparisons++;
                break;
            }
            nums[hole] = nums[j];
            hole = j ;
            while(i < hole && nums[i] < pivot){
                comparisons+=2;
                i++;
            }
            if (i == hole){
                comparisons++;
                break;
            }
            nums[hole] = nums[i];
            hole = i;
            update();
        }
        nums[hole] = pivot;
        return hole;
    }
}

 
