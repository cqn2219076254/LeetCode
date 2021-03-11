public class minSubArrayLen {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1, 1, 11}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int n = nums.length;
        for(; high<n; high++) {
            sum += nums[high];
            if(sum >= target) {
                while(low < high) {
                    sum -= nums[low];
                    low++;
                    if(sum < target){
                        low--;
                        sum += nums[low];
                        break;
                    }
                }
                ans = Math.min(ans, high-low+1);
            }
        }
        return sum >= target ? ans : 0;
    }
}
