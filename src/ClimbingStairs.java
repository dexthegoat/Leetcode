public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(new ClimbingStairs().climbStairs(10));
    }

    public int climbStairs(int n) {
        int[] temp = new int[n+1];
        return helper(0,n,temp);
    }

    private int helper(int i, int n, int[] temp){
        if(i > n) return 0;
        if(i == n) return 1;
        if(temp[i] >0) return temp[i];
        temp[i] = helper(i+1, n, temp) + helper(i+2, n, temp);
        return temp[i];
    }
}
