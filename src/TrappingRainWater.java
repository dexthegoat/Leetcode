/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * Example:
 *
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */
public class TrappingRainWater {

    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(new TrappingRainWater().trap(arr));
    }

    // 双指针
    public int trap(int[] height) {

        if (height.length <= 2) return 0;
        int max = 0, maxIndex = 0;

        for (int i = 0; i < height.length; i++) {
            if (height[i] > max) {
                max = height[i];
                maxIndex = i;
            }
        }

        int water = 0, b = 0;
        for (int a = 0; a < maxIndex; a++) {
            if (height[a] < height[b])
                water += height[b] - height[a];
            if (height[a] > height[b])
                b = a;
        }

        int water2 = 0, b2 = height.length - 1;
        for (int a2 = height.length - 1; a2 > maxIndex; a2--) {
            if (height[a2] < height[b2])
                water2 += height[b2] - height[a2];
            if (height[a2] > height[b2])
                b2 = a2;
        }

        return water + water2;
    }

}
