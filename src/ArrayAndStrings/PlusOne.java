package ArrayAndStrings;

/**
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 */

public class PlusOne {

    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits){
        int len = digits.length;
        for(int i=len-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArr = new int[len+1];
        newArr[0] = 1;
        return newArr;
    }
}
