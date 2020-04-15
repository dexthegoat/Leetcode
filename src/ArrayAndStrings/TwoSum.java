package ArrayAndStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
    }

    protected int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int needs = target - nums[i];
            if(map.containsKey(needs)){
                return new int[] {map.get(needs),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No result");
    }
}
