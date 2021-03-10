import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = n - 1;
            for(; left<=right; left++){
                if(left > i+1 && nums[left] == nums[left-1]) continue;
                while(left < right && nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
                if(left >= right) break;
                if(nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
