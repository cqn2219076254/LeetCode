import java.util.*;

public class maxProfit2 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for(int i=1; i<n; i++){
            if(prices[i] > prices[i-1]){
                profit = profit + prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
