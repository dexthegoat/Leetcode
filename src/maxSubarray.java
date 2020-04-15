/**
 * 给定一个整数数组nums，找到具有最大和的连续子数组（至少包含一个数字）并返回其和。
 * 贪心算法和动态编程
 */
public class maxSubarray {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new maxSubarray().maxSubArray1(arr));//6
        System.out.println(new maxSubarray().maxSubArray2(arr));//6
    }

    public int maxSubArray1(int[] nums) {
        int cur = nums[0], max = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            cur = Math.max(nums[i], cur += nums[i]);
            max = Math.max(cur, max);
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        int max = nums[0];

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i - 1] > 0) nums[i] += nums[i - 1];
            max = Math.max(nums[i], max);
        }
        return max;
    }
}
