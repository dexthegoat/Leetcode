public class HouseRobber {

    public static void main(String[] args) {
        int[] house = {2, 7, 9, 3, 1};
        System.out.println(new HouseRobber().rob(house));
    }

    public int rob(int[] nums) {
        int curMax = 0;
        int prevMax = 0;
        for (int x : nums) {
            int temp = curMax;
            curMax = Math.max(prevMax + x, curMax);
            prevMax = temp;
        }
        return curMax;
    }
}
