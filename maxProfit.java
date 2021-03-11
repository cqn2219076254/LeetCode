public class maxProfit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 3, 5, 6, 2}));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int max = 0;
        for(int i=1; i<n; i++){
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }
}
