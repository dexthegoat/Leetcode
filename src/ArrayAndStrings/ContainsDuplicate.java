package ArrayAndStrings;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {

    public static void main(String[] args) {

    }

    private boolean containsDuplicate(int[] nums){
        for (int i=0; i<nums.length; i++){
            int temp = nums[i];
            for (int j=1; j<nums.length; j++){
                if (i == j) break;
                if(temp == nums[j]) return true;
            }
        }
        return false;
    }

}
