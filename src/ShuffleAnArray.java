import java.util.Arrays;
import java.util.Random;

/**
 // Init an array with set 1, 2, and 3.
    int[] nums = {1,2,3};
    ShuffleAnArray solution = new Solution(nums);

 // Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
    ShuffleAnArray.shuffle();

 // Resets the array back to its original configuration [1,2,3].
    ShuffleAnArray.reset();

 // Returns the random shuffling of array [1,2,3].
    ShuffleAnArray.shuffle();
 */
public class ShuffleAnArray {

    private int[] array;
    private int[] original;

    Random rand = new Random();

    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public ShuffleAnArray(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        ShuffleAnArray saa = new ShuffleAnArray(arr);
        int[] newOne = saa.shuffle();
        System.out.println(Arrays.toString(newOne));
        int[] original = saa.reset();
        System.out.println(Arrays.toString(original));

    }
}
