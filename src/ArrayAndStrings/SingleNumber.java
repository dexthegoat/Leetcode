package ArrayAndStrings;
//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public class SingleNumber {

    public static void main(String[] args) {
        //两次异或等于同一个数会变回来
        int[] arr = {1,1,4,7,7,8,8,9,9};
        System.out.println(new SingleNumber().singleNumber(arr));
        System.out.println(13^9);
    }

    private int singleNumber(int[] nums){

        int res = 0;
        for (int i=0; i!= nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
