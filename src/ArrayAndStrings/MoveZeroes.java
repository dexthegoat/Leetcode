package ArrayAndStrings;

import java.util.Arrays;

/**
 * Given an array nums, write a function to move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void moveZeroes(int[] nums) {
//        if(nums.length == 0) return;
//        int insertPos = 0;
//        for(int n : nums){
//            if(n != 0) nums[insertPos++] = n;
//        }
//        while (insertPos < nums.length){
//            nums[insertPos++] = 0;
//        }
        if (nums.length == 0) return;
        int insertPos = 0;
        for (int n : nums) {
            if (n != 0) nums[insertPos++] = n;
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

}
