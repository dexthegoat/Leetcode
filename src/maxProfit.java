import java.util.Stack;

public class maxProfit {

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(new maxProfit().maxProfit(arr));

    }

    public int maxProfit(int[] prices){
        int max = 0, maxSoFar = 0;
        for(int i=1; i<prices.length; ++i){
            max = Math.max(0,max += prices[i] - prices[i-1]);
            maxSoFar = Math.max(max,maxSoFar);
        }
        return maxSoFar;
    }
}
